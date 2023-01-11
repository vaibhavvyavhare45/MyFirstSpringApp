package com.prowings.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration	
public class AppConfig {
	@Bean
	public Bank myBank() {
		Bank b1=new Bank();	
		b1.setServiceMessage("dear customer,");
		return b1;
	}

}
