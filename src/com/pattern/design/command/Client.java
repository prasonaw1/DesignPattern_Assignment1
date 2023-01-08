package com.pattern.design.command;

public class Client {

	
	public static void main(String[] args) {
		Light light = new Light();
		LightOnCommand loc = new LightOnCommand(light);
		LightOffCommand loffC = new LightOffCommand(light);
		Switch swt = new Switch(loc, loffC);
		swt.flipUp();
	}
}
