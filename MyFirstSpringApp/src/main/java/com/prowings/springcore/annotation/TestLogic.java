package com.prowings.springcore.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLogic {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(StudentConfig.class);
		ctx.refresh();
		Student st = ctx.getBean(Student.class);
		st.getSubject().printSubjectInfo();
		System.out.println(st);
		ctx.close();
	}

}
