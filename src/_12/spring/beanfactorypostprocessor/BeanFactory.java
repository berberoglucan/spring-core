package _12.spring.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactory implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		 
		System.out.println("applicationContext.xml dosyasi okunur. Bean'ler context'e yuklenirken calisir");
		
		System.out.println("Definition bean count : " + beanFactory.getBeanDefinitionCount());
		
		System.out.println("---------------------------------");
	}
	
}
