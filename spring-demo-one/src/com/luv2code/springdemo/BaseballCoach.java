package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach() {
		super();
	}

	public BaseballCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on Batting Practice";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
