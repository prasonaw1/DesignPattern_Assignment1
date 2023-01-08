package com.pattern.design.command;

public class Switch {
	
	private Command upCommand, downCommand;
	
	public Switch(Command command, LightOffCommand loffC) {
		this.upCommand = command;
		this.downCommand = loffC;
	}

	void flipUp () {
		upCommand.execute();
	}
	
	void flipDown () {
		downCommand.execute();
	}
	
}
