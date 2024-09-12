package tests;

import org.testng.annotations.Test;

import appcommon.AppCommonMethods;
import pages.InventoryPage;
import pages.LoginPage;
import utils.BrowserUtils;

public class TestSuite01 {
	@Test
	public void testCase01() throws Exception {
		LoginPage loginPage=new LoginPage();
		InventoryPage inventoryPage= new InventoryPage();
		AppCommonMethods appCommonMethods = new AppCommonMethods();
		//open browser
		BrowserUtils.openBrowser();
		// invoke app
		BrowserUtils.invokeApp();
		// verify login page
		loginPage.verifyLoginPage();
		// perform login
		loginPage.performLogin();
		// verify login is successfull
		inventoryPage.verifyLoginIsSuccesssfull();
		// logout from app
		appCommonMethods.logoutApp();
		// close Browser
		BrowserUtils.killBrowser();
		
		
	}
}
