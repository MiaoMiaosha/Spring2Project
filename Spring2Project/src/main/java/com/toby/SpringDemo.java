package com.toby;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemo {
	public static void main(String args[]){
		
		//获取配置文件对象
		Resource rs =
				new ClassPathResource("/spring/application-config.xml");
		//通过配置文件，建立bean工厂
		BeanFactory fac = new XmlBeanFactory(rs);
		//通过工厂，实例化Bean
		HelloBean hello = (HelloBean) fac.getBean("helloBean");
		//调用bean的方法
		System.out.println(hello.getHelloWorld());

		/*打印实例*/
		Business bus = (Business) fac.getBean("business");
		//联系了business和writer两个bean，创建bus对象时，自动注入
		bus.save();
		
		
		
		/*用ApplicationContext代替beanfactory*/
		//这样写会把之前的beanfactory的方法覆盖掉
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{
			"/spring/application-config.xml","/spring/bean-config.xml"});
		//ApplicationContext ac = new ClassPathXmlApplicationContext("bean*.xml");
		
		HelloBean hello2 = (HelloBean) ac.getBean("helloBean");
		System.out.println("hello2: "+hello2.getHelloWorld());
		
		HelloBean hello3 = (HelloBean) ac.getBean("newHelloBean");
		System.out.println("hello3: "+hello3.getNewBean());
		
		HelloBean hello4 = (HelloBean) ac.getBean("helloBean");
		System.out.println("hello4: "+hello4.getNewBean());
		
	

	}
}
