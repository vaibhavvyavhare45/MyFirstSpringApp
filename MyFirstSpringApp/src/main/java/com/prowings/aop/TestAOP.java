package com.prowings.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new  AnnotationConfigApplicationContext();
		ctx.register(AOPConfig.class);
		ctx.refresh();
		EmployeeManager em=ctx.getBean(EmployeeManager.class);
		em.getEmployeeById(102);
	}

}
