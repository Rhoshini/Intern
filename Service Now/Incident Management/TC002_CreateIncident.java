package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_CreateIncident {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("m3GkKEKU8atr");
		driver.findElement(By.id("sysverb_login")).click();
		
		//driver.switchTo().defaultContent();

		
		driver.findElement(By.id("filter")).sendKeys("incident");		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[text()='Incidents']").click();
		
		WebElement frameinc = driver.findElement(By.id("gsft_main"));
		
		driver.switchTo().frame(frameinc);
		
		driver.findElementByXPath("//button[text()='New']").click();
		
		String Incnum = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println(Incnum);
		
		driver.findElement(By.id("incident.short_description")).sendKeys("Short Description");
		
		driver.findElementByXPath("(//button[text()='Submit'])[2]").click();
		
		
		
		WebElement search = driver.findElement(By.xpath("//input[@class='form-control']"));
		search.click();
		search.sendKeys(Incnum,Keys.ENTER);
		
		Thread.sleep(3000);
		String incnum = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println(incnum);
		
		if (Incnum.contains(incnum)) {
			System.out.println("Incident is created");
			
		}
		else {
			System.out.println("Incident is not created");
		}
		
		driver.close();
		
		
	}

}
