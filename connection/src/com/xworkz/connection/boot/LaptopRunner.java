
package com.xworkz.connection.boot;

import java.sql.Connection;
import java.sql.DriverManager;

public class LaptopRunner {
	
	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/laptop";
		String username="root";
		String password="Xworkzodc@123";
		
		Connection connection=DriverManager.getConnection(url,username,password);
		
		if(connection!=null) {
			System.out.println("connection successfull");
		}else {
			System.out.println("not connected");
		}
	}

}
