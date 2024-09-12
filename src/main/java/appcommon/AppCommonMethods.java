package appcommon;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class AppCommonMethods {

	By btn_openMenu=By.id("react-burger-menu-btn");
	By link_logOut=By.id("logout_sidebar_link");
	public void logoutApp() throws Exception 
	{
		clickOpenMenu();
		clickLogout();
	}
	private void clickOpenMenu() throws Exception {
		ElementUtils.CutomClick(btn_openMenu);
	}

	private void clickLogout() throws Exception {
		ElementUtils.CutomClick(link_logOut);
	}

}
