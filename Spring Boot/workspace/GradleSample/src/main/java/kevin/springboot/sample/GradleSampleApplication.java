package kevin.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kevin.springboot.sample.eventlistener.ApplicationContextInitializedEventListner;
import kevin.springboot.sample.eventlistener.ApplicationEnvironmentPreparedEventListner;
import kevin.springboot.sample.eventlistener.ApplicationFailedEventListner;
import kevin.springboot.sample.eventlistener.ApplicationStartingEventListner;

@SpringBootApplication
public class GradleSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleSampleApplication.class, args);
		
//		SpringApplication app = new SpringApplication(GradleSampleApplication.class);		
//		app.addListeners(new ApplicationContextInitializedEventListner());
//		app.addListeners(new ApplicationEnvironmentPreparedEventListner());
//		app.addListeners(new ApplicationFailedEventListner());
//		app.addListeners(new ApplicationStartingEventListner());
//		app.setWebApplicationType(WebApplicationType.NONE);
//		app.run(args);
	}

}
