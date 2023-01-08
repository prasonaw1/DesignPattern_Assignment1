package com.pattern.design.proxy;

import java.util.List;

public class FetchDeviceNeededQuestionFromProxy extends FetchDeviceNeededQuestion{
	
	private List<Question> questions;
	

	@Override
	public List<Question> getDeviceNeededQuestions() {
		if (questions == null) {
			FetchDeviceNeededQuestion fetchDeviceNeededQuestion = new FetchDeviceNeededQuestion();
			questions = fetchDeviceNeededQuestion.getDeviceNeededQuestions();
		}
		return questions;
	}

}
