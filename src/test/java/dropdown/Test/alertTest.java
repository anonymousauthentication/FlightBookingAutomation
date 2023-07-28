package dropdown.Test;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import common.BaseTest;

public class alertTest extends BaseTest {
	@Test
	public void alertCheck() throws IOException, InterruptedException {
		invokeBrowser();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Manohar");
		driver.findElement(By.id("alertbtn")).click();
		Alert d = driver.switchTo().alert();
		String alertString = d.getText();
		Thread.sleep(1000);
		System.out.println(alertString);
		Thread.sleep(1000);
		d.accept();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);
		d.accept();
	}
}
