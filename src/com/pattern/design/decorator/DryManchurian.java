package com.pattern.design.decorator;

public class DryManchurian extends Manchurian {
	
	public DryManchurian () {
		description = "Dry Manchurian";
	}

	@Override
	double price() {
		// TODO Auto-generated method stub
		return 10.0;
	}

}
