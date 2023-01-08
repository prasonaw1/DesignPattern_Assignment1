package com.pattern.design.adapter;

public class MeterAdapterImpl implements MeterAdapter {
	
	private Meter meter;

	MeterAdapterImpl (Meter meter) {
		this.meter = meter;
	}
	
	@Override
	public double getSpeed() {
		return convertToMPH(meter.getSpeed());
	}

	private double convertToMPH(double speed) {
		return speed * 0.6213711922;
	}

}
