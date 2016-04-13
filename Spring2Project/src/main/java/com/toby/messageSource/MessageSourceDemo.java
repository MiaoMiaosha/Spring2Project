package com.toby.messageSource;

import java.util.Calendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageSourceDemo {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/toby/messageSource/messages-config.xml");
		Object[] arg = new Object[]{"韩宏衍",Calendar.getInstance().getTime()};
		
		//前缀：messages必须定义好，然后 _后缀
		//后缀：US对应的文件最后应该是en_US,Chinese最后是zh，繁体字最后是TW 
		//例Locale.CHINESE =>messages_zh.properties
		System.out.println(context.getMessage("userLogin", arg,Locale.US));
		System.out.println(context.getMessage("userLogin", arg,Locale.CHINESE));

	}
	
}
