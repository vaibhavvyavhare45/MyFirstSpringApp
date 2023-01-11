package com.prowings.springcore.annotation;

public class Bank {
	private String serviceMessage;

	public void getServiceMessage() {
		System.out.println("do not share your bank account detail for anyone..."+serviceMessage);
		
		
	}

	public void setServiceMessage(String serviceMessage) {
		this.serviceMessage = serviceMessage;
	}

	
	
	

}
