package com.novacreator.crudism.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseLoggerService {
	public static Connection getDatabaseConnection() throws SQLException {
		//no spring context at this point
		try {
			Properties properties = new Properties();
			properties.load(DatabaseLoggerService.class.getResourceAsStream("/application.properties"));
			Class.forName(properties.getProperty("spring.datasource.driver-class-name")).newInstance();
			return DriverManager.getConnection(properties.getProperty("spring.datasource.url"), 
					properties.getProperty("spring.datasource.username"), 
					properties.getProperty("spring.datasource.password"));
		} catch(Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}
}
