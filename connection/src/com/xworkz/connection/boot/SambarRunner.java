package com.xworkz.connection.boot;

public class SambarRunner {
	
	public static void main(String[] args){
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
