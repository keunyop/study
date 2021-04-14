package kevin.springboot.sample.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Kevin";
	}
	
	@PostMapping("/users/create")
	public User create(@RequestBody User user) {
		return user;
	}
}
