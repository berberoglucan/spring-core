package _24.spring.aop.joinpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	@Before("pointCutProductRepository()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("islem basliyor");
		System.out.println(joinPoint); // hangi metodun calistigini belirtir
		System.out.println(joinPoint.getKind()); // ne tur bir aop islemi yapiliyor
		System.out.println(joinPoint.getTarget()); // calisan class ismini yazar
		System.out.println(joinPoint.getSignature()); // calisan metodun imzasini yazar
	}
	
	@After("pointCutProductRepository()")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("islem bitti");
		System.out.println(joinPoint); // point
		System.out.println(joinPoint.getKind());
		System.out.println(joinPoint.getTarget());
		System.out.println(joinPoint.getSignature());
	}
	
	@Pointcut("execution(public * _24.spring.aop.joinpoint.ProductRepository.*(..))") //ProductRepository icindeki tum metotlar icin calisir.
	public void pointCutProductRepository() {
		
	}
	

}
