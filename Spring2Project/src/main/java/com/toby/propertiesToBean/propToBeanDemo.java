package com.toby.propertiesToBean;
/*
 * 通过读取properties文件来getbean
 * */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class propToBeanDemo {
	public static void main(String args[]){
		BeanDefinitionRegistry reg = new DefaultListableBeanFactory();
		PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader
				(reg);
		//TODO ERROR!!!
		reader.loadBeanDefinitions(new ClassPathResource(
				"/spring/propToBean.properties"));
		
		BeanFactory fac = (BeanFactory) reg;
		HelloBean hb = (HelloBean) fac.getBean("helloBean");
		System.out.println(hb.getHelloWorld());
	}
}
