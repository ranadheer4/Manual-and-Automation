package com.settings.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Settings_RolesPage extends WebDriverUtility {
//	@FindBy(xpath = "")private WebElement addRole;
	@FindBy(xpath = "//tbody[@role='presentation']/../descendant::td[@aria-colindex='2' and text()='FileShare External User']/../descendant::td[@aria-colindex='5']/../descendant::i")private WebElement threeDotsAction;
	@FindBy(xpath = "//div[@role='menu']//span[text()='Delete']")private WebElement delete;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='OLobby_FirstProject']")private WebElement checkbox;

	public Settings_RolesPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}


//	public WebElement getAddUser() {
//		return addUser;
//	}
	public WebElement getThreeDotsAction() {
		return threeDotsAction;
	}
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	
}
