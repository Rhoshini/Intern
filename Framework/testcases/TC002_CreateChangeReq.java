package com.service.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.service.pages.LoginPage;

public class TC002_CreateChangeReq extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setFileName() {
		testcaseName ="VerifyCreateChangeRequest";
		testDescription ="Verify ChangeRequest creation in service now";
		authors ="Rhosh";
		excelFileName = "ShortDescriptionData";		

		
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateChangeTestCase(String uname, String pword, String SDes) throws InterruptedException {
		
		new LoginPage().enterUsername(uname).enterPassword(pword).clickLogin()
		.enterChange().clickCreateNew().clickNormal()
		.getInci().enterDesc(SDes).clickSubmit().clickOpen().enterTheInc().getResultingInc().verifyTheResult();
		

	}

}
