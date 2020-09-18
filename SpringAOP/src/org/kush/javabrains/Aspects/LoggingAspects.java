
package org.kush.javabrains.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspects {
	
//	@Before("execution(public String org.kush.javabrains.model.Circle.getName())")
//	public void LoggingAdvice() {
//		System.out.println("Advice run. Get Method called");
//	}
//	* this is called wildCards
//	@Before("allGetters() && allCircleMethods()")
//	public void LoggingAdvice() {
//		System.out.println("Advice run. Get Method called");
//	}
//	
//	@Before("allGetters()")
//	public void SecondAdvice() {
//		System.out.println("Second Advice Executed");
//	}
	
	@Before("args(String)")
	public void stringArgumentMethods() {
		System.out.println("A method that takes String arguments");
	}
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getTarget());
	}
//	execution take methods as an argument
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
//	within take a class as an argument
	@Pointcut("within(org.kush.javabrains.model.Circle)")
	public void allCircleMethods() {}
}
