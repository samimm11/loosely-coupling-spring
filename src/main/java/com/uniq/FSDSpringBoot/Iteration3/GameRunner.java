package com.uniq.FSDSpringBoot.Iteration3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	@Autowired
	@Qualifier("Contra")
	GamingConsole obj;

	public GameRunner(GamingConsole obj) {
		this.obj = obj;
	}
	void run() {
		obj.up();
		obj.down();
		obj.right();
		obj.left();		
	}

}
