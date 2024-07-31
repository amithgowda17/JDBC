package com.xworkz.connection.boot;

import java.sql.Connection;
import java.sql.DriverManager;

public class ChairRunner {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/chair";
		String username = "root";
		String password = "Xworkzodc@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		if (connection != null) {
			System.out.println("connected succesfully");
		} else {
			System.err.println("not connected");
		}
	}

}
