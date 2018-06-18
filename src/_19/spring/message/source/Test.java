package _19.spring.message.source;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("_19.applicationContext.xml");
		
		String message = applicationContext.getMessage("failure.login.message", null, Locale.UK);
		
		String messageTr = applicationContext.getMessage("failure.login.message", null, new Locale("tr", "TR"));
		
		System.out.println(message);
		
		System.out.println(messageTr);
		
		applicationContext.close();
	}

}
