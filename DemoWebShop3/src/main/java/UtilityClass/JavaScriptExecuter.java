package UtilityClass;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuter {

	WebDriver driver;

	JavascriptExecutor js;

	public JavaScriptExecuter(WebDriver driver) {
		js = (JavascriptExecutor) driver;
	}

	public void ScrollBy(int x, int y) {
		js.executeScript("window.scrollBy("+x+","+y+");");
	}

	public void ScrollintoView(WebElement target) {
		js.executeScript("arguments[0].scrollIntoView(true);", target);
	}

	public void enteringDataIntoDisabledTextField(WebElement target,String data) {
		js.executeScript("arguments[0].value='"+data+"';", target);
	}
	
	public void clearingTheData(WebElement target) {
		js.executeScript("arguments[0].value='';",target);
	}

	public void handlingDisabledButton(WebElement target) {
		js.executeScript("arguments[0].click();", target);
	}
}
