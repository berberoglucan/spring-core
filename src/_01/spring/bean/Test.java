package _01.spring.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// 1

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("_01.applicationContext.xml");

		DBConnection connection = beanFactory.getBean("dbConnection", DBConnection.class);

		connection.openConnection();

		connection.closeConnection();

		// 2

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"_01.applicationContext.xml");

		DBConnection connection2 = applicationContext.getBean("dbConnection", DBConnection.class);

		connection2.openConnection();
		connection2.closeConnection();

		applicationContext.close();

		// 3

		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("_01.applicationContext.xml");

		DBConnection connection3 = applicationContext2.getBean("dbConnection", DBConnection.class);

		connection3.openConnection();
		connection3.closeConnection();

		// 4	

		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("_01.applicationContext.xml");

		DBConnection connection4 = configurableApplicationContext.getBean("dbConnection", DBConnection.class);

		connection4.openConnection();
		connection4.closeConnection();
		
		configurableApplicationContext.close();

	}

}
