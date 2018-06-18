package _14.spring.property.place.holder;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("_14.applicationContext.xml");
		
		Database database = applicationContext.getBean("database", Database.class);
		
		System.out.println(database);
		
		
		applicationContext.close();
		
	}

}
