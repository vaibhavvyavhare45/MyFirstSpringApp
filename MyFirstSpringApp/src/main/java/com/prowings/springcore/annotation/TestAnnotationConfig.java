package com.prowings.springcore.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
		Employee obj=(Employee) ctx.getBean("showDetail");
		System.out.println(obj);
		ctx.close();
	}

}
