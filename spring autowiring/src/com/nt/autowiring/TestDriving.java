package com.nt.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

public class TestDriving implements Trainer {
	private Vechile  vechile;
	
	public TestDriving(Vechile vech) {
		vechile = vech;
	}

	@Override
	public String getTraining() {
		return "regular practice";
	}

	@Override
	public String getDailyworkout() {
		return vechile.move() ;
	}

}
