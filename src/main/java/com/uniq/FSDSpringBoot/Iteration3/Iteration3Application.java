package com.uniq.FSDSpringBoot.Iteration3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Iteration3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Iteration3Application.class, args);
//		Mario mario = context.getBean(Mario.class);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
	}

}
