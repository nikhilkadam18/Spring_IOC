package com.beans;

public class Car {

	String color;
	String make;
	int year;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String color, String make) {
		super();
		this.color = color;
		this.make = make;
	}
	
	public Car(int year, String make) {
		super();
		this.year = year;
		this.make = make;
	}
	
	public Car(String make, String color, int year) {
		super();
		this.make = make;
		this.color = color;
		this.year = year;
	}

	public void printData(){
		System.out.println(make);
		System.out.println(color);
		System.out.println(year);
	}

}
