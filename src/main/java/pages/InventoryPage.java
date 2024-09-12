package pages;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class InventoryPage 
{
	By txt_products=By.xpath("//span[text()='Products']");
	public void verifyLoginIsSuccesssfull() throws Exception 
	{
		if (ElementUtils.checkForVisibilty(txt_products)) {
			System.out.println("Pass: User in in inventory page of app");
		} else {
			System.out.println("Fail: User not in inventory page of app");
		}
	}

}
