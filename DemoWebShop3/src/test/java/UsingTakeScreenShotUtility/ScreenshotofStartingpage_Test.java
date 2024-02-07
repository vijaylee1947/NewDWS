package UsingTakeScreenShotUtility;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.ReturningCustomerPage;
import UtilityClass.TakeScreenShootUtility;

public class ScreenshotofStartingpage_Test extends Baseclass {
	@Test
	public void ScreenShotOfWebPage() throws IOException {
		ReturningCustomerPage rc = new ReturningCustomerPage(driver);
		TakeScreenShootUtility img = new TakeScreenShootUtility(driver);
		img.screenshotOfWebpage(rc.getReturningCustomerPage());
		Reporter.log("ScreenShot of DemoWebPageLogin", true);

	}

}
