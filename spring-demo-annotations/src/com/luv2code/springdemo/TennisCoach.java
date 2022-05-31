package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		super();
	}

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) { super();
	 * this.fortuneService = theFortuneService; }
	 */

	@Override
	public String getDailyWorkout() {

		return "Practice On Clay Court";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
