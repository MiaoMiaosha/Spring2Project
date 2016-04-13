package com.toby.lookupInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * 不实现createMessage具体方法
 * 使用spring自动注入
 * 每次注入产生新对象
 * */
public class LookupInjectionDemo {
		public static void main(String args[]){
			ApplicationContext ac = new ClassPathXmlApplicationContext(
					"/spring/lookupInject-config.xml");
			MessageManager manager = (MessageManager) ac.getBean("messageManager");
			try{
				manager.display();
				Thread.sleep(1000);
				manager.display();
				Thread.sleep(1000);
				manager.display();
				Thread.sleep(1000);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
}
