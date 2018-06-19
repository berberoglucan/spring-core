package _21.spring.aop.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	@Before(value = "execution (public void _21.spring.aop.before.ProductRepository.saveProduct(*))")
	public void beforeAdvice() {
		System.out.println("Veri kaydetme islemi basliyor"); 
	}
	
	// * -> donus tipi hepsi olabilir
	// @Before("execution (public void _21.spring.aop.before.ProductRepository.removeProduct(*))")
	// @Before("execution (public * _21.spring.aop.before.ProductRepository.removeProduct(*))")
	@Before("execution (public * _21.spring.aop.before.*.removeProduct(*))") // _21.spring.aop.before packetin icindeki herhangi bir classtaki removeProduct metodu calissin
	public void before2Advice() {
		System.out.println("Veri silme islemi basliyor");
	}
	
	//@Before("execution(public * *.getProducts())")
	//@Before("execution(public * getProducts())")// tum projede herhangi bir yerdeki getProducts metodu calisirken 
	public void before3Advice() {
		System.out.println("Veriler getiriliyor");
	}
	
	// .. -> parametresi olsada olur olmasada olur
	//@Before("execution(* findProduct(..))")
	public void before4Advice() {
		System.out.println("Veriler bulunuyor");
	}
	
}
