package net.sytes.codeline.domaci034;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

@Aspect
public class InterceptorLog implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Presretena je metoda: " + arg0);
	}

	@After("execution(*net.sytes.codeline.domaci03.SobaDaoImpl.addSoba(..))")
	public void logAfter() {
		System.out.println("Pokrenuta je metoda addStudent()");
	}
	
	@AfterThrowing(pointcut = "execution(*net.syts.codeline.domaci03.SobaDaoImpl.addSobaException())",
			throwing = "error")
	public void logAfterException() {
		System.out.println("Pokrenuta je metoda sa izuzetkom, addSobaException()");
	}
	
}
