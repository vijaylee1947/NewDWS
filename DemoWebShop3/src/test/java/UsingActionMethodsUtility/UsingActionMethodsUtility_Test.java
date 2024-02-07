package UsingActionMethodsUtility;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import UtilityClass.ActionMethodsUtility;

public class UsingActionMethodsUtility_Test extends Baseclass{
	@Test
	public void registerlink() {
		ActionMethodsUtility act=new ActionMethodsUtility(driver);
		HomePage hp=new HomePage(driver);
		act.contextclick(hp.getShoppingCartlink());
		Reporter.log("RightClicked on Register link");
	}

}
