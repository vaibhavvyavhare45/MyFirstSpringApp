package com.prowings.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages="com.prowings.springcore.annotation")
public class StudentConfig {

	
	@Bean(name="currentAddress")
	public Address getAddress1() {
		
		return new Address(1001,"pune");
	}
	@Bean(name="permnentAddress")
	@Primary
	public Address getAddress2() {
		
		return new Address(1002,"raygad");
	}
	
	
}
