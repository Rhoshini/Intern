package testcase.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_TicketAssigning extends TC001_Login{

	
	@Test(dataProvider="sendData")
	public  void runTicketAssigning(String shortdes, String notes ) throws InterruptedException {
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
		
		String Incnum = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println(Incnum);
		
		driver.findElement(By.id("incident.short_description")).sendKeys(shortdes);
		
		driver.findElementByXPath("(//button[text()='Submit'])[2]").click();
		
		driver.switchTo().defaultContent();
		
		WebElement again = driver.findElement(By.id("filter"));		
		again.clear();
		again.sendKeys("Incident");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@data-id='b55fbec4c0a800090088e83d7ff500de']//div[1]")).click();
		
		driver.switchTo().frame(frameinc);
		
		driver.findElement(By.id("incident_table_header_search_control")).sendKeys(Incnum,Keys.ENTER);

		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();		
		
		driver.findElement(By.id("sys_display.incident.assignment_group")).sendKeys("IT Securities",Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.id("activity-stream-textarea")).sendKeys(notes);
		driver.findElement(By.id("sysverb_update_bottom")).click();
		
	
		}

	@BeforeSuite
	public void setFileName() {
		excelFileName = "TicketAssign";
	}

}
