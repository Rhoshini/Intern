package com.service.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String uname) {
		switchToFrame(0);
		append(locateElement("user_name"), uname);
		return this;
	}

	public LoginPage enterPassword(String pword) {
		append(locateElement("user_password"), pword);			
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement("sysverb_login"));
		System.out.println("Login successful");
		return new HomePage();

	}
}
