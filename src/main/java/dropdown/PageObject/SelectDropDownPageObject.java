package dropdown.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.utilityclass;

public class SelectDropDownPageObject extends utilityclass {
	WebDriver driver;
	String passengerType;

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

	@FindBy(id = "ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement fromDropDown;

	@FindBy(xpath = "//a[@text='Bengaluru (BLR)']")
	WebElement toCity;

	@FindBy(xpath = "//a[@value=\"MAA\"][1]")
	WebElement fromCity;

	@FindBy(id = "autosuggest")
	WebElement autoSuggestive;

	@FindBy(xpath = "//a[@class=\"ui-corner-all\"]")
	List<WebElement> autoSuggestOptions;

	@FindBy(css = "label[for*=\"ctl00_mainContent_chk_\"]")
	List<WebElement> checkBoxOption;

	@FindBy(css = "input[id*=\"ctl00_mainContent_chk\"]")
	List<WebElement> checkbox;

	@FindBy(id = "ctl00_mainContent_view_date1")
	WebElement calender;

	@FindBy(css = "a[class*=\"ui-state-highlight\"]")
	WebElement currentDate;
	
	@FindBy(id="ctl00_mainContent_btn_FindFlights")
	WebElement searchButton;


	public void selectFromandTo() {
		fromDropDown.click();
		toCity.click();
		fromCity.click();
	}

	public void seletCurrency(String currency) {
		selectDropByWebElement(currencyDropdown, currency);
	}

	public String selectPassenger(String passenger, int NoOfPassenger) {
		passengerDropdown.click();
		switch (passenger) {
		case "ADULT":
			for (int i = 0; i < NoOfPassenger; i++) {
				AdultIncreaseButton.click();
			}
			break;
		case "CHILD":
			for (int i = 0; i < NoOfPassenger; i++) {
				ChildIncreaseButton.click();
			}
			break;
		case "INFANT":
			for (int i = 0; i < NoOfPassenger; i++) {
				InfantIncreaseButton.click();
			}
			break;
		default:
			System.out.println("Wrong Passenger");
		}
		doneButton.click();
		return passengerType = passengerTypeText.getText();
	}

	public void autoSuggesiveOption() throws InterruptedException {
		autoSuggestive.sendKeys("Ind");
		System.out.println(autoSuggestOptions.size());
		for (int i = 0; i < autoSuggestOptions.size(); i++) {
			if (autoSuggestOptions.get(i).getText().equalsIgnoreCase("India")) {
				System.out.println(autoSuggestOptions.get(i).getText());
				// waitforElementToVisible(autoSuggestOptions.get(i));
				autoSuggestOptions.get(i).click();
			}
		}
	}

	public void selectCheckbox() {
		for (int i = 0; i < checkBoxOption.size(); i++) {
			if (checkBoxOption.get(i).getText().equalsIgnoreCase("Senior Citizen")) {
				checkbox.get(i).click();
			}
		}
	}

	public void selectDate() {
		calender.click();
		currentDate.click();
	}


	public void clickSearch() {
		searchButton.click();
	}
}
