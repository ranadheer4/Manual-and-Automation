package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class Edit_Provider extends WebDriverUtility {

	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
	@FindBy(xpath = "//span[normalize-space()='Provider Passport']")private WebElement providerPassport;
	@FindBy(id = "provider")private WebElement showAllProvider;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::input[@placeholder='Provider']")private WebElement provider;
	@FindBy(xpath = "//button[normalize-space()='SEARCH']")private WebElement search;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::span[@ngbtooltip='Edit Provider']")private WebElement editProvider;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::button[@aria-controls='Basic Personal Information']/h6")private WebElement basicPI;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::input[@id='8']")private WebElement firstName;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::input[@id='9']")private WebElement lastName;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::input[@id='822']")private WebElement cred;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::input[@id='32']")private WebElement ssn;
	@FindBy(xpath = "//button[normalize-space()='SAVE']")private WebElement save;
	@FindBy(xpath="//input[@placeholder='Email']")private WebElement email;
	@FindBy(xpath = "//input[@placeholder='Password']")private WebElement pwd;
	@FindBy(xpath = "//button[text()='Sign in']")private WebElement loginBtn;
	@FindBy(xpath="//i[@class='fas fa-user-circle fa-2x m-2 userIcon']")private WebElement SignOut;
	
	
	public Edit_Provider(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void mouseHover(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);
		
	}
	public WebElement getProvider() {
		return provider;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getEditProvider() {
		return editProvider;
	}
	public WebElement getBasicPI() {
		return basicPI;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getCred() {
		return cred;
	}
	public WebElement getSsn() {
		return ssn;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getProviderPassport() {
		return providerPassport;
	}
	public WebElement getShowAllProvider() {
		return showAllProvider;
	}
	
	public void moveToLogout(WebDriver driver)
	{
		mouseOverAnElement(driver, SignOut);
		SignOut.click();
	}
	
}
