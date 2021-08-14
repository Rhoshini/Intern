package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLoginSteps extends BaseClass{
	
	/*@Given("Open the Chrome Browser")
	public void openChrome() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	
	@Given("Load Application url as {string}")
	public void enterUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}*/
	
	@Given("Enter the username as {string}")
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

	}
	
	@Then("Homepage should be displayed")
	public void homePage() {
		System.out.println("Home page is displayed");

	}
	
	
	
}