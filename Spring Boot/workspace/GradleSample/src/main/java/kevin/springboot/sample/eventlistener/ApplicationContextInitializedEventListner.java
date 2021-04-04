package kevin.springboot.sample.eventlistener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationContextInitializedEventListner implements ApplicationListener<ApplicationContextInitializedEvent>{

	@Override
	public void onApplicationEvent(ApplicationContextInitializedEvent event) {
		System.out.println("### ApplicationContextInitializedEvent ###");
	}
}
