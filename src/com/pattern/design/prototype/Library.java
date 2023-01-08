package com.pattern.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloner{
	
	private String libName;
	private List<Book> books;
	
	public Library (String libName) {
		this.libName = libName;
		books = new ArrayList<>();
	}
	
	
	
	
	public String getLibName() {
		return libName;
	}




	public void setLibName(String libName) {
		this.libName = libName;
	}




	public List<Book> getBooks() {
		return books;
	}




	public void setBooks(List<Book> books) {
		this.books = books;
	}




	@Override
	public String toString() {
		return "Libarary [libName=" + libName + ", books=" + books + "]";
	}




	@Override
	public Library clone() throws CloneNotSupportedException {
		return (Library)super.clone();
	}
	
	

}
