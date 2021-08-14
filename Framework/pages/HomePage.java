package com.service.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage verifyHomePage() {

		switchToFrame("gsft_main");
		WebElement ele = locateElement(Locators.XPATH, "//div[text()='App Engine Studio']");
		verifyPartialText(ele, " App Engine Studio");
		return this;

	}

	public HomePage enterChange() throws InterruptedException {

		append(locateElement("filter"), "Change");
		Thread.sleep(3000);
		return this;
	}

	public CreateChangeRequestHome clickCreateNew() {
		click(locateElement(Locators.XPATH, "(//div[text()='Create New'])[3]"));
		return new CreateChangeRequestHome();
	}

	public SearchPage clickOpen() {
		click(locateElement(Locators.XPATH, "(//div[text()='Open'])[3]"));
		return new SearchPage();

	}

}
