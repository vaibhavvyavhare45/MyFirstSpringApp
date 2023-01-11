package com.prowings.component_scan_exclude_filter_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "com.prowings.component.include.*"))
public class TestConfig {
	public static void main(String[] args) {
		System.out.println("inside main of config..");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TestConfig.class);
		ctx.refresh();
	}

}
