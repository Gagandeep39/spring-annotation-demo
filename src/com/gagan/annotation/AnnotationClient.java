package com.gagan.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationClient {
	
	/**
	 * Project qwont work with Spring 5.2.5
	 * Uncomment ClassPathXmlApplicationContext to enable XML based config
	 * Uncomment AnnotationConfigApplicationContext to enable JAVA config
	 * @return void
	 */
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// "tennisCoach" is class name thaat is given when no name is given to xompomnent
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Coach coach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
