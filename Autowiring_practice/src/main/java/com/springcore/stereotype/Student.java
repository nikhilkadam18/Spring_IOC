package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Nikhil kadam")
	private String studentName;
	
	@Value("mumbai")
	private String city;
	public String getStudentname() {
		return studentName;
	}
	public void setStudentname(String studentname) {
		this.studentName = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentName + ", city=" + city + "]";
	}
	
	

}
