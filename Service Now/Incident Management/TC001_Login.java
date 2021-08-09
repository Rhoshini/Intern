package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("m3GkKEKU8atr");
		driver.findElementByXPath("//button[text()='Log in']").click();
		
		driver.close();
		
		
		
	}

}
