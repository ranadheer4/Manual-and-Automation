package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class TaskView extends WebDriverUtility {

	@FindBy(xpath = "//input[@placeholder='Name this Default view']")private WebElement nameDefaultView;
	@FindBy(xpath = "//label[text()=' TaskId ']")private WebElement taskId;
	@FindBy(xpath = "//label[text()=' Assigned Project ']")private WebElement assignProj;
	@FindBy(xpath = "//button[text()='Next ']")private WebElement NextBtn;
	@FindBy(xpath = "//div[@role='combobox']")private WebElement sortTaskList;
	@FindBy(xpath = "//button[text()='Save']")private WebElement saveBtn;
	@FindBy(xpath = "//a[text()=' test ']")private WebElement test;
	@FindBy(xpath = "//span[text()=' Delete']")private WebElement deleteView;
	@FindBy(xpath = "//span[text()='Edit']")private WebElement editView;
	@FindBy(xpath = "//span[text()='TaskId']")private WebElement sortSelectTaskId;
	@FindBy(xpath = "//a[text()=' Test ']")private WebElement rightClickTest;
	@FindBy(xpath = "//button[text()='Delete']")private WebElement deletePopup;
	@FindBy(xpath = "//a[text()=' Default view ']")private WebElement defaultView;
	
	
	public TaskView(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    
	public WebElement getDefaultView() {
		return defaultView;
	}

	public void RightClickDefault(WebDriver driver)
	{
		
		Actions ac = new Actions(driver);
		ac.contextClick(defaultView).perform();
	}
	public WebElement getDeletePopup() {
		return deletePopup;
	}


	public void RightClickTest(WebDriver driver)
	{
		
		Actions ac = new Actions(driver);
		ac.contextClick(rightClickTest).perform();
	}
	
	public WebElement getRightClickTest() {
		return rightClickTest;
	}


	public WebElement getSortSelectTaskId() {
		return sortSelectTaskId;
	}


	public WebElement getNameDefaultView() {
		return nameDefaultView;
	}


	public WebElement getTaskId() {
		return taskId;
	}


	public WebElement getAssignProj() {
		return assignProj;
	}


	public WebElement getNextBtn() {
		return NextBtn;
	}


	public WebElement getSortTaskList() {
		return sortTaskList;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}


	public WebElement getTest() {
		return test;
	}


	public WebElement getDeleteView() {
		return deleteView;
	}


	public WebElement getEditView() {
		return editView;
	}
    

}
