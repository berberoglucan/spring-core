package _26.spring.aop.afterThrowing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	@AfterThrowing(pointcut = "execution(public * _26.spring.aop.afterThrowing.ProductRepository.findProduct(*))", throwing = "exception")
	public void afterThrowing(JoinPoint joinpoint , RuntimeException exception) {
		
		System.out.println("Metot throw ettikten sonra basliyor " + joinpoint);
		
		System.out.println("Hata :" + exception.getMessage() + "\n");
		
	}
	
}
