package com.nilesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintBeanMethod {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext conn = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach res = conn.getBean("myCoach", Coach.class);
		
		System.out.println(res.getCoach());
		
		System.out.println(res.getYourFortune());
		
		conn.close();
		

	}

}
