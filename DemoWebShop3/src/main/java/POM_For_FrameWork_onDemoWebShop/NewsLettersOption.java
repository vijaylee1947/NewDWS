package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsLettersOption {

	WebDriver driver;

	public NewsLettersOption(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//strong[text()='Newsletter']")
	private WebElement newsletteroption;

	public WebElement getNewsLetterOptions() {
		return newsletteroption;
	}

	@FindBy(id = "newsletter-email")
	private WebElement emailtextfield;

	public WebElement getEmailTextField() {
		return emailtextfield;
	}

	@FindBy(id = "newsletter-subscribe-button")
	private WebElement subscribebutton;

	public WebElement getSubscribeButton() {
		return subscribebutton;
	}
	
	@FindBy(id = "newsletter-result-block")
	private WebElement resultblock;
	public WebElement getResultBlock() {
		return resultblock;
	}
}
