package RegisterLink;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import POM_For_FrameWork_onDemoWebShop.RegisterPage;

public class TC_Register_005_Functional_Test extends Baseclass{
	
	@Test
	public void registerLinkTest() {
		SoftAssert soft=new SoftAssert();
		HomePage hp=new HomePage(driver);
		
		soft.assertEquals(hp.getRegisterLink().isEnabled(),"Register link not enabled");
		Reporter.log("RegisterLink is Clickable",true);
		hp.getRegisterLink().click();
		Reporter.log("Clicked on register link ",true);
		
		RegisterPage rp=new RegisterPage(driver);
		soft.assertEquals(rp.getRegisterPage().isDisplayed(),"register page not displayed");
		Reporter.log("RegisterPage displayed, Functional testing pass",true);
	
	}

}
