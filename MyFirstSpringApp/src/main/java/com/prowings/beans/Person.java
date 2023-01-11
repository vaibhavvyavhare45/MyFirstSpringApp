package com.prowings.beans;

public class Person {
	private Address address;
     Department dept;

	public Person() {
		super();
	}

	public Person(Address address) {
		super();
		this.address = address;
		System.out.println("Address constructor is invoked..");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + ", dept=" + dept + "]";
	}

}
