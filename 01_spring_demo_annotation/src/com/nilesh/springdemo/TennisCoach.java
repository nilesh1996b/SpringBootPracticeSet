package com.nilesh.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")

public class TennisCoach implements Coach {
	
//	Define my Initialization method Method
	@PostConstruct
	public static void initMethod()
	{
		System.out.println("Program Started");
	}
	
	
//	Define my Destroy Method
	@PreDestroy
	public static void destroyMethod()
	{
		System.out.println("Program Ended");
	}	
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}


	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
//	@Autowired
//	public void doSomeCrazyShit(FortuneService fortuneServices) {
//		this.fortuneService = fortuneServices;
//	}



	@Override
	public String getDailyWorkout() {
		return "Do ULa Ula";
	}



	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
