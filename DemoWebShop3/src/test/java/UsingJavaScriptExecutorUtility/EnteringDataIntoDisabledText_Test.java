package UsingJavaScriptExecutorUtility;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import UtilityClass.JavaScriptExecuter;

public class EnteringDataIntoDisabledText_Test extends Baseclass {
	@Test
	public void dataToDisabledText() {
		HomePage hp=new HomePage(driver);
		JavaScriptExecuter jse = new JavaScriptExecuter(driver);
		jse.ScrollintoView(hp.getSearchTextField());
		jse.enteringDataIntoDisabledTextField(hp.getSearchTextField(), "Hello");
		Reporter.log("Entered data into disabled text field", true);
	}

}
