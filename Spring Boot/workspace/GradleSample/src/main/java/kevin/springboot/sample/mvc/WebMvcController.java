package kevin.springboot.sample.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebMvcController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, WebMvc";
	}
	
	@PostMapping("/users/create")
	public User create(@RequestBody User user) {
		return user;
	}
}
