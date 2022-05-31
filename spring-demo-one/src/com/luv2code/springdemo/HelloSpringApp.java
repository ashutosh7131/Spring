package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Coach theCoach = context.getBean("myCoach", BaseballCoach.class);
			CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
			TrackCoach theTrackCoach = context.getBean("myTrackCoach", TrackCoach.class);
			System.out.println(theTrackCoach.getDailyWorkout());
			System.out.println("TrackCoach Daily Fortune: " + theTrackCoach.getDailyFortune());
			System.out.println(theTrackCoach.getEmail());
			System.out.println(theTrackCoach.getPhoneNumber());
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			System.out.println(theCricketCoach.getDailyWorkout());
			System.out.println(theCricketCoach.getDailyFortune());
			System.out.println(theCricketCoach.getEmailAddress());
			System.out.println(theCricketCoach.getTeam());
			context.close();
		} catch (BeansException e) {

			e.printStackTrace();
		}
	}

}
