package com.toby.beanFactoryPostProcessor.customEditorConfigurer;

import java.beans.PropertyEditorSupport;

public class UserEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] strs = text.split(",");
		int number = Integer.parseInt(strs[1]);
		
		User user = new User();
		user.setName(strs[0]);
		user.setNumber(number);
		
		System.out.print("run to userEditor");
		setValue(user);
	}
}
