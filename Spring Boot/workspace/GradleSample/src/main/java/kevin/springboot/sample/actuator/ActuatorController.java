package kevin.springboot.sample.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

	@GetMapping("/helloActuator")
	public String helloActuator() {
		return "Hello, Actuator.";
	}
}
