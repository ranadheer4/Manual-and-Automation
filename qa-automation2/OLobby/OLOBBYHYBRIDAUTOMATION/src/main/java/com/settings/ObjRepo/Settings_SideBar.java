package com.settings.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Settings_SideBar extends WebDriverUtility {
	
	@FindBy(xpath = "//a[@routerlink='/settings/location']//*[name()='svg']")private WebElement location;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M12 1.5H8.')]")private WebElement roles;
	@FindBy(xpath = "//a[@routerlink='/settings/users']//*[name()='svg']")private WebElement users;
	@FindBy(xpath = "//a[@routerlink='/settings/systemsettings']")private WebElement systemSettings;
	@FindBy(xpath = "//a[@routerlink='/settings/lookup']")private WebElement lookUp;
	@FindBy(xpath = "//a[@routerlink='/settings/language-caption']")private WebElement languageCaption;
//	@FindBy(xpath = "")private WebElement location;
//	@FindBy(xpath = "")private WebElement location;

	public Settings_SideBar(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoles() {
		return roles;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getSystemSettings() {
		return systemSettings;
	}

	public WebElement getLookUp() {
		return lookUp;
	}

	public WebElement getLanguageCaption() {
		return languageCaption;
	}
	
}
