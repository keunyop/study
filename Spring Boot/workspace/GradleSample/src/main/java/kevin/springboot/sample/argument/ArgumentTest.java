package kevin.springboot.sample.argument;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

//@Component
public class ArgumentTest {
	
	// Bean의 생성자가 하나만 있고 생성자의 input이 bean이면 spring이 자동으로 해당 bean을 주입해준다.
	public ArgumentTest(ApplicationArguments args) {
		System.out.println(">> programArgs: " + args.containsOption("programArgs"));
		System.out.println(">> vmArgs: " + args.containsOption("vmArgs"));
		
		System.out.println(">> " + System.getProperty("data_source"));
	}
}
