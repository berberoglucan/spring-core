package _03.spring.constructor.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public DBConnection dbConnection() {
		return new DBConnection("mysql:localhost8080", "admin", "12345");
	}
	
}
