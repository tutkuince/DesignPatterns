package com.sourcemaking.designpatterns._02designprinciple.isp;

public interface JMSConnector {
	void commit();

	void rollback();

	void send(String s);

	String receive();
}
