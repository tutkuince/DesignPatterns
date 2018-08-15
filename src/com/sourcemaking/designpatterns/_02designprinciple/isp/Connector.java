package com.sourcemaking.designpatterns._02designprinciple.isp;

public interface Connector {
	void commit();

	void rollback();

	void send(String s);

	String receive();
	
	// not suitable for Interface Segregation Principle
}
