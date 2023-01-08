package com.pattern.design.decorator;

public class WithCheese extends ManchurianDecorator {

	
	public WithCheese (Manchurian manchurian) {
		this.manchurian = manchurian;
	}

	@Override
	public String getDescription() {
		return manchurian.getDescription()+ ", Cheese";
	}

	@Override
	double price() {
		return manchurian.price() + 5.0;
	}

}
