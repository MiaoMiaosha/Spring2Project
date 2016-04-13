package com.toby.propertiesToBean;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
/*
 * 将bean保存在内存中
 * */
public class GetBeanInProgramDemo {
	public static void main(String args[]){
		//设置属性，并保存在内存中
		MutablePropertyValues prop =  new MutablePropertyValues();
		prop.addPropertyValue("helloWorld","Hello!Toby");
		
		//设置bean定义
		RootBeanDefinition definition = new RootBeanDefinition(
				HelloBean.class,prop);
		
		//注册bean定义与bean别名
		//相当于在xml中定义，helloBean为id，其值在定义的对象中传入
		BeanDefinitionRegistry reg = new DefaultListableBeanFactory();
		reg.registerBeanDefinition("helloBean", definition);
		
		BeanFactory fac = (BeanFactory) reg;
		HelloBean hello = (HelloBean) fac.getBean("helloBean");
		System.out.println(hello.getHelloWorld());
	}
}
