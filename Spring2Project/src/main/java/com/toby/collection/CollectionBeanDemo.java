package com.toby.collection;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionBeanDemo {
	public static void main(String args[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"/spring/collection-config.xml");
		CollectionBean cb = (CollectionBean) ac.getBean("CollectionBean");
		
		//取得数组类型对象
		String[] getStr = cb.getStrArray();
		Some[] getSome = cb.getObjArray();
		
		for(int i=0;i<getStr.length;i++){
			System.out.println(getStr[i]+","+getSome[i].getName());
		}
		
		//取得List对象
		System.out.println();

		List getList = (List) cb.getSomeList();
		for(Object element:getList){
			System.out.println(element);
		}
		
		//取得map对象
		System.out.println();
		@SuppressWarnings("rawtypes")
		Map getMap = (Map)cb.getSomeMap();
		System.out.println(getMap.get("MapTest"));
		System.out.println(getMap.get("someKey1"));

		//取得具有泛型的map对象
		System.out.println();
		Map<String,Float> getPreMap = (Map<String, Float>)cb.getPreMap();
		System.out.println(getPreMap.get("preMapTest1"));
		System.out.println(getPreMap.get("preMapTest2"));
			
		//取得set
		System.out.println();
		Set getSet = (Set)cb.getSomeSet(); 
		for(Object element:getSet){
			System.out.println(element);
		}
		//取得内存中的prop
		System.out.println();
		Properties getProp = (Properties)cb.getProp(); 
		for(Object element:getProp.keySet()){
			System.out.println(element+"==>"+getProp.get(element));
		}
		/*
		//取得本地的prop
		PropertiesFactoryBean locBean = (PropertiesFactoryBean) ac.getBean("localProp");
		System.out.println();
		Properties getLocProp=null;
		try {
			getLocProp = (Properties) locBean.getObject();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(Object element:getLocProp.keySet()){
			System.out.println(element+"==>"+getLocProp.get(element));
		}
		*/

		
		
	}
}
