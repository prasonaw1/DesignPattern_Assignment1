package com.pattern.design.proxy;

import java.util.List;

public class Client {

	
	public static void main(String[] args) {
		DeviceNeededQuestion DNQ = new FetchDeviceNeededQuestionFromProxy();
		long startTime = System.currentTimeMillis();
		List<Question> questions =  DNQ.getDeviceNeededQuestions();
		long endTime = System.currentTimeMillis();
		long timeDiff = endTime - startTime;
		System.out.println("timeDiff : "+timeDiff);
		
		long startTime1 = System.currentTimeMillis();
		List<Question> questions1 =  DNQ.getDeviceNeededQuestions();
		long endTime1 = System.currentTimeMillis();
		long timeDiff1 = endTime1 - startTime1;
		System.out.println("timeDiff1 : "+timeDiff1);
	}
}
