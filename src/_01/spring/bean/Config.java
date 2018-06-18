package _01.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name = "dbConnection")
	public DBConnection dbConnection() {
		return new DBConnection();
	}
	
}
