package com.vamshik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

		//call the methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmailAddress());
		//close the bean
		context.close();
	}

}
