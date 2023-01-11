package com.warrior.methodinjection.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarMethodInjection {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("CarApplicationContext.xml");
		Car c1=ctx.getBean("car", Car.class);
		Car c2=ctx.getBean("car", Car.class);
		System.out.println(c1);
		System.out.println(c1==c2);//only one object b/z of outer bean is singleton
		System.out.println(c1.getEngine()==c1.getEngine());//two different object
		
		//System.out.println(c1.getEngine());
		System.out.println(c1.getEngine().getType());
	}

}
   