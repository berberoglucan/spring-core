package _20.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserSendMailListener implements ApplicationListener<UserSendMailEvent> {

	@Override
	public void onApplicationEvent(UserSendMailEvent userSendMailEvent) {
		
		User user = userSendMailEvent.getUser();
		
		System.out.println(user);
		
		System.out.println("Mail title : " + userSendMailEvent.getTitle());
		
		System.out.println("Mail content : " + userSendMailEvent.getTitle());
		
	}
	
	
}
