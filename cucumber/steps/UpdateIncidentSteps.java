package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UpdateIncidentSteps extends BaseClass {

	String verify1,verify2;
	
	@Given("Click the incident")
	public void clickInc() {
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	}
	
	@Given("Update urgency")
	public void updateUrgency() {
		WebElement urgency = driver.findElement(By.id("incident.urgency"));
		Select high = new Select(urgency);
		high.selectByVisibleText("1 - High");
	}
	
	@Given("Update State")
	public void updateState() {
		WebElement state = driver.findElement(By.id("incident.state"));
		Select inprog = new Select(state);
		inprog.selectByVisibleText("In Progress");

	}
	@Given("Click Update")
	public void clickUpdate() {
		driver.findElement(By.id("sysverb_update_bottom")).click();

	}

	@Given("Get Urgency value")
	public void getUrgency() {
		verify1 = driver.findElement(By.id("incident.urgency")).getText();

	}
	
	@Given("Get State value")
	public void getState() {
		verify2 = driver.findElement(By.id("incident.state")).getText();

	}
	
	@Then("Verify Urgency")
	public void verifyUrgency() {
		if (verify1.contains("High")) {
			System.out.println("Incident urgency updated as High");
			
		} else {
			System.out.println("Incident urgency not updated");
		}

	}
	
	@Then("Verify State")
	public void verifyState() {
		if (verify2.contains("In Progress" )) {
			System.out.println("Incident state updated as In progress");
			
		} else {
			System.out.println("Incident state not updated");
		}

	}	
}
