package dropdown.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.utilityclass;

public class SelectDropDownPageObject extends utilityclass {
	WebDriver driver;

	public SelectDropDownPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_mainContent_DropDownListCurrency")
	WebElement selectdrop;
	public void seletdropCheck(String selectedvalue) {
		selectDropByWebElement(selectdrop, selectedvalue);
	}
}
