package com.framework.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	public static String changeid;
	public static WebElement changid1;
	public static WebElement assgrp;
	public static WebElement assto;
	public static WebElement asses;
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeMethod
	public void preCondition() {
		startApp("chrome", false, "https://dev113545.service-now.com/");
		setNode();
	}

	@AfterMethod
	public void postCondition() {
		close();
	}
	
	  

	
	
}
