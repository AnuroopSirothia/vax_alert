package anuroop.vaxalert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import anuroop.vaxalert.domain.Session;
import anuroop.vaxalert.domain.SessionList;

/**
 * Checks for available slots periodically.
 * 
 * @author anuroop
 *
 */
@Component
public class SlotFinder {

	private static final Logger log = LoggerFactory.getLogger(SlotFinder.class);

	private String bangalore_urban_distric_id = "265";
	private String bangalore_rural_distric_id = "276";
	private String bbmp_distric_id = "294";

	private String date = "27-05-2021";

	private String bangalore_urban_district_url = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id=" + bangalore_urban_distric_id  + "&date=" + date ;
	private String bangalore_rural_district_url = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id=" + bangalore_rural_distric_id  + "&date=" + date ;
	private String bbmp_district_url = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id=" + bbmp_distric_id  + "&date=" + date ;

	@Autowired
	private ApplicationContext context;

	private int apiCallCount;

	/**
	 * Slots can be checked 100 times/5 min/IP address. Which means we can check slot 20 times in a minute
	 * which translates to checking slot every 3000 ms.
	 * @throws InterruptedException 
	 */
	@Scheduled(fixedRate = 10000)
	public void fetchSlotInfo() throws InterruptedException {
		// Setting HTTP Header is needed to avoid 403 Forbidden error.
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		RestTemplate restTemplate = context.getBean(RestTemplate.class);

		List<SessionList> districtList = new ArrayList<SessionList>();

		ResponseEntity<SessionList> bangaloreUrbanResponse = restTemplate.exchange(bangalore_urban_district_url,HttpMethod.GET, entity, SessionList.class);
		SessionList bangaloreUrbanSessionList = bangaloreUrbanResponse.getBody();

		// There no slots found in Bangalore Rural. Hence to save API calls not checking Bangalore Rural for sometime.
//		TimeUnit.MILLISECONDS.sleep(3000);
//		ResponseEntity<SessionList> bangaloreRuralResponse = restTemplate.exchange(bangalore_rural_district_url,HttpMethod.GET, entity, SessionList.class);
//		SessionList bangaloreRuralSessionList = bangaloreRuralResponse.getBody();
		
		TimeUnit.MILLISECONDS.sleep(3000);
		ResponseEntity<SessionList> bbmpResponse = restTemplate.exchange(bbmp_district_url,HttpMethod.GET, entity, SessionList.class);
		SessionList bbmpSessionList = bbmpResponse.getBody();

		districtList.add(bangaloreUrbanSessionList);
//		districtList.add(bangaloreRuralSessionList);
		districtList.add(bbmpSessionList);

		findFreeSlots(districtList);
		
		apiCallCount = apiCallCount + 2;
		log.debug("API Call Count = " + apiCallCount);
	}

	/**
	 * Find free slots in all the given districts.
	 * 
	 * @param districtList
	 */
	private void findFreeSlots(List<SessionList> districtList) {

		for(SessionList sessionList : districtList) {

			for(Session session : sessionList.getSessions()) {

				if(session.getMinAgeLimit() < 45) {
					if(session.getAvailableCapacityDose1() > 0) {
						log.info("----- ALERT: Slot found! -----");
						
						SoundUtils.main(null);
						
						log.info("District: " + session.getDistrictName());
						log.info("Address: " + session.getAddress());
						log.info("Name: " + session.getName());

						log.info("Date: " + session.getDate());

						log.info("Dose 1 Capacity: " + session.getAvailableCapacityDose1().toString());

						log.info("Slots: " + session.getSlots().toString());

						log.info("\n");

					}
				}
			}
		}
	}
}