package com.toby.beanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorDemo{

	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring/beanPostProcessor.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.getHelloWorld());
	}
	
}
