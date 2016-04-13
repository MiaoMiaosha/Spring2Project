package com.toby.collection;

import org.springframework.stereotype.Component;

import net.java.dev.springannotation.annotation.Value;

@Component
public class UserinfoFromLoc {
	private static UserinfoFromLoc instance;
	public static UserinfoFromLoc getInstance(){
		return instance;
	}
	
	public UserinfoFromLoc(){
		instance=this;
	}
	
	@Value("#{configProperties[username]}")
	private String userName;
	@Value("#{configProperties[password]}")
	private String password;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
