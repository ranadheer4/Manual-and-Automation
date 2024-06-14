package com.settings.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Settings_UsersPage extends WebDriverUtility {
//	@FindBy(xpath = "")private WebElement addUser;
	@FindBy(xpath = "//tbody[@role='presentation']/../descendant::td[@aria-colindex='2' and text()='Supriya']/../descendant::td[@aria-colindex='7']/../descendant::i")private WebElement threeDotsAction;
	@FindBy(xpath = "//div[@role='menu']//span[text()='Delete']")private WebElement delete;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='supriya.kotturi@nstarxinc.com']")private WebElement checkbox;

	public Settings_UsersPage(WebDriver driver)
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
