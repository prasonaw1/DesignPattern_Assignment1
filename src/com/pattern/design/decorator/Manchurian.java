package com.pattern.design.decorator;

public abstract class Manchurian {
	
	 String description = "Simple Manchurian";
	
	
	public String getDescription() {
		return this.description;
	}
	
	
	abstract double price();

}
