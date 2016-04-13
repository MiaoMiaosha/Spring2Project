package com.toby.usingType3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Type3Demo {
	public static void main(String args[]){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
				"/spring/type3Bean-config.xml");
		Type3Bean tb = (Type3Bean) ac.getBean("type3Bean");
		System.out.println("Name: "+tb.getName());
		System.out.println("SayHello: "+tb.getHelloWorld());
	}
}
