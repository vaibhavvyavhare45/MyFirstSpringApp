package com.prowings.dependon.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
	@Autowired
	private SecondBean secondBean;
	@Autowired
	private ThirdBean thirdBean;

	public FirstBean() {
		System.out.println("the class of firstBean constructor");
	}
	public void populateBean() {
		secondBean.display();
		thirdBean.display();
	}

}
