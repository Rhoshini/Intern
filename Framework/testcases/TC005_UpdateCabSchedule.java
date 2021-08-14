package com.service.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.service.pages.LoginPage;

public class TC005_UpdateCabSchedule extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		testcaseName ="VerifyCreateChangeRequest";
		testDescription ="Verify ChangeRequest creation in service now";
		authors ="Rhosh";
		excelFileName = "ServiceCredentials";		
	}
	
	@Test(dataProvider = "fetchData")
	public void runUpdateCabScheduleTestCase(String uname, String pword, String Des) throws InterruptedException {
		new LoginPage().enterUsername(uname).enterPassword(pword).clickLogin()
		.enterChange()
		.clickCreateNew()
		.clickNormal()
		.getInci()
		.enterDesc(Des)
		.clickSubmit()
		.clickOpen()
		.enterTheInc()
		.getResultingInc()
		.clickResultingInc()
		.updateCabChanges()
		.getResultingInc()
		.clickResultingInc()
		.verifyUpdatedSchedule();
		
		

	}

}
