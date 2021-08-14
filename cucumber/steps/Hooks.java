package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	
	@Before
	public void preCondition() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit. SECONDS);
	}
	
	@After
	public void postCondition() {
		driver.close();
	}
	

}
