package com.prowings.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProp {

	public static void main(String[] args) {

		ApplicationContext ct=new ClassPathXmlApplicationContext("prop.xml");
		Prop bean = ct.getBean("p1",Prop.class);
		System.out.println(bean);
	}

}
