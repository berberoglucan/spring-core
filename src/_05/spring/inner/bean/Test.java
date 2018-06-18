package _05.spring.inner.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("_05.applicationContext.xml");
		
		DBConnection connection = applicationContext.getBean("dbConnection", DBConnection.class);
		
		connection.openConnection();
		
		connection.closeConnection();
		
		applicationContext.close();
		
	}

}
