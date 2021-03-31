package kevin.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleSampleApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GradleSampleApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
	    app.run(args);
	}

}
