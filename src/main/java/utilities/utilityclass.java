package utilities;
        
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
       
public class utilityclass {
	WebDriver driver;
    
	public utilityclass(WebDriver driver) {
		this.driver = driver;
	}           
    
	public void selectDropByWebElement(WebElement el, String currency) {
		Select sc = new Select(el);
		sc.selectByValue(currency);
	}    
     
	public void selectDropByWebElement(WebElement el, int id) {
		Select sc = new Select(el);
		sc.selectByIndex(id);
	}
	
	public void waitforElementToVisible(WebElement el) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(el));	
	}
}
