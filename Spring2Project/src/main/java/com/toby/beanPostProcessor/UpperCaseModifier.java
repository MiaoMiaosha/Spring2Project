package com.toby.beanPostProcessor;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class UpperCaseModifier implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		return bean;	
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		Field[] fields = bean.getClass().getDeclaredFields();
		System.out.println(bean.getClass().getName());
		for(int i=0;i<fields.length;i++){
			if(fields[i].getType().equals(String.class)){
				fields[i].setAccessible(true);
				try {
					String original = (String) fields[i].get(bean);
					fields[i].set(bean, original.toUpperCase());
					System.out.println(original);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			
			
			
		}
		return bean;
	}

}
