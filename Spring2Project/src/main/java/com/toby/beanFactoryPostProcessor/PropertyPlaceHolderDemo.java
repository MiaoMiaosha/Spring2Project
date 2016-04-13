package com.toby.beanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyPlaceHolderDemo {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/toby/beanFactoryPostProcessor/propertyPlaceHolder-config.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		
		MultiplePropBean multi = (MultiplePropBean) context.getBean("multipleBean");
		
		System.out.println(hello.getHelloWorld());
		
		System.out.println(multi.getName1());
		System.out.println(multi.getName2());
		System.out.println(multi.getName3());


	}
}
