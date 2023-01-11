package com.prowings.dependon.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		FirstBean f1=ctx.getBean(FirstBean.class);
		f1.populateBean();
	}
}
