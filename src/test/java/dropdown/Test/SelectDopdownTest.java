package dropdown.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import common.BaseTest;
import dropdown.PageObject.SelectDropDownPageObject;

public class SelectDopdownTest extends BaseTest {
	@Test(dependsOnGroups="lanchWebSite")
	public void selectDrop() throws IOException {
		getGlobalData();
		String currency =  prop.getProperty("selectedvalue");
		String passengerType =  prop.getProperty("passengerType");
		String  noPassenger = prop.getProperty("NoOfPassenger");
		int NoOfPassenger = Integer.parseInt(noPassenger);
		SelectDropDownPageObject sp = new SelectDropDownPageObject(driver);
		sp.seletCurrency(currency);
		sp.selectPassenger(passengerType,NoOfPassenger );
	}
}
