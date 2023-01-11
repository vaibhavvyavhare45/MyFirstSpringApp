package com.prowings.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("10")
	int roll;
	@Value("Vaibhav")
	String name;
	@Autowired
	Address address;
	@Autowired
	@Qualifier("math")
	Subject subject;

	public Student() {
		super();
	}

	public Student(int roll, String name, Address address, Subject subject) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.subject = subject;
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", subject=" + subject + "]";
	}

}
