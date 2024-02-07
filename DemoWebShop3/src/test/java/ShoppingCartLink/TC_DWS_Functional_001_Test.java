package ShoppingCartLink;

import org.testng.annotations.Test;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;

public class TC_DWS_Functional_001_Test extends Baseclass {
	@Test
	public void clickingOnShoppingCartLink() {
		HomePage sc=new HomePage(driver);
		sc.getShoppingCartlink().click();
	}
	
	
	
	

}
