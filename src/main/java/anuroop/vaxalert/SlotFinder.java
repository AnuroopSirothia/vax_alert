package anuroop.vaxalert;

import java.util.Arrays;

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

	@Autowired
	private ApplicationContext context;

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {


		// Setting HTTP Header is needed to avoid 403 Forbidden error.
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		RestTemplate restTemplate = context.getBean(RestTemplate.class);
		ResponseEntity<SessionList> sessionListtResponse = restTemplate.exchange("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id=265&date=26-05-2021",HttpMethod.GET, entity, SessionList.class);
		SessionList sessionList = sessionListtResponse.getBody();

		for(Session session : sessionList.getSessions()) {

			if(session.getMinAgeLimit() < 45) {
				log.info("---------------");
				log.info(session.getAddress());
				log.info(session.getName());

				log.info(session.getDate());

				log.info(session.getAvailableCapacity().toString());
				log.info(session.getAvailableCapacityDose1().toString());
				log.info(session.getAvailableCapacityDose2().toString());

				log.info(session.getMinAgeLimit().toString());
				log.info(session.getSlots().toString());

				log.info("\n");
			}
		}
	}
}
