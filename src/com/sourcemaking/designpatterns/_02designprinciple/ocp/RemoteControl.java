package com.sourcemaking.designpatterns._02designprinciple.ocp;

public class RemoteControl {

	public void on(Object obj) {

		if (obj instanceof TV) {
			((TV) obj).tvOn();
		} else if (obj instanceof CDPlayer) {
			((CDPlayer) obj).cdPlayerOn();
		}
	}
	
	public void off(Object obj) {

		if (obj instanceof TV) {
			((TV) obj).tvOff();
		} else if (obj instanceof CDPlayer) {
			((CDPlayer) obj).cdPlayerOff();
		}
	}
}
