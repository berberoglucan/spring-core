package _19.spring.message.source;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class Config {
	
	@Bean
	public MessageSource messageSource() {
		
		ResourceBundleMessageSource bundleMessageSource = new ResourceBundleMessageSource();
		
		bundleMessageSource.setBasename("messages");
		bundleMessageSource.setDefaultEncoding("UTF-8");
		
		return bundleMessageSource;
	}
	
}
