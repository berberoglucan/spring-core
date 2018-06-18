package _13.spring.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean olusturulmadan once : " + beanName + " : " + bean);
		System.out.println("-----------------------------");
		return bean;
	} 

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof DBConnection)
			System.out.println("Olusturulan bean DBConnection tipinde");
		System.out.println("Bean olusturulduktan sonra : " + beanName + " : " + bean);
		System.out.println("-----------------------------");
		return bean;
	}
	
	
	
}
