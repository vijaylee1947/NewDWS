package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityPollOption {

	WebDriver driver;

	public CommunityPollOption(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//strong[text()='Community poll']")
	private WebElement communitypolloption;

	public WebElement getCommunityPollOption() {
		return communitypolloption;
	}

	@FindBy(id = "pollanswers-1")
	private WebElement Excellent;

	public WebElement getExcellent() {
		return Excellent;
	}

	@FindBy(id = "pollanswers-2")
	private WebElement Good;

	public WebElement getGood() {
		return Good;
	}

	@FindBy(id = "pollanswers-3")
	private WebElement Poor;

	public WebElement getPoor() {
		return Poor;
	}

	@FindBy(id = "pollanswers-4")
	private WebElement VeryBad;

	public WebElement getVeryBad() {
		return VeryBad;
	}

	@FindBy(id = "vote-poll-1")
	private WebElement VoteButton;

	public WebElement getVoteButton() {
		return VoteButton;
	}

	@FindBy(xpath = "//ul[@class='poll-results']")
	private WebElement PollResult;

	public WebElement getPollResult() {
		return PollResult;
	}

}
