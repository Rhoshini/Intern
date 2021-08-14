package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateIncidentSteps extends BaseClass {
	String Incnum, incnum;
	
	/*@Given("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.switchTo().frame(0);
		driver.findElementByXPath("//input[@id='user_name']").sendKeys(uname);

	}
	
	@Given("Enter the password as {string}")
	public void enterPword(String pword) {
		driver.findElementByXPath("//input[@id='user_password']").sendKeys(pword);
	}
	
	@When("Click on Login Button")
	public void clickLogin() {
		driver.findElementByXPath("//button[text()='Log in']").click();

	}*/
	
	@Given("Click Incident")
	public void clickInc() throws InterruptedException {
		driver.findElement(By.id("filter")).sendKeys("incident");		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[text()='Incidents']").click();

	}

	@Given("Click New Button")
	public void clickNew() {
		WebElement frameinc = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frameinc);
		driver.findElementByXPath("//button[text()='New']").click();

	}
	
	@Given("Get Incident Number")
	public void getInc() {
		Incnum = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println(Incnum);

	}
	
	@Given("Enter mandatory details and submit")
	public void enterMandit() {
		driver.findElement(By.id("incident.short_description")).sendKeys("Short Description");
		driver.findElementByXPath("(//button[text()='Submit'])[2]").click();

	}
	
	
	@Given("Enter the captured incident number")
	public void enterCaptured() {
		WebElement search = driver.findElement(By.xpath("//input[@class='form-control']"));
		search.click();
		search.sendKeys(Incnum,Keys.ENTER);

	}
	
	@Given("Get the resulting incident number")
	public void getResultant() throws InterruptedException {
		Thread.sleep(3000);
		incnum = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println(incnum);

	}
	
	@Then("Verify the result")
	public void verifyTheResult() {
		if (Incnum.contains(incnum)) {
			System.out.println("Incident is created");
			
		}
		else {
			System.out.println("Incident is not created");
		}

	}
	
	
	
	
	
}
