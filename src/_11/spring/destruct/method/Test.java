package _11.spring.destruct.method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("_11.applicationContext.xml");
		
		DBConnection connection = applicationContext.getBean("dbConnection", DBConnection.class);
		
		connection.openConnection();
		
		applicationContext.close();
		
	}

}
