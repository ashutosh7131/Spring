package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Coach theCoach = context.getBean("myCoach", BaseballCoach.class);
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			context.close();
		} catch (BeansException e) {

			e.printStackTrace();
		}
	}

}
