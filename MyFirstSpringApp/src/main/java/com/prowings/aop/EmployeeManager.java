package com.prowings.aop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
	public Employee getEmployeeById(Integer employeeId) {
		System.out.println("the method getEmployee() called...");
//		if(true)
//			throw new NullPointerException();
		return new Employee(10, "marish");
	}

}
