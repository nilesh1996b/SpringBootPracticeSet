package com.nilesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
		
	
	public void setFortuneService(FortuneService fortuneServices) {
		this.fortuneService = fortuneServices;
	}

	@Override
	public String getCoach() {
		// TODO Auto-generated method stub
		return "Do batting practice all of you ";
	}

	@Override
	public String getYourFortune() {
		return fortuneService.getFortune();
	}

}
