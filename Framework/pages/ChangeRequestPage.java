package com.service.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ChangeRequestPage extends ProjectSpecificMethods {

	public ChangeRequestPage getInci() {
		changeid = getAttribute(locateElement("change_request.number"), "value");
		System.out.println("The change Id is: " + changeid);
		return this;

	}

	public ChangeRequestPage updataState() {
		asses = locateElement("change_request.state");
		selectDropDownUsingText(asses, "Assess");
		return this;
	}

	public ChangeRequestPage updateAssignmentGroup() throws InterruptedException {
		assgrp = locateElement("sys_display.change_request.assignment_group");
		typeAndEnter(assgrp, "Software");
		Thread.sleep(1000);
		return this;
	}

	public ChangeRequestPage updateAssigTo() throws InterruptedException {
		assto = locateElement("sys_display.change_request.assigned_to");
		typeAndEnter(assto, "itil@example.com");
		Thread.sleep(1000);
		return this;

	}

	public SearchPage ClickUpdate() {
		click(locateElement("sysverb_update_bottom"));
		return new SearchPage();

	}

	public ChangeRequestPage enterDesc(String Des) {
		type(locateElement("change_request.short_description"), Des);
		return this;
	}

	public HomePage clickSubmit() {
		click(locateElement("sysverb_insert_bottom"));
		defaultContent();
		return new HomePage();
	}

	public ChangeRequestPage verifyAccessInc() {
		verifyExactText(asses, "Assess");
		return this;
	}

	public SearchPage deleteInc() {
		if (verifyPartialText(asses, "New")) {
			click(locateElement("sysverb_delete_bottom"));
			click(locateElement("ok_button"));
		}
		return new SearchPage();
	}

	public SearchPage updateCabChanges() {
		click(locateElement(Locators.XPATH, "//span[text()='Schedule']"));
		click(locateElement(Locators.XPATH, "//span[@class='icon-calendar icon']"));
		click(locateElement("GwtDateTimePicker_day8"));
		click(locateElement("GwtDateTimePicker_ok"));
		click(locateElement(Locators.XPATH, "(//span[@class='icon-calendar icon'])[2]"));
		click(locateElement("GwtDateTimePicker_day21"));
		click(locateElement("GwtDateTimePicker_ok"));
		click(locateElement("label.ni.change_request.cab_required"));
		click(locateElement(Locators.XPATH, "(//span[@class='icon icon-calendar'])[4]"));
		click(locateElement("GwtDateTimePicker_day18"));
		click(locateElement(Locators.XPATH,
				"(//button[@class='form_action_button  action_context btn btn-default'])[2]"));
		return new SearchPage();
	}

	public ChangeRequestPage verifyUpdatedSchedule() {
		WebElement startdate = locateElement(Locators.XPATH, "//input[@id='change_request.start_date']");
		System.out.println("StartDate: " + getAttribute(startdate, "value"));

		WebElement enddate = locateElement(Locators.XPATH, "//input[@id='change_request.end_date']");
		System.out.println("End Date: " + getAttribute(enddate, "value"));

		WebElement cab = locateElement(Locators.XPATH, "(//input[@value='true'])[7]");
		System.out.println("Cab added or not: " + getAttribute(cab, "value"));

		WebElement cabdate = locateElement("change_request.cab_date");
		System.out.println("Cab Scheduled date: " + getAttribute(cabdate, "value"));

		if (verifyExactAttribute(cab, "value", "true")) {
			System.out.println("Cab Scheduled Successfully ");
		} else {
			System.out.println("Schedule update unsuccessful");
		}
		return this;
	}

}
