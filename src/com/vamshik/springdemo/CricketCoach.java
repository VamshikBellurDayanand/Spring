package com.vamshik.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket Coach: Inside of no - arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice batting for 30 mins. \nPractice bowling for 20 mins. \n"
				+ "Practice fielding for 1 hour.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: Inside of Setter method");
		this.fortuneService = fortuneService;
	}

	
}
