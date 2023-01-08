package com.pattern.design.adapter;

import java.text.DecimalFormat;

import com.pattern.design.adapter.Meter;
import com.pattern.design.adapter.MeterAdapter;

public class Client {

	
	
	public static void main(String[] args) {
		Meter meter = new Vehicle();
		MeterAdapter meterAdapter = new MeterAdapterImpl(meter);
		DecimalFormat df = new DecimalFormat("#.##");      
		System.out.println("Speed in MPH : "+Double.valueOf(df.format(meterAdapter.getSpeed())));
		System.out.println("Speed in KPH : "+Double.valueOf(df.format(meter.getSpeed())));
	}
}
