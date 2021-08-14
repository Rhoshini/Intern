package com.service.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.service.pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setFileName() {
		testcaseName ="VerifyLogin";
		testDescription ="Verify Login to service now";
		authors ="Rhosh";
		excelFileName = "ServiceCredentials";		
		
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String UN, String PW) {
		
		new LoginPage().enterUsername(UN).enterPassword(PW).clickLogin().verifyHomePage();
		
	}
	
	
	
	

}
