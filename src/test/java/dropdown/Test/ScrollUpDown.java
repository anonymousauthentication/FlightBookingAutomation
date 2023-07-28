package dropdown.Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

import common.BaseTest;

public class ScrollUpDown extends BaseTest{
	public static void main(String args[]) throws IOException {
		ScrollUpDown sc = new ScrollUpDown();
		//sc.ScrollDownDirect();
		//sc.ScrollDownElement();
		sc.ScrollTillEnd();
	}
	public void initial() throws IOException {
		invokeBrowser();
		driver.get("https://www.guru99.com/");
	}
	public  void ScrollDownDirect() throws IOException {
		initial();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
	}
	
	public void ScrollDownElement() throws IOException {
		initial();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ee = driver.findElement(By.cssSelector("h2[id=\"scenario-3-to-scroll-down-the-web-page-at-the-bottom-of-the-page\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrolIntoView();", ee);
	}
	
	public void ScrollTillEnd() throws IOException {
		initial();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
}
