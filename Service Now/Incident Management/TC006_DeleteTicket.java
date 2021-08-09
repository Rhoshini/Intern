package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_DeleteTicket {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("m3GkKEKU8atr");
		driver.findElementByXPath("//button[text()='Log in']").click();
		
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
		
		
		WebElement inc = driver.findElement(By.xpath("//input[@class='form-control']"));
		inc.click();
		inc.sendKeys(Incnum,Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		driver.findElement(By.id("sysverb_delete_bottom")).click();
		
		driver.findElement(By.id("ok_button")).click();
		
		String text = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
		
		if (text=="No records to display") {
			System.out.println("Incident successfully deleted");
		}
		else {
			System.out.println("Incident not deleted");
		}
	}

}
