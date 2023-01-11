package com.prowings.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	public Employee showDetail() {
		Employee e1 = new Employee(1001, "vaibhav");
		return e1;

	}

}
