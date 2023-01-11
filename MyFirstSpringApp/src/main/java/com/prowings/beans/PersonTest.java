package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("personApplicationContext.xml");
	Person p=ctx.getBean("person",Person.class);
	Person p1=ctx.getBean("person",Person.class);
	System.out.println(p==p1);
	System.out.println(p.dept==p1.dept);
	System.out.println(p);
}
}
