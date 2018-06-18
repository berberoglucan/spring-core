package _04.spring.object.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Database database() {
		return new Database("mysql:localhost80808", "admin", "123456");
	}
	
	@Bean
	public DBConnection connection() {
		DBConnection connection = new DBConnection();
		connection.setDatabase(database());
		return connection;
	}
	
}
