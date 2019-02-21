package com.vamshik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retreive the spring bean
		Coach coach = context.getBean("trackCoach", Coach.class);
		
		Coach aplhaCoach = context.getBean("trackCoach", Coach.class);
		
		//check if they are the same
		boolean result = coach == aplhaCoach;
		
		//Print out the result
		System.out.println("Pointing to the same object: " + result);
		System.out.println("\nMemory location for coach is " + coach);
		System.out.println("\nMemory location for aplhaCoach is " + aplhaCoach);
		
		//close the context
		context.close();
	}

}
