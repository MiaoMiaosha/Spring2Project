package com.toby.beanFactoryPostProcessor.customEditorConfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.toby.beanFactoryPostProcessor.customEditorConfigurer.HelloBean;

public class CustomEditorConfigurerDemo {
	
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/toby/beanFactoryPostProcessor/customEditorConfigurer/customEditorConfigurer.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.getHelloWorld());
		System.out.println(hello.getUser().getName());
		System.out.println(hello.getUser().getNumber());


		
	}

}
