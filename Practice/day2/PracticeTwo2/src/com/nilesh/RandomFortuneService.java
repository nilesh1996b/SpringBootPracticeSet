package com.nilesh;

import java.util.*;

public class RandomFortuneService implements FortuneService {
	
	private String[] data= {
		"Your Day is Lucky",
		"You have to stay away from bad people",
		"Yellow is your lucky color",
		"Today you will die"
	};
	
	private Random n = new Random();

	@Override
	public String getFortune() {
		int search = n.nextInt(data.length);
		return data[search];
	}

}
