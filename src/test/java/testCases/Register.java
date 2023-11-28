package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import constants.AppConstants;
import pages.HomePage;
import pages.RegisterPage;

public class Register extends BaseClass{

	HomePage homePage;
	RegisterPage registerPage;
	
	@Test
	public void RegisterUser() {
		homePage = new HomePage();
		homePage.mouseHoverOnAccountListLink();
		registerPage = homePage.clickOnNewCustomerRegisterLink();
		Assert.assertEquals(AppConstants.REGISTER_PAGE_TITLE, driver.getTitle());
		registerPage.enterYourName("Ben");
		registerPage.enterMobileNumber("9876584215");
		registerPage.enterNewPassword("Password123");
		
	}
	
}
