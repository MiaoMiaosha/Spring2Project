package com.toby.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private String[] strArray;//字符数组
	private Some[] objArray;//对象数组
	private List someList;//list集合
	private Map someMap;//map集合
	private Map<String,Float> preMap; //map泛型
	private Set someSet;//set集合，无重复元素
	private Properties prop;//内存中定义的prop
	private Properties location;//本地的prop
	
	public Properties getLocation() {
		return location;
	}
	public void setLocation(Properties location) {
		this.location = location;
	}
	public Set getSomeSet() {
		return someSet;
	}
	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Map<String, Float> getPreMap() {
		return preMap;
	}
	public void setPreMap(Map<String, Float> preMap) {
		this.preMap = preMap;
	}
	public String[] getStrArray() {
		return strArray;
	}
	public void setStrArray(String[] strArray) {
		this.strArray = strArray;
	}
	public Some[] getObjArray() {
		return objArray;
	}
	public void setObjArray(Some[] objArray) {
		this.objArray = objArray;
	}
	public List getSomeList() {
		return someList;
	}
	public void setSomeList(List someList) {
		this.someList = someList;
	}
	public Map getSomeMap() {
		return someMap;
	}
	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}
	
	
}
