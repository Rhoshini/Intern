package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteTicketSteps extends BaseClass{
			
		String text;
		
		@Given("Click delete button")
		public void clickDelete() {
			driver.findElement(By.id("sysverb_delete_bottom")).click();

		}
		
		@Given("Handle pop-up")
		public void popup() {
			driver.findElement(By.id("ok_button")).click();

		}
		
		@Then("Verify deletion")
		public void verifyDeletion() {
			text = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
			
			if (text=="No records to display") {
				System.out.println("Incident successfully deleted");
			}
			else {
				System.out.println("Incident not deleted");
			}

		}

	}

