package com.prowings.springcore.annotation;

import org.springframework.stereotype.Component;

@Component
public class English implements Subject  {

	
	public void printSubjectInfo() {
		System.out.println("the english class is most importent for everyone");
		
	}

}
