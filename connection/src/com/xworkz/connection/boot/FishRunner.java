package com.xworkz.connection.boot;

public class FishRunner {
	
	
	public static void main(String[] args) {
		
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

}
