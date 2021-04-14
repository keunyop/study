package kevin.springboot.sample.eventlistener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
public class ApplicationStartedEventListner implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("### ApplicationStartedEvent ###");
	}
}
