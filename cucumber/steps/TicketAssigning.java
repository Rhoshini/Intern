package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TicketAssigning extends BaseClass{
	
	public void updateGroup() throws InterruptedException {
		driver.findElement(By.id("sys_display.incident.assignment_group")).sendKeys("IT Securities",Keys.ENTER);
		Thread.sleep(1000);
	}

	public void updateWorkNotes() {
		driver.findElement(By.id("activity-stream-textarea")).sendKeys("Work notes updated");


	}
	
	
	
}
