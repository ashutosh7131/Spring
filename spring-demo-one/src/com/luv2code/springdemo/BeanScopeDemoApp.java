package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach coach = context.getBean("myCoach", BaseballCoach.class);
		Coach alphaCoach = context.getBean("myCoach", BaseballCoach.class);
		boolean result = (coach == alphaCoach);
		System.out.println(result);
		context.close();

	}
}