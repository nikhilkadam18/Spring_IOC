package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.Employee;

public class ClientTest {

	public static void main(String[] args) {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/resource/Spring.xml");
		
		
		  Employee Employee = (Employee) ctx.getBean("emp");
		  System.out.println(Employee.hashCode());
		  
		  Employee Employee1 = (Employee) ctx.getBean("emp");
		  System.out.println(Employee1.hashCode());
		  
		  
		  System.out.println(Employee.getAddress());
		  System.out.println(Employee.getAddress().getLandmark());
		  System.out.println(Employee.getName());
		 
		

	}
}