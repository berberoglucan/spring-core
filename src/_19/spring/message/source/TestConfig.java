package _19.spring.message.source;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestConfig {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		String message = applicationContext.getMessage("failure.login.message", null, Locale.UK);

		String messageTr = applicationContext.getMessage("failure.login.message", null, new Locale("tr", "TR"));

		System.out.println(message);

		System.out.println(messageTr);

		applicationContext.close();
	}

}
