package com.pattern.design.prototype;

import java.util.Random;

public class Client {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		Library library = createLibrary();
		Library cloneLib = library.clone();
		cloneLib.setLibName("Bornado Library");
		
		System.out.println("Printing Original Library Items");
		System.out.println(library);
		
		System.out.println("Printing Clone Library Items");
		System.out.println(cloneLib);
	}

	private static Library createLibrary() {
		Library lib = new Library("JakartaX");
		for (int i =0 ; i < 10; i++) {
			lib.getBooks().add(new Book(i, "JakartaX : "+i,new Random().nextInt(4)));
		}
		return lib;
	}
}
