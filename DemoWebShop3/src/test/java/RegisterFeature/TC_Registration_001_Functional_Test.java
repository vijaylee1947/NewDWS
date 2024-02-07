package RegisterFeature;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass_forDemoWebShop.Baseclass;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import POM_For_FrameWork_onDemoWebShop.RegisterPage;
import UtilityClass.DataUtilityClass;

public class TC_Registration_001_Functional_Test extends Baseclass {

	@Test
	public void UserRegistration() throws EncryptedDocumentException, IOException {

		SoftAssert soft = new SoftAssert();
		HomePage h1 = new HomePage(driver);
		h1.getRegisterLink().click();
		Reporter.log("clicked on register link", true);

		RegisterPage r1 = new RegisterPage(driver);

		soft.assertEquals(r1.getRegisterPage().isDisplayed(), "registration page not displayed");
		Reporter.log("register page displayed", true);
		DataUtilityClass data = new DataUtilityClass();
		String[][] details = data.readDataFromMultipleRow("./src/test/resources", "RegistrationDetails.xlsx");
		Reporter.log("entering valid data into all the fields", true);
		r1.getGenderMale().click();
		Reporter.log("selceted gender as male", true);
		r1.getFirstnametextfield().sendKeys(details[0]);
		Reporter.log("entered firstname into first name text field", true);
		r1.getLastnameTextfield().sendKeys(details[1]);
		Reporter.log("entered lastname into lastname text field", true);
		r1.getEmailTextfield().sendKeys(details[2]);
		Reporter.log("entered email into email text field", true);
		r1.getPasswordTextfield().sendKeys(details[3]);
		Reporter.log("entered password into password text field", true);
		r1.getConfirmPasswordTextfield().sendKeys(details[4]);
		Reporter.log("entered confirm password into confirm password text field", true);
		r1.getRegisterButton().click();
		Reporter.log("clicked on register button", true);
		soft.assertEquals(r1.getconfirmationMessage().isDisplayed(), "register button not working");
		Reporter.log("Confirmation message displayed,fuctional testing is pass", true);
		Reporter.log("Functional Testing is pass on Register Button", true);

	}

}
