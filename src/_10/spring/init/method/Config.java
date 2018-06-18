package _10.spring.init.method;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(initMethod = "validate")
	public DBConnection dbConnection() {
		
		DBConnection connection = new DBConnection();
		
		connection.setUrl("mysql:localhost8080");
		connection.setUserName("admin");
		connection.setPassword("123456");
		
		return connection;
	}
	
}
