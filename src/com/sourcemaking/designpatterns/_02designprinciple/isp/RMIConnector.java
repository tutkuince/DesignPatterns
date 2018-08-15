package com.sourcemaking.designpatterns._02designprinciple.isp;

public interface RMIConnector {

	void send(String s);

	String receive();
}
