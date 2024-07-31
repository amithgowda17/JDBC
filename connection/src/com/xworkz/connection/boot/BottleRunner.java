package com.xworkz.connection.boot;

import java.sql.Connection;
import java.sql.DriverManager;

public class BottleRunner {
	
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/bottle";
		String username="root";
		String password="Xworkzodc@123";
		
		
		Connection connection=DriverManager.getConnection(url, username, password);
		
		if(connection!=null) {
			System.out.println("connected successfully");
		}else {
			System.err.println("not connected");
		}
	}

}
