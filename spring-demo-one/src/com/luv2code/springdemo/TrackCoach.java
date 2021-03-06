package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private String phoneNumber;
	private String email;
	private HappyFortuneService fortuneService;

	public TrackCoach() {
		super();
	}

	public TrackCoach(HappyFortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getDailyWorkout() {
		return "Run A Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	public void doMyCleanUpYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanUpYoYo");
	}

}
