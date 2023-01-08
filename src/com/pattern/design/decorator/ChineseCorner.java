package com.pattern.design.decorator;

public class ChineseCorner {
	
	public static void main(String[] args) {
		Manchurian manchurian = new DryManchurian();
		Manchurian cheeseDecorator = new WithCheese(manchurian);
		Manchurian mayonnaiseDecorator = new WithMayonnaise(cheeseDecorator);
		System.out.println("***** Product Description *****");
		String description = mayonnaiseDecorator.getDescription();
		System.out.println(description);
		System.out.println("***** Product Price *****");
		double price = mayonnaiseDecorator.price();
		System.out.println(price);
	}

}
