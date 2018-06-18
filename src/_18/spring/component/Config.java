package _18.spring.component;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "_18.spring.component")
public class Config {
	
	@Bean
	public Database database() {
		return new Database("localhost8080", "can", "123456");
	}
	
}
