package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage {
	
	WebDriver driver;
	
	PaymentInformationPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(xpath = "//h2[text()='Payment information']")
	private WebElement PaymentInformationPage;

	public WebElement getPaymentInformationPage() {
		return PaymentInformationPage;
	}

	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
