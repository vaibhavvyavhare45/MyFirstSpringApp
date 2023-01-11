package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorAmbiguityTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ConstructorAmbApplicationContext.xml");
		ConstructorAmbiguity ca= ctx.getBean("constructorAmbiguity",ConstructorAmbiguity.class);
		//System.out.println(ca);
	} 

}
 