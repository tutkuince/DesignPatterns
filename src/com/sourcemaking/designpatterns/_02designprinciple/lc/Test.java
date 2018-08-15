package com.sourcemaking.designpatterns._02designprinciple.lc;

public class Test {
	public static void main(String[] args) {
		RemoteControlInterface rci = new TV();
		RemoteControl control = new RemoteControl(rci);
		control.on();
		control.off();
	}
}
