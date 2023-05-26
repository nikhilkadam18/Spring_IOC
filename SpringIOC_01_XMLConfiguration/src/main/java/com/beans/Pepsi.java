package com.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	
     double prize;

	public double getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		System.out.println("seeting prize");
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Pepsi [prize=" + prize + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking pepsi:init");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("throw can:destroy");
		
	}
	
	
     
     

}
