package dropdown.Test;

import java.io.IOException;

import org.testng.annotations.Test;
import common.BaseTest;

public class launchWebTest extends BaseTest {
	@Test(groups="lanchWebSite")
	public void launchWeb() throws IOException {
		launchSite();
	}
}
