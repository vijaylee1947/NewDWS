package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddressPage_IfYouAreFirstTimeFillingAddress {
	WebDriver driver;
	
	BillingAddressPage_IfYouAreFirstTimeFillingAddress(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement BillingFirstnameTextField;

	public WebElement getBillingFirstnameTextField() {
		return BillingFirstnameTextField;
	}

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement BillingLastnameTextField;

	public WebElement getBillingLastnameTextField() {
		return BillingLastnameTextField;
	}

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement BillingEmailTextField;

	public WebElement getBillingEmail() {
		return BillingEmailTextField;
	}

	@FindBy(id = "BillingNewAddress_Company")
	private WebElement BillingAddressCompanyTextField;

	public WebElement getBillingAddressCompany() {
		return BillingAddressCompanyTextField;
	}

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement BillingAddressCountrydropdown;

	public WebElement getBillingAddressCountryname() {
		return BillingAddressCountrydropdown;
	}

	@FindBy(id = "BillingNewAddress_StateProvinceId")
	private WebElement BillingStateProvince;

	public WebElement getBillingStateProvinceName() {
		return BillingStateProvince;
	}

	@FindBy(id = "BillingNewAddress_City")
	private WebElement BillingAddressCity;

	public WebElement getBillingAddressCityName() {
		return BillingAddressCity;
	}

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement BillingAddress1;

	public WebElement getBillingNewAddress1() {
		return BillingAddress1;
	}

	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement BillingAddress2;

	public WebElement getBillingNewAddress2() {
		return BillingAddress2;
	}

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement BillingZipPostalCode;

	public WebElement getBillingZipPostalCode() {
		return BillingZipPostalCode;
	}

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement BillingPhoneNumber;

	public WebElement getBillingPhoneNumber() {
		return BillingPhoneNumber;
	}

	@FindBy(id = "BillingNewAddress_FaxNumber")
	private WebElement BillingFaxNumber;

	public WebElement getBillingFaxNumber() {
		return BillingFaxNumber;
	}

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
