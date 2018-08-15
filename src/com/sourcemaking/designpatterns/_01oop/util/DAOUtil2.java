package com.sourcemaking.designpatterns._01oop.util;

import com.sourcemaking.designpatterns._01oop.dao.DAO;
import com.sourcemaking.designpatterns._01oop.dao.impl.JdbcDAO;

public class DAOUtil2 {

	public static DAO getDAO() {
		try {
			return new JdbcDAO();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
