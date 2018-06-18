package _10.spring.init.method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		
		DBConnection connection = applicationContext.getBean(DBConnection.class);
		
		connection.openConnection();
		
		connection.closeConnection();
		
		applicationContext.close();
		
	}

}
