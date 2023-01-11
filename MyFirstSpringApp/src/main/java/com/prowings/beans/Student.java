package com.prowings.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int roll;
	private String name;
	private Address address;
	private List<String> subjects;
	private Set<Long> mobileNos;
	private Map<String, Integer> subjectWiseMarks;

	public Student() {
		super();
	}

	public Student(int roll, String name, Address address, List<String> subjects, Set<Long> mobileNos,
			Map<String, Integer> subjectWiseMarks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.subjects = subjects;
		this.mobileNos = mobileNos;
		this.subjectWiseMarks = subjectWiseMarks;
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

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Set<Long> getMobileNos() {
		return mobileNos;
	}

	public void setMobileNos(Set<Long> mobileNos) {
		this.mobileNos = mobileNos;
	}

	public Map<String, Integer> getSubjectWiseMarks() {
		return subjectWiseMarks;
	}

	public void setSubjectWiseMarks(Map<String, Integer> subjectWiseMarks) {
		this.subjectWiseMarks = subjectWiseMarks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", subjects=" + subjects
				+ ", mobileNos=" + mobileNos + ", subjectWiseMarks=" + subjectWiseMarks + "]";
	}

}
