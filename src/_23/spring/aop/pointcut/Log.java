package _23.spring.aop.pointcut;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	//@Before("pointCutSaveProduct()")
	@Before("pointCutProductRepository()")
	public void beforeAdvice() {
		System.out.println("Urun ekleme basliyor");
	}
	
	//@After("pointCutSaveProduct()")
	@After("pointCutProductRepository()")
	public void afterAdvice() {
		System.out.println("Urun ekleme bitti");
	}
	
	@Pointcut("execution(public * _23.spring.aop.pointcut.ProductRepository.saveProduct(*))")
	public void pointCutSaveProduct() {
		
	}
	
	@Pointcut("within (_23.spring.aop.pointcut.ProductRepository)") //ProductRepository icindeki tum metotlar icin calisir.
	//@Pointcut("within (_23.spring.aop.pointcut.*)")
	public void pointCutProductRepository() {
		
	}
	

}
