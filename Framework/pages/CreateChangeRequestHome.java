package com.service.pages;

import org.openqa.selenium.By;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class CreateChangeRequestHome extends ProjectSpecificMethods {

	public ChangeRequestPage clickNormal() {
		switchToFrame("gsft_main");
		click(locateElement(Locators.XPATH, "(//div[@class='chg-model-model-description change-model-truncate'])[2]"));
		return new ChangeRequestPage();
	}
	
	
}
