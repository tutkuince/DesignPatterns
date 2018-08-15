package com.sourcemaking.designpatterns._01oop.util;

import java.util.ResourceBundle;

public class PropertyHandler {

	public static String getProperty(String key) {
		return ResourceBundle.getBundle("com.sourcemaking.designpatterns._01oop.properties.dao").getString(key);
	}
}
