package com.gagan.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //("helloTennis") by default well use class name
public class TennisCoach implements Coach {
	/*
	 * Field injection
	 */
	@Autowired
	@Qualifier("happyFortuneService")	// We are explicitly specifying which implemenation to use here
	FortuneService fortuneService;
	
	/**
	 * AUTOWIRED
	 * Used during constructor injection
	 * 1. Will look for Components across the scope specified in applicationContext file
	 * 2. Prvide the service automatically ton constructor
	 */
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	public TennisCoach() {
		System.out.println("Default constructo of tennis coach");
	}
	
	
	/**
	 * Setter Injection
	 * @param fortuneService
	 */
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside fortune service setter emthod");
		this.fortuneService = fortuneService;
	}
	*/



	@Override
	public String getDailyWorkout() {
		return "Play multiple rounds of tennis";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
