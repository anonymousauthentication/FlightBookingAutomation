package dropdown.Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import common.BaseTest;

public class TakeScreenShot2 extends BaseTest{
	public static void main(String args[]) throws IOException {
		TakeScreenShot2 ts = new TakeScreenShot2();
		ts.takeScrenShot();
	}
	public  void takeScrenShot() throws IOException {
		initial();
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File source = srcShot.getScreenshotAs(OutputType.FILE);
		File file =  new File(System.getProperty("user.dir")+"//Reports//"+ "image.png");
		Files.copy(source,file);
	}
	public void initial() throws IOException {
		invokeBrowser();
		driver.get("https://www.guru99.com/");
	}
}
