package com.pattern.design.prototype;

public interface Cloner extends Cloneable {
	
	public Cloner clone() throws CloneNotSupportedException;

}
