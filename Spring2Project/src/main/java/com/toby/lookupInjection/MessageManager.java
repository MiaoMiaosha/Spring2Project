package com.toby.lookupInjection;

public abstract class MessageManager {
	public void display(){
		Message meg = createMessage();
		System.out.println(meg);
	}
	
	protected abstract Message createMessage();
}
