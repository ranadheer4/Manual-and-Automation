package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class TasksFullScreenView extends WebDriverUtility {

	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='TaskId']")private WebElement taskId;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Attachments']")private WebElement attachment;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][normalize-space()='Location']")private WebElement location;
	@FindBy(xpath="//span[@class='dx-sort dx-sort-down']")private WebElement taskName;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left dx-sort-indicator'][text()='Status']")private WebElement status;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Assigned Project']")private WebElement assignedProj;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Assigned by']")private WebElement assignedBy;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Assigned To']")private WebElement assignedTo;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Due Date']")private WebElement DueDate;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Created Date']")private WebElement createdDate;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Creator']")private WebElement creator;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Priority']")private WebElement priority;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Last Modified']")private WebElement lastModified;
	@FindBy(xpath="//div[text()='LastUpdatedByName']")private WebElement lastUpdatedBy;
	@FindBy(xpath="//div[@class='cdk-drag-handle modal-header']//button[@type='button']")private WebElement closeTab;
	@FindBy(xpath = "//label[normalize-space()='All Subtask (1)']")private WebElement allSubTasks;
	@FindBy(xpath = "//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Modified By']")private WebElement modifiedBy;
	
	
	public TasksFullScreenView(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    
	public WebElement getModifiedBy() {
		return modifiedBy;
	}


	public WebElement getAllSubTasks() {
		return allSubTasks;
	}


	public WebElement getTaskId() {
		return taskId;
	}


	public WebElement getAttachment() {
		return attachment;
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getTaskName() {
		return taskName;
	}


	public WebElement getStatus() {
		return status;
	}


	public WebElement getAssignedProj() {
		return assignedProj;
	}


	public WebElement getAssignedBy() {
		return assignedBy;
	}


	public WebElement getAssignedTo() {
		return assignedTo;
	}


	public WebElement getDueDate() {
		return DueDate;
	}


	public WebElement getCreatedDate() {
		return createdDate;
	}


	public WebElement getCreator() {
		return creator;
	}


	public WebElement getPriority() {
		return priority;
	}


	public WebElement getLastModified() {
		return lastModified;
	}


	public WebElement getLastUpdatedBy() {
		return lastUpdatedBy;
	}


	public WebElement getCloseTab() {
		return closeTab;
	}
	
}
