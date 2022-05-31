package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {
		super();
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = theFortuneService;

	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling daily for 15 minutes";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
