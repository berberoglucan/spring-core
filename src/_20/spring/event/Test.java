package _20.spring.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("_20.applicationContext.xml");
		
		UserSendMailPublisher mailPublisher = applicationContext.getBean("userSendMailPublisher", UserSendMailPublisher.class);
		
		mailPublisher.userRegisterMessage();
		
		applicationContext.close();
	}

}
