package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student s1=(Student) ctx.getBean("s1");
		System.out.println(s1);
//		Student s2=(Student) ctx.getBean("s2");
//		System.out.println(s2);
		
	}

}
