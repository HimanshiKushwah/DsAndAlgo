package org.kush.javabrains.Aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectJoinPoint {
	
	@Before("execution(public void org.kush.javabrains.model..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Before running Logging Advice on method= "+joinPoint.toString());
		System.out.println("Argument Passed= "+Arrays.toString(joinPoint.getArgs()));
	}
	
	@Before("args(name)")
	public void logStringArguments(String name) {
		System.out.println("String arguments passed= "+name);
	}
}
