package com.service.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SearchPage extends ProjectSpecificMethods{
	
	
		public SearchPage enterTheInc() {
			switchToFrame("gsft_main");
			WebElement id = locateElement("change_request_table_header_search_control");
			click(id);
			typeAndEnter(id, changeid);
			return this;
		}
		
		public SearchPage getResultingInc() {
			changid1 = locateElement(Locators.XPATH, "//a[@class='linked formlink']");
			return this;
		}
		
		public ChangeRequestPage clickResultingInc() {
			click(changid1);
			return new ChangeRequestPage();
		}
		
		public SearchPage verifyTheResult() {
			
			verifyExactText(changid1, changeid);
			return this;
			
		}
		
		public SearchPage verifyDeletion() {
			WebElement norec = locateElement(Locators.XPATH, "//td[text()='No records to display']");
			if (verifyExactText(norec, "No records to display")) {
				System.out.println("Record deleted successfully");
			}
			else {
				System.out.println("Record Deletion Unsuccessful");
			}
			return this;

		}

	}
