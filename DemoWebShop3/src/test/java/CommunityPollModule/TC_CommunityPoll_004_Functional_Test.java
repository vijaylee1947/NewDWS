package CommunityPollModule;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.CommunityPollOption;

public class TC_CommunityPoll_004_Functional_Test extends Baseclass {

	@Test
	public void CommunityPollTest() {
		SoftAssert soft = new SoftAssert();
		CommunityPollOption cp = new CommunityPollOption(driver);

		soft.assertEquals(cp.getCommunityPollOption().isDisplayed(), "communitypoll option not displayed");
		Reporter.log("CommunityPollOption displayed", true);

//		cp.getGood().click();
//		Reporter.log("Seleceted Good rating", true);
//
//		cp.getVoteButton().click();
//		Reporter.log("Clicked on Vote Button", true);

		soft.assertEquals(cp.getPollResult().isDisplayed(), "Poll Result not displayed");
		Reporter.log("PollResult Displayed,Functional testing is pass", true);

	}

}
