package _25.spring.aop.afterReturning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	@AfterReturning(pointcut = "execution(public * _25.spring.aop.afterReturning.ProductRepository.findProduct(*))", returning="product")
	public void afterReturning(JoinPoint joinPoint, Product product) {
		
		System.out.println("Metot return ettikten sonra basliyor : " + joinPoint);
		
		System.out.println("Return eden deger : " + product);
		
	}

}
