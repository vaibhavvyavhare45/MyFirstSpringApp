package com.prowings.dependon.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class AppConfig {

	@Bean("firstBean")
	@DependsOn(value={"secondBean","thirdBean"})
	public FirstBean getFirstBean() {
		return new FirstBean();
	}
	@Bean("secondBean")
	public SecondBean getSecondBean() {
		return new SecondBean();
	}
	@Bean("thirdBean")
	public ThirdBean getThirdBean() {
		return new ThirdBean();
	}
	
}
