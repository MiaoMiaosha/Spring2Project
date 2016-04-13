package com.toby.autoWire;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class autoBean {

	private String helloWorld;
	private Date date;
	public String getHelloWorld() {
		return helloWorld;
	}
	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
