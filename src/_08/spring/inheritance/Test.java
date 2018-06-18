package _08.spring.inheritance;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("_08.applicationContext.xml");
		
		Database mysqlDatabase = applicationContext.getBean("mysqlDatabase", Database.class);
		
		Database oracleDatabase = applicationContext.getBean("oracleDatabase", Database.class);
		
		System.out.println(mysqlDatabase);
		
		System.out.println(oracleDatabase);
		
		applicationContext.close();
		
	}

}
