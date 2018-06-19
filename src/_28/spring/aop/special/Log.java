package _28.spring.aop.special;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	@Around(value = "@annotation(_28.spring.aop.special.LogAnnotation)")
	public void aroundAdvice() {
		try {
			System.out.println("Around basladi");
			System.out.println("Around bitti");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	

	
}
