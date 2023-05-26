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
		System.out.println("setting address");
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("seeting age");
		this.age = age;
	}
	public ArrayList<String> getMobileNos() {
		return mobileNos;
	}
	public void setMobileNos(ArrayList<String> mobileNos) {
		System.out.println("seeting mobile no");
		this.mobileNos = mobileNos;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		System.out.println("seeting courses");
		this.courses = courses;
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
		
	}

	
}
