package _14.spring.property.place.holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
	@PropertySource("classpath:db.properties")
})
public class AppConfig2 {

	@Autowired
	private Environment environment;
	
	@Bean
	public Database database() {
		Database database = new Database();
		database.setUrl(environment.getProperty("url"));
		database.setUserName(environment.getProperty("username"));
		database.setPassword(environment.getProperty("password"));
		return database;
	}
	
}
