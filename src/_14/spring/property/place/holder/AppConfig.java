package _14.spring.property.place.holder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "db.properties")
public class AppConfig {
	
	@Value("${url}")
	private String url;
	
	@Value("${username}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	@Bean
	public Database database() {
		return new Database(this.url, this.userName, this.password);
	}

}
