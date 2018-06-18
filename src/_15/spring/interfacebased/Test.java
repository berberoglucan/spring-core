package _15.spring.interfacebased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("_15.applicationContext.xml");
		
		DBConnection mysqlConnection = applicationContext.getBean("mysqlDBConnectionImpl", DBConnection.class);
		
		DBConnection oracleConnection = applicationContext.getBean("oracleDBConnectionImpl", DBConnection.class);
		
		mysqlConnection.openConnection();
		
		mysqlConnection.closeConnection();
		
		oracleConnection.openConnection();
		
		oracleConnection.closeConnection();
		
		applicationContext.close();
		
	}

}
