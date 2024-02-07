package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage {
	
	WebDriver driver;
	
	ConfirmOrderPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	

	@FindBy(xpath = "//h2[text()='Confirm order']")
	private WebElement ConfirmOrderPage;

	public WebElement getConfirmOrderPage() {
		return ConfirmOrderPage;
	}

	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
