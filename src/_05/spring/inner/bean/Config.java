package _05.spring.inner.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public DBConnection connection() {

		Database database = new Database("mysql:localhost8080", "admin", "12345");
		DBConnection connection = new DBConnection();
		connection.setDatabase(database);
		return connection;
	}

}
