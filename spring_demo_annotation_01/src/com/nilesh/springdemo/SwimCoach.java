package com.nilesh.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService fortuneServices) {
		super();
		this.fortuneService = fortuneServices;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meter as a WarmUp";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " for " + team + " email id - " + email;
	}

}
