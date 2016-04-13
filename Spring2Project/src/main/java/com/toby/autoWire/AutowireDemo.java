package com.toby.autoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDemo {

	public static void main(String args[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"/spring/autowire-config.xml");
		autoBean ab = (autoBean) ac.getBean("autoBean");
		System.out.println("Date: "+ab.getDate());
		System.out.println("SayHello: "+ab.getHelloWorld());
	}
}
