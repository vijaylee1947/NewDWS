package UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionMethodsUtility {

	WebDriver driver;
	Actions action;
	
	public ActionMethodsUtility(WebDriver driver) {
		action = new Actions(driver);
	}
	
		public void moveToelement(WebElement target) {
		action.moveToElement(target).perform();
	}

	public void clickNoArg(WebElement target) {
		action.moveToElement(target).click().perform();
		}

	public void click(WebElement ele) {
		action.click(ele).perform();
	}

	public void doubleclickNoArg(WebElement target) {
		action.moveToElement(target).doubleClick().perform();
	}

	public void doublclick(WebElement ele) {
		action.doubleClick(ele).perform();
	}

	public void contextclickNoArg(WebElement target) {
		action.moveToElement(target).contextClick().perform();
	}

	public void contextclick(WebElement ele) {
		action.contextClick(ele).perform();
	}

	public void moveToelementUsingCo_ordinates(WebElement ele,int x,int y) {
		action.moveToElement(ele, x, y).perform();
	}

	public void moveByoffset(int x,int y) {
		action.moveByOffset(x, y).perform();
	}

	public void dragAnddrop(WebElement src, WebElement target) {
		action.dragAndDrop(src, target).perform();
	}

	public void dragAnddrop(WebElement src, int x, int y) {
		action.dragAndDropBy(src, x, y).perform();
	}

	public void clickAndhold(WebElement ele) {
		action.clickAndHold(ele).perform();
	}

	public void release(WebElement ele) {
		action.release(ele).perform();
	}

	public void sendkeys(WebElement ele, String data) {
		action.sendKeys(ele,data).perform();
	}

	public void keysdown(CharSequence ch) {
		action.keyDown(ch).perform();
	}

	public void keysdown(WebElement ele,CharSequence ch) {
		action.keyDown(ele, ch).perform();
	}

	public void keysup(CharSequence ch) {
		action.keyUp(ch).perform();
	}

	public void keyup(WebElement ele,CharSequence ch) {
		action.keyUp(ele, ch).perform();
	}

}
