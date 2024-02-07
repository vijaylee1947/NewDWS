package UsingJavaScriptExecutorUtility;

import org.testng.annotations.Test;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.CommunityPollOption;
import UtilityClass.JavaScriptExecuter;

public class UsingScrollIntoView_Test extends Baseclass {
	@Test
	public void scrollby() {
		CommunityPollOption cp = new CommunityPollOption(driver);
		JavaScriptExecuter jse = new JavaScriptExecuter(driver);
		jse.ScrollintoView(cp.getPollResult());
		
	}

}
