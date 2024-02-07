package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OmayoDisabledTextFiled {

	WebDriver driver;

	public OmayoDisabledTextFiled(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(id = "tb2")
	private WebElement disabledTextField;

	public WebElement getdisabledTextField() {
		return disabledTextField;
	}

}
