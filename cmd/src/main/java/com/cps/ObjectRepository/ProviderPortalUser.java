package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class ProviderPortalUser extends WebDriverUtility {

	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
    @FindBy(xpath = "//section[@id='wrapper']/descendant::span[text()='Settings']")private WebElement settings;
    @FindBy(xpath = "//section[@id='wrapper']/descendant::span[text()='Provider Portal User']")private WebElement pPortalUser;
    @FindBy(xpath = "//section[@id='wrapper']/descendant::div[@class='btn tabButton']/img[@src='./assets/images/allProviders.png']")private WebElement providersList;
    @FindBy(xpath = "//section[@id='wrapper']/descendant::input[@id='email']")private WebElement email;
    @FindBy(xpath = "//section[@id='wrapper']/descendant::input[@id='credential']")private WebElement pwd;
	@FindBy(xpath = "//button[normalize-space()='Add To Portal']")private WebElement addToportal;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::a[text()='border alan']")private WebElement providerSelect;
	@FindBy(xpath = "//body[@class='modal-open']/descendant::div[text()='No']")private WebElement noBtn;
	
	
	public ProviderPortalUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void mouseHover(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);
		
	}


	public WebElement getMouseLeftSideBar() {
		return mouseLeftSideBar;
	}


	public WebElement getSettings() {
		return settings;
	}


	public WebElement getpPortalUser() {
		return pPortalUser;
	}


	public WebElement getProvidersList() {
		return providersList;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPwd() {
		return pwd;
	}


	public WebElement getAddToportal() {
		return addToportal;
	}


	public WebElement getProviderSelect() {
		return providerSelect;
	}


	public WebElement getNoBtn() {
		return noBtn;
	}
	
	
}
