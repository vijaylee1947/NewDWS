package BaseClass_forDemoWebShop;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import POM_For_FrameWork_onDemoWebShop.HomePage;
import POM_For_FrameWork_onDemoWebShop.ReturningCustomerPage;
import POM_For_FrameWork_onDemoWebShop.StartingPage;
import UtilityClass.DataUtilityClass;
import UtilityClass.FrameWorkConstants;

public class Baseclass implements FrameWorkConstants {

	//Creating global variables
	//base class
	public WebDriver driver;
	SoftAssert action = new SoftAssert();
	DataUtilityClass data = new DataUtilityClass();
	HomePage home;
	StartingPage s;
	ReturningCustomerPage lp;
	StartingPage sp;
	WebDriverWait wait;
	public static ExtentReports reports;
	public static ExtentTest test;
	@BeforeSuite
	public void reports() {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/DWS.html");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
	}
	
	@BeforeClass
	@Parameters("browsername")
	public void AccesingBuild(@Optional("chrome") String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		Reporter.log("Browser Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximised", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(explicitWait));
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
	}

	@BeforeMethod
	public void loginTest(Method method) throws EncryptedDocumentException, IOException {
		String url2 = data.readingDataFromPropertyFile(propertyPath, "url");
		driver.get(url2);
		Reporter.log("Application Launched", true);
		s = new StartingPage(driver);
		home = new HomePage(driver);
		lp = new ReturningCustomerPage(driver);
		s.getLoginlink().click();
		Reporter.log("clicked on login link", true);
		lp = new ReturningCustomerPage(driver);
		action.assertEquals(lp.getReturningCustomerPage().isDisplayed(), "SmokeTesting is fail");
		Reporter.log("Login page displayed", true);
		Reporter.log("SmokeTesting is pass on login link", true);
		String username = data.readingDataFromPropertyFile(FrameWorkConstants.propertyPath, "username");
		String password = data.readingDataFromPropertyFile(propertyPath, "password");
		lp.getEmailTextField().sendKeys(username);
		lp.getPasswordTextField().sendKeys(password);
		lp.getRememberMeCheckBox().click();
		lp.getLoginbutton().click();
		Reporter.log("Clicked on login button", true);
		action.assertEquals(home.getLogoutlink().isDisplayed(), "Home page not displayed");
		Reporter.log("Home page displayed", true);
		Reporter.log("SmokeTesting is pass on login button", true);
		test=reports.createTest(method.getName());
	}

	@AfterMethod
	public void logoutTest() {
		home.getLogoutlink().click();
		Reporter.log("Clicked On logout link", true);
		sp = new StartingPage(driver);
		action.assertEquals(sp.getRegisterlink().isDisplayed(), true);
		Reporter.log("User Successfully LogedOut", true);
		Reporter.log("E2E Testing is Pass :)", true);

	}

	@AfterClass
	public void quitbrowser() {
		driver.quit();
		Reporter.log("Browser Window Closed", true);
	}
	
	@AfterSuite
	public void flush() {
		reports.flush();
	}

}
