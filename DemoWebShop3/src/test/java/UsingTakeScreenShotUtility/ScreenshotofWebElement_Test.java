package UsingTakeScreenShotUtility;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import UtilityClass.TakeScreenShootUtility;

public class ScreenshotofWebElement_Test extends Baseclass {
	@Test
	public void searchburron() throws IOException {
		TakeScreenShootUtility img = new TakeScreenShootUtility(driver);
		HomePage hp = new HomePage(driver);
		img.screenShotOfWebElement(hp.getSearchButton());
	}

}
