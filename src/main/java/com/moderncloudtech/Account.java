package com.moderncloudtech;

public class Account {

	
	private int id;
	
	private String firstName;
	
	private String currency;

	
	
	public Account() {}
	
	public Account(int id, String currency) {
		super();
		this.id = id;
		this.currency = currency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	
}
