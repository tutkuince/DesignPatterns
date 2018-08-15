package com.sourcemaking.designpatterns._01oop.main;

import com.sourcemaking.designpatterns._01oop.model.Customer;
import com.sourcemaking.designpatterns._01oop.util.DAOUtil;

public class Test {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setName("Tutku");
		customer.setSurname("Ince");
		customer.setAddress("Gaziemir/Izmir");
		
		/**
		 * Insert Customer to DB
		 * 
		 */
		
		DAOUtil.getDAO().insert(customer);
	}
}
