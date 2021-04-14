package kevin.springboot.sample.mvc;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

//@RunWith(SpringRunner.class)
//@RunWith(SpringRunner.class)
//@WebMvcTest(WebMvcController.class)
public class WebMvcControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void hello() throws Exception {
//		mockMvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string("Hello, WebMvc"));
	}

	@Test
	public void createUser_JSON() throws Exception {

		String userJson = "{\"id\":\"kevin\", \"name\":\"keunyop\"";

		mockMvc.perform(post("/users/create").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
				.content(userJson)).andExpect(jsonPath("$.id", is(equalTo("kevin"))))
				.andExpect(jsonPath("$.name", is(equalTo("keunyop"))));
	}

}
