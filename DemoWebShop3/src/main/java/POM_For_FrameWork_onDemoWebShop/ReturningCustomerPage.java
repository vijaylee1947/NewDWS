package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturningCustomerPage {
	
	WebDriver driver;
	
	public ReturningCustomerPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(xpath = "//strong[text()='Returning Customer']")
	private WebElement ReturningCustomerPage;

	public WebElement getReturningCustomerPage() {
		return ReturningCustomerPage;
	}

	@FindBy(id = "Email")
	private WebElement EmailTextField;

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	@FindBy(id = "Password")
	private WebElement PasswordTextField;

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	@FindBy(id = "RememberMe")
	private WebElement RememberMecheckbox;

	public WebElement getRememberMeCheckBox() {
		return RememberMecheckbox;
	}

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Loginbutton;

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

}
