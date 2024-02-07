package UtilityClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class TakeScreenShootUtility {

	WebDriver driver;
	TakesScreenshot ts;

	public TakeScreenShootUtility(WebDriver driver) {
		ts = (TakesScreenshot) driver;
	}

	public void screenshotOfWebpage(WebElement ele) throws IOException {
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("./errorshots/ele1.png");
		FileHandler.copy(temp, file);
	}

	public void screenShotOfWebElement(WebElement ele) throws IOException {
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File file = new File("./errorshots/ele2.png");
		FileHandler.copy(temp, file);
	}

}
