package com.prowings.beanlifecycle.bean;

public class Vehicle {
	int id;
	String companyName;
	public Vehicle() {
		super();
	}
	public Vehicle(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", companyName=" + companyName + "]";
	}
	public void init() {
		System.out.println("vehicle init() method called!!!");
	}
	public void destroy() {
		System.out.println("vehicle destroy() method called!!!");
	}

}
