package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	WebDriver driver;

	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//div[@class='page-title']")
	private WebElement wishListPage;

	public WebElement getWishListPage() {
		return wishListPage;
	}

	@FindBy(linkText = "Smartphone")
	private WebElement productlink;

	public WebElement getProductLink() {
		return productlink;
	}

}
