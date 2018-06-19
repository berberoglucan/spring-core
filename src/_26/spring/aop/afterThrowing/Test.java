package _26.spring.aop.afterThrowing;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("_26.applicationContext.xml");
		
		ProductRepository productRepository = applicationContext.getBean("productRepository", ProductRepository.class);
		
		Product product = new Product("iphone7", 3500, 2, "phone");
		
		productRepository.saveProduct(product);
		
		
		System.out.println("------------------");
		
		System.out.println(productRepository.findProduct(-1));
		
		applicationContext.close();
		
	}

}
