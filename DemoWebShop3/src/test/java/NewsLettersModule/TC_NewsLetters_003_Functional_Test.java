package NewsLettersModule;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.NewsLettersOption;

public class TC_NewsLetters_003_Functional_Test extends Baseclass {
	@Test
	public void newsletterOption() {
		SoftAssert soft = new SoftAssert();
		NewsLettersOption n1 = new NewsLettersOption(driver);
		soft.assertEquals(n1.getNewsLetterOptions().isDisplayed(), "news letter option not displayed");
		Reporter.log("news letter option displayed", true);
		n1.getEmailTextField().sendKeys("vijaylee1947@gmail.com");
		Reporter.log("entered email into email text field", true);
		n1.getSubscribeButton().click();
		Reporter.log("clicked on subscribe button", true);
		soft.assertEquals(n1.getResultBlock().isDisplayed(), "Resultblock not displayed");
		Reporter.log("ResultBlock displayed,Functional testing is pass");

	}

}
