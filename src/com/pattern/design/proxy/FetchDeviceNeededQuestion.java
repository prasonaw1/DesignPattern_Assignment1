package com.pattern.design.proxy;

import java.util.ArrayList;
import java.util.List;

public class FetchDeviceNeededQuestion implements DeviceNeededQuestion{
		
	FetchDeviceNeededQuestion(){
		setUpDataBaseConnection();
	}

	private void setUpDataBaseConnection() {
		System.out.println("Database Connection Up");
	}

	@Override
	public List<Question> getDeviceNeededQuestions() {
		List<Question> questions = new ArrayList<Question>();
		for (int i = 0; i < 100; i++) {
			questions.add(new Question("Question "+1));
		}
		closeDatabaseConnection();
		return questions;
	}

	private void closeDatabaseConnection() {
		System.out.println("Database Connection Down");
	}

}
