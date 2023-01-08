package com.pattern.design.command;

public class FanOffCommand implements Command {
	
	private Fan fan;
	
	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		 fan.on();
	}

}
