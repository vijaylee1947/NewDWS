package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderInformationPage {
	
	WebDriver driver;
	
	OrderInformationPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(xpath = "//h1[text()='Order information']")
	private WebElement OrderInformationPage;

	public WebElement getOrderInformationPage() {
		return OrderInformationPage;
	}

}
