package com.prowings.springcore.annotation;

import org.springframework.stereotype.Component;

@Component
public class Math implements Subject {

	
	public void printSubjectInfo() {
		System.out.println("the math the class has more powerfull... ");
		
	}

}
