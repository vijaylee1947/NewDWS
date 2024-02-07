package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage {
	
	WebDriver driver;
	
	PaymentMethodPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(xpath = "//h2[text()='Payment method']")
	private WebElement PaymentMethodPage;

	public WebElement getPaymentMethodPage() {
		return PaymentMethodPage;
	}

	@FindBy(id = "paymentmethod_0")
	private WebElement CashOnDelivery;

	public WebElement getCashOnDelivery() {
		return CashOnDelivery;
	}

	@FindBy(id = "paymentmethod_1")
	private WebElement checkOrMoneyOrder;

	public WebElement getcheckOrMoneyOrder() {
		return checkOrMoneyOrder;
	}

	@FindBy(id = "paymentmethod_2")
	private WebElement CreditCard;

	public WebElement getCreditCard() {
		return CreditCard;
	}

	@FindBy(id = "paymentmethod_3")
	private WebElement PurchaseOrder;

	public WebElement getPurchaseOrder() {
		return PurchaseOrder;
	}

	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
