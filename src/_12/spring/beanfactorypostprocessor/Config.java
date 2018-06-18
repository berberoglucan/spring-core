package _12.spring.beanfactorypostprocessor;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(initMethod = "validate", destroyMethod = "closeConnection")
	public DBConnection dbConnection() {
		
		DBConnection connection = new DBConnection();
		
		connection.setUrl("mysql:localhost8080");
		connection.setUserName("admin");
		connection.setPassword("123456");
		
		return connection;
	}
	
	@Bean
	public BeanFactoryPostProcessor beanFactoryPostProcessor() {
		return new BeanFactory();
	}
	
}
