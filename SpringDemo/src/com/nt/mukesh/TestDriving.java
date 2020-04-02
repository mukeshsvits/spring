package com.nt.mukesh;

import org.springframework.stereotype.Component;
@Component("testdrive")
public class TestDriving implements Trainer {
	
	@Override
	public String getTraining() {
		return "regular practice";
	}



}
