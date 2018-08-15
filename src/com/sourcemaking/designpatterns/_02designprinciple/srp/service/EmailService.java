package com.sourcemaking.designpatterns._02designprinciple.srp.service;

import com.sourcemaking.designpatterns._02designprinciple.srp.model.Customer;

public interface EmailService {
	void sendEmail(Customer customer);
}
