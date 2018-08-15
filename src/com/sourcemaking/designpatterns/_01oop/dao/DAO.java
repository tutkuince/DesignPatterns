package com.sourcemaking.designpatterns._01oop.dao;

import com.sourcemaking.designpatterns._01oop.model.Customer;

public interface DAO {
	void insert(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
