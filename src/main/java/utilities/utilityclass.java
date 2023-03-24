package utilities;
        
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
       
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
}
