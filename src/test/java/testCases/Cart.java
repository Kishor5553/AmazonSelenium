package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.AppConstants;
import pages.HomePage;

public class Cart extends BaseClass {
	HomePage homePage;
	
	@Test
	public void addToCart() {
		Assert.assertEquals(AppConstants.HOME_PAGE_TITLE, driver.getTitle());
		homePage = new HomePage();
		homePage.searchItem("Redmi 12");
		homePage.clickOptionFromDropDown();
		homePage.clickOnFirstProduct();
		String price =homePage.getPriceOfProduct();
		System.out.println("Price: "+price);

	}

}
