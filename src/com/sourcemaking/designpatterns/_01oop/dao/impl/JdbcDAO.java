package com.sourcemaking.designpatterns._01oop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sourcemaking.designpatterns._01oop.dao.DAO;
import com.sourcemaking.designpatterns._01oop.model.Customer;

public class JdbcDAO implements DAO {

	@Override
	public void insert(Customer customer) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("insert into musteri " + "(name, surname, address) values (?, ?, ?)");
			
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getSurname());
			pstmt.setString(3, customer.getAddress());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private Connection getConnection() {
		return null;
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub

	}

}
