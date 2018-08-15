package com.sourcemaking.designpatterns._01oop.util;

import com.sourcemaking.designpatterns._01oop.dao.DAO;

public class DAOUtil {

	public static DAO getDAO() {
		try {
			/*
			 * 
			 */

			return ((DAO) Class.forName(PropertyHandler.getProperty("dao.impl")).getDeclaredConstructor()
					.newInstance());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
