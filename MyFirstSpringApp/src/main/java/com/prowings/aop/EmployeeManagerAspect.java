package com.prowings.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeManagerAspect {
//	@AfterReturning("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog1() {
//		System.out.println("logging information after returnnig...");
//	}
//
//	@Before("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog2() {
//		System.out.println("logging information before...");
//	}
//
//	@AfterThrowing("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog3() {
//		System.out.println("logging information after throwing...");
//	}
//	@After("execution(* EmployeeManager.getEmployeeById(..))")
//	public void doLog4() {
//		System.out.println("logging information after...");
//	}
	@Around("execution(* EmployeeManager.getEmployeeById(..))")
	public void doLog5(ProceedingJoinPoint pjp) throws Throwable {
		int i=(Integer)pjp.getArgs()[0];
		System.out.println("logging information : call to getEmpById with : "+i);
		pjp.proceed();
		System.out.println(">>>>>>"+i);
		System.out.println("logging information : Employee fetched from DB with id : "+i);
	}

}
