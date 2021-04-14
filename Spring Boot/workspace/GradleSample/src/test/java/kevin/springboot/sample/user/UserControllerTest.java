package kevin.springboot.sample.user;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
class UserControllerTest {
	
	@Autowired MockMvc mockMvc;

	@Test
	void testHello() throws Exception {
		mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().string("Hello, Kevin"));
	}

	@Test
	void testCreate_JSON() throws Exception {
		String userJson = "{\"name\":\"kevin\", \"company\":\"BwG\"}";
		
		mockMvc.perform(post("/users/create")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(userJson))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.name", is(equalTo("kevin"))))
		.andExpect(jsonPath("$.company", is(equalTo("BwG"))));
	}
	
	@Test
	void testCraete_XML() throws Exception {
		String userJson = "{\"name\":\"kevin\", \"company\":\"BwG\"}";
		
		mockMvc.perform(post("/users/create")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_XML)
				.content(userJson))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(xpath("/User/name").string("kevin"))
		.andExpect(xpath("/User/company").string("BwG"));
	}
}
