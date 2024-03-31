package com.uniq.FSDSpringBoot.Iteration3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Mario")
@Primary
public class Mario implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Mario up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Mario down");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Mario right");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Mario left");
	}

}
