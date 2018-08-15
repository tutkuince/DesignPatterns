package com.sourcemaking.designpatterns._02designprinciple.lc;

public class TV implements RemoteControlInterface{

	@Override
	public void on() {
		System.out.println("TV is opened");
	}

	@Override
	public void off() {
		System.out.println("TV is closed");
	}

}
