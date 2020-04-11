package com.gagan.annotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is a randomly generated fortune";
	}

}
