package testcase.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Login {

	public ChromeDriver driver;
	public String excelFileName;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void runLogin(String urlvalue, String Uname, String Pword) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(urlvalue);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//input[@id='user_name']").sendKeys(Uname);
		driver.findElementByXPath("//input[@id='user_password']").sendKeys(Pword);
		driver.findElementByXPath("//button[text()='Log in']").click();
		
	}
	
	@BeforeClass
	@DataProvider
	public String[][] sendData() throws IOException{
	WorkingBooks re = new WorkingBooks();
	String[][] Data = re.excelData(excelFileName);
	return Data;
	
	}
	
	
	
	@AfterMethod
	public void postCondition(){
		driver.close();
	}
	
	

}
