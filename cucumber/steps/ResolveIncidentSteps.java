package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ResolveIncidentSteps extends BaseClass {
	
	String verify2;
	
	@Given("Select Resolved")
	public void selectResolved() {
		WebElement state = driver.findElement(By.id("incident.state"));
		Select inprog = new Select(state);
		inprog.selectByVisibleText("Resolved");

	}
	
	@Given("Update WorkNotes")
	public void updateWorkNotes() {
		driver.findElement(By.id("activity-stream-textarea")).sendKeys("Ticket is Resolved");

	}
	@Given("Click Resolve")
	public void clickResolve() {
		driver.findElement(By.id("resolve_incident_bottom")).click();

	}
	
	@Then("Verify resolution")
	public void verifyResolution() {
		verify2 = driver.findElement(By.id("incident.state")).getText();
		if (verify2.contains("Resolved" )) {
			System.out.println("Incident is Resolved");
			
		} else {
			System.out.println("Incident is not Resolved");
		}
		

	}

}
