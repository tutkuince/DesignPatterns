package com.sourcemaking.designpatterns._02designprinciple.lc;

public class RemoteControl {

	private RemoteControlInterface remote;

	public RemoteControl(RemoteControlInterface remote) {
		this.remote = remote;
	}
	
	public void on() {
		remote.on();
	}
	
	public void off() {
		remote.off();
	}

}
