package com.pattern.design.decorator;

public class GravyManchurian extends Manchurian {
	
	public GravyManchurian () {
		description = "Gravy Manchurian";
	}

	@Override
	double price() {
		// TODO Auto-generated method stub
		return 20.0;
	}

}
