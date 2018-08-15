package com.sourcemaking.designpatterns._02designprinciple.srp.dao;

import com.sourcemaking.designpatterns._02designprinciple.srp.model.Customer;

public interface CustomerDao {
	void create(Customer customer);

	void delete(Customer customer);

	void update(Customer customer);
}
