package com.nilesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		// read spring configuration file 
		ClassPathXmlApplicationContext conn = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach myCoach = conn.getBean("tennisCoach", Coach.class);
		
		
		// call a method on the bean
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		// close the context
		conn.close();
	}

}
