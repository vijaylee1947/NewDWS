package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartingPage {
	
	WebDriver driver;
	
	public StartingPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(linkText = "Register")
	private WebElement Registerlink;

	public WebElement getRegisterlink() {
		return Registerlink;
	}

	@FindBy(linkText = "Log in")
	private WebElement Loginlink;

	public WebElement getLoginlink() {
		return Loginlink;
	}

}
