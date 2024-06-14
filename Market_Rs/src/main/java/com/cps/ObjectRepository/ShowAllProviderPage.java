package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.WebDriverUtility;

public class ShowAllProviderPage extends WebDriverUtility {

	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
	@FindBy(xpath = "//span[normalize-space()='Provider Passport']")private WebElement providerPassport;
	@FindBy(id = "provider")private WebElement showAllProvider;
	@FindBy(xpath = "//div[text()='Add Provider ']")private WebElement addProvider;
	@FindBy(xpath = "//h6[text()='Basic Personal Information']")private WebElement basicInfo;
	@FindBy(id = "6")private WebElement phyID;
	@FindBy(id = "8")private WebElement fName;
	@FindBy(id = "9")private WebElement lName;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::ng-select[@bindvalue='id']/descendant::input[@id='822']")private WebElement credentials;
	@FindBy(id = "32")private WebElement ssn;
	@FindBy(xpath = "//button[text()='SAVE']")private WebElement savebtn;
	@FindBy(xpath = "//span[text()='Show All Providers']")private WebElement ShowallProvider1;
	@FindBy(xpath = "//div[text()='No']")private WebElement nobtn;
	@FindBy(xpath = "//span[text()='AA']")private WebElement aa;
	private WebDriver driver;
	
	public ShowAllProviderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void mouseHover(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);
		
	}
	public void clickproviderPassport()
	{
		providerPassport.click();
	}
	public void clickShowAllProvider()
	{
		ShowallProvider1.click();
	}
	public void clickaddprovider()
	{
		addProvider.click();
	}
	public void clickBasicInfo()
	{
		basicInfo.click();
	}
	public void firstName(String firstname)
	{
		fName.sendKeys(firstname);
	}
	public void lastName(String lastname) {
		lName.sendKeys(lastname);
	}
	public WebElement getenterCred()
	{
		return credentials;
	}
	public void entervalue()
	{
		aa.click();
	}
	public void enterSSN(String Ssn)
	{
		ssn.sendKeys(Ssn);
	}
	public void clickSave()
	{
		savebtn.click();
	}
	public void mouseHover1(WebDriver driver)
	{
		mouseOverAnElement(driver, nobtn);
		nobtn.click();
	}
	public void select()
	{
		Actions ac=new Actions(driver);
		new Select(credentials).getOptions().equals("AA");
		ac.click();
	}
	
}

