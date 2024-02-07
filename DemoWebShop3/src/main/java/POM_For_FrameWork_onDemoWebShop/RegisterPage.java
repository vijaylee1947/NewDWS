package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public WebDriver driver;
	
	public RegisterPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(xpath = "//h1[text()='Register']")
	private WebElement Registerpage;

	public WebElement getRegisterPage() {
		return Registerpage;
	}

	@FindBy(id = "gender-male")
	private WebElement clickgendermale;

	public WebElement getGenderMale() {
		return clickgendermale;
	}

	@FindBy(id = "FirstName")
	private WebElement FirstnameTextfield;

	public WebElement getFirstnametextfield() {
		return FirstnameTextfield;
	}

	@FindBy(id = "LastName")
	private WebElement LastnameTextfield;

	public WebElement getLastnameTextfield() {
		return LastnameTextfield;
	}

	@FindBy(id = "Email")
	private WebElement EmailTextfield;

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	@FindBy(id = "Password")
	private WebElement PasswordTextfield;

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPasswordTextfield;

	public WebElement getConfirmPasswordTextfield() {
		return ConfirmPasswordTextfield;
	}

	@FindBy(id = "register-button")
	private WebElement RegisterButton;

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
	@FindBy(xpath = "//div[@class='result']")
	private WebElement confirmationMessage;

	public WebElement getconfirmationMessage() {
		return confirmationMessage;
	}

}
