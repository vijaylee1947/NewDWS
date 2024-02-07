package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressPage {
	
	WebDriver driver;
	ShippingAddressPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(xpath = "//h2[text()='Shipping address']")
	private WebElement ShippingAddressPage;

	public WebElement getShippingAddressPage() {
		return ShippingAddressPage;
	}
	
	@FindBy(id = "shipping-address-select")
	private WebElement FromAddressBookOrNewAddressdropdown;

	public WebElement getFromAddressBookOrNewAddressdropdown() {
		return FromAddressBookOrNewAddressdropdown;
	}

	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
