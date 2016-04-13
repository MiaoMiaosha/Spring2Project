package com.toby.usingType3;

public class Type3Bean {
	private String name;
	private String helloWorld;
	
	public Type3Bean(){
		
	}
	public Type3Bean(String name,String helloWorld){
		this.name=name;
		this.helloWorld=helloWorld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHelloWorld() {
		return helloWorld;
	}
	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}
}
