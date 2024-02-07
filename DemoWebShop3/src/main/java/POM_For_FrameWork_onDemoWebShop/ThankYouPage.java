package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {

	WebDriver driver;

	ThankYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//h1[text()='Thank you']")
	private WebElement ThankYouPage;

	public WebElement getThankYouPage() {
		return ThankYouPage;
	}

	@FindBy(linkText = "Click here for order details.")
	private WebElement ForOrderDetails;

	public WebElement getForOrderDetailslink() {
		return ForOrderDetails;
	}

	@FindBy(xpath = "//input[@class='button-2 order-completed-continue-button']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
