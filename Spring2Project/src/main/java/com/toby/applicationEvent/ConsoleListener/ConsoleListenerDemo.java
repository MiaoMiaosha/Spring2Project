package com.toby.applicationEvent.ConsoleListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*ApplicationContext执行启动时，自动调用，打印其相关信息
 * */

public class ConsoleListenerDemo {

	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
					"/com/toby/applicationEvent/ConsoleListener/consoleListener-config.xml");

			
		}
	
}
