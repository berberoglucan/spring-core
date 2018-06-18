package _18.spring.component;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestConfig {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		DBConnection dbConnection = applicationContext.getBean(DBConnection.class);

		dbConnection.openConnection();
		
		dbConnection.closeConnection();
		
		applicationContext.close();
		
	}

}
