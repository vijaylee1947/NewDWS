package WishListModule;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import POM_For_FrameWork_onDemoWebShop.ProductDetailsPage;
import POM_For_FrameWork_onDemoWebShop.SearchResult_Page;
import POM_For_FrameWork_onDemoWebShop.WishListPage;

public class TC_Wishlist_007_Test extends Baseclass {
	@Test
	public void wishListTest() {
		SoftAssert soft = new SoftAssert();
		HomePage hp = new HomePage(driver);
		hp.getSearchTextField().sendKeys("smartphone");
		Reporter.log("product name entered into search text field", true);
		hp.getSearchButton().click();
		Reporter.log("clicked on search button", true);

		SearchResult_Page srp = new SearchResult_Page(driver);
		srp.getSearchResultpage();
		Reporter.log("search result page displayed", true);
		srp.getProductlink().click();
		Reporter.log("clicked on product link", true);

		ProductDetailsPage pdp = new ProductDetailsPage(driver);
		pdp.getAddToWishList().click();
		Reporter.log("clicked on addTowishList button", true);
		soft.assertEquals(pdp.getconfirmationMessage().isDisplayed(), "product not added to wishlist");
		Reporter.log("Confirmation message displayed", true);
		pdp.getWishListLink().click();
		Reporter.log("clicked on wishlistlink", true);

		WishListPage wl = new WishListPage(driver);
		soft.assertEquals(wl.getWishListPage().isDisplayed(), "wishlistpage not displayed");
		Reporter.log("WishListPage displayed", true);
		soft.assertEquals(wl.getProductLink().isDisplayed(), "added product not displayed");
		Reporter.log("added product displayed in wishlist page", true);

	}

}
