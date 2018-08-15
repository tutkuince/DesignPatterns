package com.sourcemaking.designpatterns._02designprinciple.dip;

public class LightBulb implements Switchable {
	@Override
	public void turnOn() {
		System.out.println("LightBulb: Bulb turned on...");
	}

	@Override
	public void turnOff() {
		System.out.println("LightBulb: Bulb turned off...");
	}
}
