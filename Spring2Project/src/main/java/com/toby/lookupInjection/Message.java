package com.toby.lookupInjection;

import java.util.Date;

public class Message {
	private String sysMessage;
	public Message(){
		sysMessage = "SysInfo"+new Date().toString();
	}
	@Override
	public String toString(){
		return sysMessage;
	}
}
