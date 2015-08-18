package com.mlo55.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {

	//See si-components.xml...
	//Start spring integration,
	//  Call the weather service
	//  Use an xpath splitter to split the response.

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/si-chained-components.xml");
//		while (true) {
//		}
	}
}
