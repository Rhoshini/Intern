package changemanagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TCC003_Update {

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

		
		driver.findElement(By.id("filter")).sendKeys("Change");		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[text()='Create New'])[3]")).click();
				
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("(//div[@class='chg-model-model-description change-model-truncate'])[2]")).click();
		String changeid = driver.findElement(By.id("change_request.number")).getAttribute("value");
		System.out.println(changeid);
		
		driver.findElement(By.id("change_request.short_description")).sendKeys("Short Description");
		
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//div[text()='Open'])[3]")).click();
		
		driver.switchTo().frame("gsft_main");
		
		WebElement sea = driver.findElement(By.id("change_request_table_header_search_control"));
		sea.click();
		sea.sendKeys(changeid,Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		driver.findElement(By.xpath("//span[text()='Schedule']")).click();
		
		driver.findElement(By.xpath("//span[@class='icon-calendar icon']")).click();
		
		driver.findElement(By.id("GwtDateTimePicker_day8")).click();
		
		driver.findElement(By.id("GwtDateTimePicker_ok")).click();
		
		driver.findElement(By.xpath("(//span[@class='icon-calendar icon'])[2]")).click();
		
		driver.findElement(By.id("GwtDateTimePicker_day12")).click();
		
		driver.findElement(By.id("GwtDateTimePicker_ok")).click();
		
		driver.findElement(By.id("label.ni.change_request.cab_required")).click();
		
		driver.findElement(By.xpath("(//span[@class='icon icon-calendar'])[4]")).click();
		
		driver.findElement(By.id("GwtDateTimePicker_day10")).click();
		
		driver.findElement(By.xpath("(//button[@class='form_action_button  action_context btn btn-default'])[2]")).click();
	
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		String startdate = driver.findElement(By.xpath("//input[@id='change_request.start_date']")).getAttribute("value");
		System.out.println("Schedule start date:" +startdate);
		String enddate = driver.findElement(By.xpath("//input[@id='change_request.end_date']")).getAttribute("value");
		System.out.println("Schedule end date:" +enddate);
		
		String cab = driver.findElement(By.xpath("(//input[@value='true'])[7]")).getAttribute("value");
		System.out.println("Cab added or not:" +cab);
		
		String cabdate = driver.findElement(By.id("change_request.cab_date")).getAttribute("value");
		System.out.println("Cab Scheduled date:" +cabdate);
		
		if (startdate.contains("9")) {
				if (cab.contains("true")) {
						System.out.println("Schedule updated successfully");
						
					}
				}
			
		else {
			System.out.println("Schedule update unsuccessful");
		}
		
		
		
		System.out.println("Done");
		driver.close();
		
	}

}
