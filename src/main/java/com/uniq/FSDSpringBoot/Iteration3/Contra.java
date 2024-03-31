package com.uniq.FSDSpringBoot.Iteration3;

import org.springframework.stereotype.Component;

@Component("Contra")
public class Contra implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Contra up");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Contra down");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Contra right");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Contra left");
	}

}
