package com.pattern.design.decorator;

public class WithMayonnaise extends ManchurianDecorator {
	
	public WithMayonnaise (Manchurian manchurian) {
		this.manchurian = manchurian;
	}

	@Override
	public String getDescription() {
		return manchurian.getDescription() + ", Mayonnaise";
	}

	@Override
	double price() {
		return manchurian.price() + 7;
	}

}
