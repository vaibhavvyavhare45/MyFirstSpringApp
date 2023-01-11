package com.prowings.springcore.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBank {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Bank obj=(Bank) ctx.getBean("myBank");
		obj.getServiceMessage();
		ctx.close();
	}

}
