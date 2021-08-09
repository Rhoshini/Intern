package testcase.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC007_ErrorMessage extends TC001_Login {

	
	@Test
	public  void runErrorMessage() throws InterruptedException {
		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("m3GkKEKU8atr");
		driver.findElementByXPath("//button[text()='Log in']").click();*/

		driver.findElement(By.id("filter")).sendKeys("incident");

		Thread.sleep(3000);

		driver.findElementByXPath("//div[text()='Incidents']").click();
		WebElement frameinc = driver.findElement(By.id("gsft_main"));

		driver.switchTo().frame(frameinc);

		driver.findElementByXPath("//button[text()='New']").click();
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		
		String error = driver.findElement(By.id("output_messages")).getText();
		System.out.println(error);
		if (error.contains("Error")) {
			System.out.println("Error Message is Displayed");
			
		}
		else {
			System.out.println("Error Message not Displayed");
		}
		
			
		

	}

}
