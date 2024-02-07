package ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReport {
	
	@Test
	public void login() {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/login.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		ExtentTest test=report.createTest("launching the Application");
		
		WebDriver driver= new ChromeDriver();
		test.log(Status.INFO, "Browser is launched");
		driver.manage().window().maximize();
		test.log(Status.INFO,"Browser Maximized");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO,"DemoWebShop launched");
		report.flush();
	}

}
