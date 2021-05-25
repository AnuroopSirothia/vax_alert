package anuroop.vaxalert;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import anuroop.vaxalert.domain.State;
import anuroop.vaxalert.domain.StateList;

@SpringBootApplication
@EnableScheduling
public class AppointmentAvailability {

	private static final Logger log = LoggerFactory.getLogger(AppointmentAvailability.class);

	public static void main(String[] args) {
		SpringApplication.run(AppointmentAvailability.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			// Setting HTTP Header is needed to avoid 403 Forbidden error.
			HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			
            
            ResponseEntity<StateList> stateListResponse = restTemplate.exchange("https://cdn-api.co-vin.in/api/v2/admin/location/states",HttpMethod.GET, entity, StateList.class);
            StateList stateList = stateListResponse.getBody();

			for(State state : stateList.getStates()) {
				log.info(state.getStateName());
			}
			
		};
	}
}