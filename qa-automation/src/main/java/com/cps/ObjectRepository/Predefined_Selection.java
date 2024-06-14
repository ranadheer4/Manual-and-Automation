package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class Predefined_Selection extends WebDriverUtility{

	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
    @FindBy(xpath = "//section[@id='wrapper']/descendant::span[text()='Settings']")private WebElement settings;
    @FindBy(xpath = "//section[@id='wrapper']/descendant::span[text()=' Predefined Selections']")private WebElement predefinedSelection;
    @FindBy(xpath = "//div[@class='topBox']/h4[text()='Predefined Selections']/following-sibling::div/div/div[text()='Create Predefined Notes ']")private WebElement createPN;
    @FindBy(xpath = "//input[@placeholder='Enter Subject']")private WebElement enterSubject;
    @FindBy(xpath = "//textarea[@id='description']")private WebElement enterDescription;
    @FindBy(xpath = "//button[normalize-space()='Create']")private WebElement createBtn;
    @FindBy(xpath = "//Section[@id='wrapper']/descendant::input[@placeholder='Search...']")private WebElement search;
    @FindBy(xpath = "//ul[@role='tablist']")private WebElement removeLSB;
    @FindBy(xpath = "//li[@ng-reflect-_id='Tasks']/a[text()='Workflow Tasks']")private WebElement workflowTask;
    @FindBy(xpath = "//div[@class='topBox']/h4[text()='Predefined Selections']/following-sibling::div/div/div[text()='Create Predefined Tasks ']")private WebElement createPT;
    @FindBy(xpath = "//li[@ng-reflect-_id='Notes']/a[text()='Workflow Notes']")private WebElement workflowNotes;
	
	
    public Predefined_Selection(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void mouseHover(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);	
	}
    public void closeLeftSideBar(WebDriver driver)
    {
    	mouseOverAnElement(driver, removeLSB);
    }
    public void moveToCreatePN(WebDriver driver)
    {
    	mouseOverAnElement(driver, createPN);
    	createPN.click();
    }
	public WebElement getSettings() {
		return settings;
	}
	public WebElement getWorkflowNotes() {
		return workflowNotes;
	}
	public WebElement getCreatePT() {
		return createPT;
	}
	public WebElement getWorkflowTask() {
		return workflowTask;
	}
	public WebElement getPredefinedSelection() {
		return predefinedSelection;
	}
	public WebElement getCreatePN() {
		return createPN;
	}
	public WebElement getEnterSubject() {
		return enterSubject;
	}
	public WebElement getEnterDescription() {
		return enterDescription;
	}
	public WebElement getCreateBtn() {
		return createBtn;
	}
	public WebElement getSearch() {
		return search;
	}
}
