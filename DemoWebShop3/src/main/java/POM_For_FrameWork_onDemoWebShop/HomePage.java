package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(linkText = "Register")
	private WebElement RegisterLink;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	@FindBy(id = "small-searchterms")
	private WebElement SearchTextField;

	public WebElement getSearchTextField() {
		return SearchTextField;
	}

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SearchButton;

	public WebElement getSearchButton() {
		return SearchButton;
	}

	@FindBy(linkText = "Log out")
	private WebElement Logoutlink;

	public WebElement getLogoutlink() {
		return Logoutlink;
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement ShoppingCartlink;

	public WebElement getShoppingCartlink() {
		return ShoppingCartlink;
	}

}
