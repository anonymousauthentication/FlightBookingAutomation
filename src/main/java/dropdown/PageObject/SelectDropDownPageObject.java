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
	WebElement currencyDropdown;

	@FindBy(id = "divpaxinfo")
	WebElement passengerDropdown;

	@FindBy(xpath = "//label[@class=\"guestlbl\"]")
	WebElement passengerTypeText;

	@FindBy(xpath = "//div[@id=\"divAdult\"] /div/span[@id=\"hrefDecAdt\"]")
	WebElement AdultdecreaseButton;

	@FindBy(xpath = "//div[@id=\"divAdult\"] /div/span[@id=\"hrefIncAdt\"]")
	WebElement AdultIncreaseButton;

	@FindBy(xpath = "//div[@id=\"divChild\"] /div/span[@id=\"hrefIncChd\"]")
	WebElement ChildIncreaseButton;

	@FindBy(xpath = "//div[@id=\"divInfant\"] /div/span[@id=\"hrefIncInf\"]")
	WebElement InfantIncreaseButton;

	@FindBy(css = "input[value=\"Done\"]")
	WebElement doneButton;

	public void seletCurrency(String currency) {
		selectDropByWebElement(currencyDropdown, currency);
	}

	public void selectPassenger(String passenger, int NoOfPassenger) {
		// String passengerType = passengerTypeText.getText();
		passengerDropdown.click();
		switch (passenger) {
		case "ADULT":
			System.out.println("ADULT");
			for (int i = 0; i < NoOfPassenger; i++) {
				AdultIncreaseButton.click();
			}
			break;
		case "CHILD":
			System.out.println("CHILD");
			for (int i = 0; i < NoOfPassenger; i++) {
				ChildIncreaseButton.click();
			}
			break;
		case "INFANT":
			System.out.println("INFANT");
			for (int i = 0; i < NoOfPassenger; i++) {
				InfantIncreaseButton.click();
			}
			break;
		default:
			System.out.println("Wrong Passenger");
		}
		doneButton.click();
	}

}
