package com.wego.webstore.domain;

public class Customer {
	
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(boolean noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	private String customerId ;
	private String name;
	private String address;
	private boolean noOfOrdersMade;
	public Customer(String customerId, String name, String address, boolean noOfOrdersMade) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
	
	
}
