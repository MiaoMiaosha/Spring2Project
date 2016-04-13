package com.toby.beanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyOverrideConfigurerDemo {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/toby/beanFactoryPostProcessor/propertyOverrideConfigurer.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.getHelloWorld());
		System.out.println(hello.getExplain());

		
	}
}
