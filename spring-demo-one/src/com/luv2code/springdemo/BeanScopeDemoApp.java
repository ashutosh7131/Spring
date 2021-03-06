package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach coach = context.getBean("myCoach", BaseballCoach.class);
		Coach alphaCoach = context.getBean("myCoach", BaseballCoach.class);
		Coach coachNew = context.getBean("myCoachNew", BaseballCoach.class);
		Coach alphaCoachNew = context.getBean("myCoachNew", BaseballCoach.class);
		boolean result = (coach == alphaCoach);
		boolean resultNew = (coachNew == alphaCoachNew);
        System.out.println(result);
		System.out.println("================================");
		System.out.println(resultNew);
		System.out.println("================================");
		System.out.println("coach : " + coach);
		System.out.println("alphaCoach : " + alphaCoach);
		System.out.println("================================");
		System.out.println("coachNew : " + coachNew);
		System.out.println("alphaCoachNew : " + alphaCoachNew);
		context.close();

	}
}