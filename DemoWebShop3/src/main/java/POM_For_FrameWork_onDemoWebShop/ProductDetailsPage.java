package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//div[@class='page product-details-page']")
	private WebElement ProductDetailsPage;

	public WebElement getProductDetailsPage() {
		return ProductDetailsPage;
	}

	@FindBy(id = "add-to-cart-button-43")
	private WebElement AddtoCartButton;

	public WebElement getAddtoCartButton() {
		return AddtoCartButton;
	}

	@FindBy(linkText = "shopping cart")
	private WebElement ConfirmationMessage;

	public WebElement getConfirmationMessage() {
		return ConfirmationMessage;
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement ShoppingCartlink;

	public WebElement getShoppingCartlink() {
		return ShoppingCartlink;
	}

	@FindBy(id = "addtocart_43_EnteredQuantity")
	private WebElement QuantityTextField;

	public WebElement getQuantity() {
		return QuantityTextField;
	}

	@FindBy(id = "add-to-wishlist-button-43")
	private WebElement AddToWishList;

	public WebElement getAddToWishList() {
		return AddToWishList;
	}

	@FindBy(linkText = "wishlist")
	private WebElement confirmationMessage;

	public WebElement getconfirmationMessage() {
		return confirmationMessage;
	}

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistlink;

	public WebElement getWishListLink() {
		return wishlistlink;
	}
}
