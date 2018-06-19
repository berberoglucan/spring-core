package _27.spring.aop.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	@Around(value = "pointCut()")
	public void aroundAdvice(ProceedingJoinPoint joinPoint) {
		System.out.println("Around basladi");
		try {
			System.out.println("Around basladi");
			joinPoint.proceed();
			System.out.println("Around bitti");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Pointcut("execution(public void _27.spring.aop.around.ProductRepository.*(..))")
	public void pointCut() {
		
	}
	
}
