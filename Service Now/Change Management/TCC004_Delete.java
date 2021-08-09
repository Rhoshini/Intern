package changemanagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TCC004_Delete {

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
		
		String check = driver.findElement(By.id("change_request.state")).getText();
		
		if (check.contains("New")) {
			
			driver.findElement(By.id("sysverb_delete_bottom")).click();
			driver.findElement(By.id("ok_button")).click();
			
			
		} else {
			System.out.println("Incident state is not NEW");
		}
		
		String record = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
		
		if (record.contains("No records to display")){
			System.out.println("Record successfully Deleted");
		}
		else {
			System.out.println("Record Deletion Unsuccessful");
		}
		
		driver.close();
		
	}

}
