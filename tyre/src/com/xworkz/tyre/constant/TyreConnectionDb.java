package com.xworkz.tyre.constant;

public enum TyreConnectionDb {
	
	URL("jdbc:mysql://localhost:3306/tyre"),USERNAME("root"),PASSWORD("Xworkzodc@123");

			
	public final String name;
	
	
	private TyreConnectionDb(String name) {
		this.name=name;
	}


	public String getName() {
		return name;
	}
	
	

}
