package dropdown.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import common.BaseTest;
import dropdown.PageObject.SelectDropDownPageObject;

public class SelectDopdownTest extends BaseTest {
	@Test(dependsOnGroups="lanchWebSite")
	public void selectDrop() throws IOException {
		getGlobalData();
		String selectedvalue =  prop.getProperty("selectedvalue");
		SelectDropDownPageObject sp = new SelectDropDownPageObject(driver);
		sp.seletdropCheck(selectedvalue);
	}
}
