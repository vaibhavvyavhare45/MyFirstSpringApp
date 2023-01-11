package com.prowings.beans;

public class Employee {
	private int eid;
	private String name;
	private String dept;
	private Address address;

	public Employee() {
		super();
	}

	public Employee(int eid, String name, String dept, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}
	

}
