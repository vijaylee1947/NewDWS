package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult_Page {
	
	WebDriver driver;
	
	public SearchResult_Page(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(xpath = "//h1[text()='Search']")
	private WebElement SearchResultpage;

	public WebElement getSearchResultpage() {
		return SearchResultpage;
	}

	@FindBy(linkText = "Smartphone")
	private WebElement productlink;

	public WebElement getProductlink() {
		return productlink;
	}

}
