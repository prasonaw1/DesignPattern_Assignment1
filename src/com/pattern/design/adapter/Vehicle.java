package com.pattern.design.adapter;

import java.util.Random;

public class Vehicle implements Meter {

	private Double speed;
	
	@Override
	public double getSpeed() {
		if(speed == null) {
			speed = new Random().nextDouble(100.0);
		}
		return speed;
	}
	



}
