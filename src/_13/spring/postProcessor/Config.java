package _13.spring.postProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
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
	public BeanPostProcessor beanPostProcessor() {
		return new PostProcessor();
	}
	
}
