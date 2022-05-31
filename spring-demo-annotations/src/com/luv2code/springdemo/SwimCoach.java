package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "swim 1000 meters as a warmup";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
