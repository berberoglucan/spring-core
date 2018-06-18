package _14.spring.property.place.holder;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestConfig {

	public static void main(String[] args) {
		
		// ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig2.class);

		Database database = applicationContext.getBean(Database.class);

		System.out.println(database);

		applicationContext.close();

	}

}
