package _01.spring.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		
		// DBConnection connection = configurableApplicationContext.getBean(DBConnection.class);
		
		DBConnection connection = configurableApplicationContext.getBean("dbConnection", DBConnection.class);
		
		connection.openConnection();
		
		connection.closeConnection();
		
		configurableApplicationContext.close();
		
	}

}
