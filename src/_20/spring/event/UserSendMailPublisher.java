package _20.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserSendMailPublisher {
	
	@Autowired	
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void userRegisterMessage() {
		
		String title = "Kayit onay mesaji";
		
		String content = "Kaydinizi tamamlamak icin asagidaki linke tiklayiniz";
		
		User user = new User("can@gmail.com", "12345", "can", "berberoglu");
		
		UserSendMailEvent event = new UserSendMailEvent(title, content, user);
		
		applicationEventPublisher.publishEvent(event);
	}
	
}
