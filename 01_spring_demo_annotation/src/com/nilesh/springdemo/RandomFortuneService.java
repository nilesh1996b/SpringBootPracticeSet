package com.nilesh.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create Array of String
	
	 private String[] data = {
		"Beware of Wolf in the Sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	 };
	 
//	 Create a Random number generator
	 private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		int index =  myRandom.nextInt(data.length);
		
		String thrFortune = data[index];
		
		// TODO Auto-generated method stub
		return thrFortune;
	}

}
