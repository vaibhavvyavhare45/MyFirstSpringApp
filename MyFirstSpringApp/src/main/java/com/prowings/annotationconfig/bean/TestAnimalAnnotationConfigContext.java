package com.prowings.annotationconfig.bean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.warrior.methodinjection.bean.Engine;

public class TestAnimalAnnotationConfigContext {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("AnnoatationConfigApplicationContext.xml");
		Animal a1=ctx.getBean(Animal.class);
		System.out.println(a1);
		Engine e=a1.getEngine();
		System.out.println(e);
		ctx.close();
	}

}
