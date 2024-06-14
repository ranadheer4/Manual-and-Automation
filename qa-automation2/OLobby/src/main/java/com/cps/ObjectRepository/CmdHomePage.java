package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public class CmdHomePage extends WebDriverUtility{
	
	@FindBy(xpath="//div[text()='ADD TASK ']")private WebElement addTask;
	
	@FindBy(xpath="//div[text()='ADD NOTE ']")private WebElement addNote;
	
	@FindBy(xpath="//div[text()='GENERATE FORM '] ")private WebElement generateForm;
	
	@FindBy(xpath="//i[@class='fas fa-user-circle fa-2x m-2 userIcon']")private WebElement SignOut;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")private WebElement LogoutLink;
	
	@FindBy(xpath="(//span[text()='Workflow'])[1]/..")private WebElement workflow;
	
	@FindBy(xpath="//span[normalize-space()='Close Multiple']/../i")private WebElement closeMultiple;
	
	@FindBy(xpath="//span[text()='Settings']/../i")private WebElement clickOnSetting;
	
	@FindBy(xpath="//span[text()='Onboarding Forms']/../i")private WebElement clickOnbording;
	
	public CmdHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddTask() {
		return addTask;
	}

	public WebElement getAddNote() {
		return addNote; 
	}

	public WebElement getWorkflow() {
		return workflow;
	}

	public WebElement getCloseMultiple() {
		return closeMultiple;
	}

	public WebElement getGenerateForm() {
		return generateForm;
	}
	public WebElement getClickOnSetting() {
		return clickOnSetting;
	}

	public WebElement getClickOnbording() {
		return clickOnbording;
	}

	public WebElement getSignOut() {
		return SignOut;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public void clickaddTask(WebDriver driver)
	{
		mouseOverAnElement(driver,workflow);
		addTask.click();
		
	}
	public void clickaddNote(WebDriver driver) {
		mouseOverAnElement(driver,workflow);
		addNote.click();
	}
	public void clickcloseMultiple(WebDriver driver) {
		mouseOverAnElement(driver,workflow);
		closeMultiple.click();
		
	}
	public void clickSignOutLink(WebDriver driver) {
		mouseOverAnElement(driver,SignOut);
		LogoutLink.click();
	}
    public void clickOnboardingForm(WebDriver driver) {
		mouseOverAnElement(driver,workflow);
		clickOnbording.click();
		
	}
    public void ElementTobeClickable(WebDriver driver) {
    	ElementTobeClickable(driver);
    }

	
	
}
