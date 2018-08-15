package com.sourcemaking.designpatterns._02designprinciple.dip;

public class Fan implements Switchable {
	@Override
	public void turnOn() {
		System.out.println("Fan: Fan turned on...");
	}

	@Override
	public void turnOff() {
		System.out.println("Fan: Fan turned off...");
	}
}
