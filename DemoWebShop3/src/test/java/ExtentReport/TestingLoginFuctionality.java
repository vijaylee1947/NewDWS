package ExtentReport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import UtilityClass.DataUtilityClass;

public class TestingLoginFuctionality {
	@Test
	public void loginTest() throws IOException, InterruptedException {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/loginTest.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest test = reports.createTest("Login Functionality Test");

		WebDriver driver = new ChromeDriver();
		test.log(Status.INFO, "Browser Launched");
		driver.manage().window().maximize();
		test.log(Status.INFO, "Browser Maximized");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "Application launched");
		driver.findElement(By.linkText("Log in")).click();
		test.log(Status.INFO, "clicked on login link");

		WebElement lpage = driver.findElement(By.xpath("//strong[text()='Returning Customer']"));
		if (lpage.isDisplayed()) {
			test.log(Status.PASS, "login page displayed");
		} else {
			test.log(Status.FAIL, "login page not displayed");
		}

		DataUtilityClass data = new DataUtilityClass();
		String un = data.readingDataFromPropertyFile("./src/test/resources/TestData/DemoWebShopLogin.properties",
				"username");
		String pswd = data.readingDataFromPropertyFile("./src/test/resources/TestData/DemoWebShopLogin.properties",
				"password");
		test.log(Status.INFO, "Accessing data from property file");

		driver.findElement(By.id("Email")).sendKeys(un);
		test.log(Status.INFO, "UserName Entered");
		driver.findElement(By.id("Password")).sendKeys(pswd);
		test.log(Status.INFO, "Password Entered");

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		test.log(Status.INFO, "Clicked on Login Button");

		WebElement home = driver.findElement(By.linkText("Log out"));
		if (home.isDisplayed()) {
			test.log(Status.PASS, "Home page displayed");
		} else {
			test.log(Status.FAIL, "login Button is not working");
		}

		driver.findElement(By.linkText("Log out")).click();
		test.log(Status.INFO, "clicked on logout link");

		WebElement loginpage = driver.findElement(By.linkText("Register"));

		if (loginpage.isDisplayed()) {
			test.log(Status.PASS, "welcome page displayed");
		} else {
			test.log(Status.FAIL, "welcome page not displayed");
		}

		reports.flush();
	}

}
