package AddToCartButton;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import POM_For_FrameWork_onDemoWebShop.ProductDetailsPage;
import POM_For_FrameWork_onDemoWebShop.SearchResult_Page;

public class TC_AddToCart_008_Functional_Test extends Baseclass {
	@Test
	public void AddToCartTest() {
		SoftAssert soft = new SoftAssert();
		HomePage hp = new HomePage(driver);
		hp.getSearchTextField().sendKeys("smartphone");
		Reporter.log("entered product name into search text field", true);
		hp.getSearchButton().click();
		test.log(Status.INFO,"clicked on search button");
		test.log(Status.INFO,"i am ready");

		SearchResult_Page srp = new SearchResult_Page(driver);
		soft.assertEquals(srp.getSearchResultpage().isDisplayed(), "search result page not displayed");
		Reporter.log("Search result page displayed", true);
		srp.getProductlink().click();
		Reporter.log("clicked on product link", true);

		ProductDetailsPage pdp = new ProductDetailsPage(driver);
		soft.assertEquals(pdp.getProductDetailsPage().isDisplayed(), "product details page not displayed");
		Reporter.log("product details page displayed", true);
		pdp.getQuantity().sendKeys("2");
		Reporter.log("entered quantity into quantity text field", true);
		pdp.getAddtoCartButton().click();
		Reporter.log("clicked on addTocart Button", true);
		soft.assertEquals(pdp.getConfirmationMessage().isDisplayed(), "Confirmation message not displayed");
		Reporter.log("Confirmation message displayed,Functional testing is pass on addTocart button", true);
	}

}
