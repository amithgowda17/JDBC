package com.xworkz.tv.constant;

public enum ConnectEnumDb {
	
	URL("jdbc:mysql://localhost:3306/jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	public final String name;

	
	
	private ConnectEnumDb(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}


}
