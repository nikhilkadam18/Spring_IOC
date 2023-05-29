package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	//@Qualifier(value = "address1")
	 Address address;
	
	private String name;

	public Address getAddress() {
		return address;
	}

	/*public void setAddress(Address address) {
		this.address = address;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
