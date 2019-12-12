package com.hervey.app;

public class People {
	private String userName;
	private Integer userNumber;
	
	public People(String Name, Integer Number) {
		this.userName=Name;
		this.userNumber=Number;
		
	}

	@Override
	public String toString() {
		return "People [userName=" + userName + ", userNumber=" + userNumber + "]";
	}
	
	

}
