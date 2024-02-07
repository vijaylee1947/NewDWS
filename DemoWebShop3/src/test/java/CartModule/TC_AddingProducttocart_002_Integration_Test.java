package CartModule;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import POM_For_FrameWork_onDemoWebShop.ProductDetailsPage;
import POM_For_FrameWork_onDemoWebShop.SearchResult_Page;
import POM_For_FrameWork_onDemoWebShop.ShoppingCartPage;

public class TC_AddingProducttocart_002_Integration_Test extends Baseclass {
	@Test
	public void addProductToCart() {
		SoftAssert soft = new SoftAssert();

		HomePage h1 = new HomePage(driver);
		h1.getSearchTextField().sendKeys("smartphone");
		Reporter.log("searching smartphone", true);
		h1.getSearchButton().click();
		Reporter.log("clicked on search button", true);

		SearchResult_Page s1 = new SearchResult_Page(driver);
		Reporter.log("Search result page displayed", true);
		s1.getProductlink().click();
		Reporter.log("Clicked on Particular Product link", true);

		ProductDetailsPage p1 = new ProductDetailsPage(driver);
		p1.getProductDetailsPage();
		Reporter.log("Product details page displayed", true);
		p1.getAddtoCartButton().click();
		Reporter.log("clicked on add to cart button", true);

		h1.getShoppingCartlink().click();
		Reporter.log("clicked on shopping cart link", true);

		ShoppingCartPage sc = new ShoppingCartPage(driver);
		soft.assertEquals(sc.getShoppingcartpage().isDisplayed(), "shoppingcart page not displayed");
		Reporter.log("Shopping cart page displayed", true);
		soft.assertEquals(sc.getProductlink(),"smartphone", "Added Product not displayed in cart");
		Reporter.log("Added Product displayed in cart", true);
		Reporter.log("Integration Testing is pass", true);
	}

}
