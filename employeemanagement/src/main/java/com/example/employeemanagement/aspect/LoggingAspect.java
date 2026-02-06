package com.example.employeemanagement.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Pointcut("execution(public * com.example.employeemanagement.service.*.*(..))")
	public void allServiceMethods() {}
	
	@Before("allServiceMethods()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("$$$$$$$$$$$$$$$$$Before method: "+joinPoint.getSignature().getName());
	}
	
	@After("allServiceMethods()")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("$$$$$$$$$$$$$$$$$After method: "+joinPoint.getSignature().getName());
		
	}
	
	@AfterReturning("allServiceMethods()")
	public void logAfterReturning(JoinPoint joinPoint) {
		System.out.println("$$$$$$$$$$$$$$$$$After Returning method: "+joinPoint.getSignature().getName());
	}
	
	@AfterThrowing("allServiceMethods()")
	public void logAfterThrowing(JoinPoint joinPoint) {
		System.out.println("$$$$$$$$$$$$$$$$$After throwing method: "+joinPoint.getSignature().getName());
	}
	
	@Around("allServiceMethods()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("$$$$$$$$$$$$$$$$$Around method: "+joinPoint.getSignature().getName());
		return joinPoint.proceed();
	}
}
