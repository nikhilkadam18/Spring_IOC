package com.beans;

import java.util.ArrayList;
import java.util.Map;

public class Student {
	
	Address address;
	int age;
	ArrayList<String> mobileNos;
	Map<String, String> courses;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<String> getMobileNos() {
		return mobileNos;
	}
	public void setMobileNos(ArrayList<String> mobileNos) {
		this.mobileNos = mobileNos;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	

	
}
