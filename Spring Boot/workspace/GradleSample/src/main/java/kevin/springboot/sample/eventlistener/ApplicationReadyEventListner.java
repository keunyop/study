package kevin.springboot.sample.eventlistener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
public class ApplicationReadyEventListner implements ApplicationListener<ApplicationReadyEvent>{

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		System.out.println("### ApplicationReadyEvent ###");
	}
}
