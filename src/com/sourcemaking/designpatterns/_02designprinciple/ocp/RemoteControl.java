package com.sourcemaking.designpatterns._02designprinciple.ocp;

import com.sourcemaking.designpatterns._02designprinciple.lc.RemoteControlInterface;

public class RemoteControl {

	// NOT GOOD FOR OCP
//	public void on(Object obj) {
//
//		if (obj instanceof TV) {
//			((TV) obj).tvOn();
//		} else if (obj instanceof CDPlayer) {
//			((CDPlayer) obj).cdPlayerOn();
//		}
//	}
//	
//	public void off(Object obj) {
//
//		if (obj instanceof TV) {
//			((TV) obj).tvOff();
//		} else if (obj instanceof CDPlayer) {
//			((CDPlayer) obj).cdPlayerOff();
//		}
//	}
	
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
