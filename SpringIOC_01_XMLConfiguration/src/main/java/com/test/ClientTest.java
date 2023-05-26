package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Address;
import com.beans.Car;
import com.beans.Student;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/resource/Spring.xml");
		Student student = (Student) ctx.getBean("stu");
		
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getLandmark());
		System.out.println(student.getAddress().getLandname());
		System.out.println(student.getMobileNos());
		System.out.println(student.getCourses());
		System.out.println(student.getAge());
		
		System.out.println("================ car");
		
		Car car= (Car) ctx.getBean("car");
		car.printData();
		
		System.out.println("================ car1");
		
		Car car1= (Car) ctx.getBean("car1");
		car1.printData();
		
        System.out.println("================ car2");
		
		Car car2= (Car) ctx.getBean("car2");
		car2.printData();
		
		//registering shutdown hook
		ctx.registerShutdownHook();
	}
}
