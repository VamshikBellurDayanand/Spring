package com.vamshik.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retreive the spring bean
		Coach coach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
