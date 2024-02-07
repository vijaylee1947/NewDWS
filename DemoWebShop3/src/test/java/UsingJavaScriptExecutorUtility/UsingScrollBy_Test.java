package UsingJavaScriptExecutorUtility;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.CommunityPollOption;
import UtilityClass.JavaScriptExecuter;

public class UsingScrollBy_Test extends Baseclass {
	@Test
	public void ScrollBy() throws InterruptedException {
		JavaScriptExecuter jse = new JavaScriptExecuter(driver);
		CommunityPollOption cp = new CommunityPollOption(driver);
		jse.ScrollBy(0,300);
		String result = cp.getPollResult().getText();
		Reporter.log(result, true);

	}

}
