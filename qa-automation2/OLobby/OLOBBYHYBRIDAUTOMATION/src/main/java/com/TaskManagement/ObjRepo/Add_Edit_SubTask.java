package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Add_Edit_SubTask extends WebDriverUtility{
	@FindBy(xpath = "//input[@id='subtasknamefocus']")private WebElement name;
	@FindBy(xpath = "(//input[@placeholder='Select'])[5]")private WebElement startDate;
	@FindBy(xpath = "(//input[@placeholder='Select'])[6]")private WebElement endDate;
	@FindBy(xpath = "//form[@class='ng-pristine ng-invalid ng-touched']/descendant::ng-select[@bindlabel='Value' and @formcontrolname='assignto']/descendant::div[@role='combobox']/input[@type='text']")private WebElement teamMembers;
	@FindBy(xpath = "//form[@class='ng-invalid ng-touched ng-dirty']/descendant::ng-select[@bindlabel='Value' and @formcontrolname='watcher']/descendant::div[@role='combobox']/input[@type='text']")private WebElement watchers;
	@FindBy(xpath = "//app-sub-task-details/descendant::ng-select[@bindlabel='Name' and @formcontrolname='status']/descendant::div[@role='combobox']/input[@type='text']")private WebElement status;
	@FindBy(xpath = "//app-sub-task-details/descendant::ng-select[@bindlabel='Key' and @formcontrolname='priority']/descendant::div[@role='combobox']/input[@type='text']")private WebElement priority;
	@FindBy(xpath = "//app-sub-task-details/descendant::ng-select[@bindlabel='Value' and @formcontrolname='ownerId']/descendant::div[@role='combobox']/input[@type='text']")private WebElement owner;
	@FindBy(xpath = "//form[@class='ng-pristine ng-invalid ng-touched']/descendant::ng-select[@bindlabel='TaskName' and @formcontrolname='parentId']/descendant::div[@role='combobox']/input[@type='text']")private WebElement addToTask;
	@FindBy(xpath = "//form[@class='ng-pristine ng-invalid ng-touched']//input[@id='inlineRadio1']")private WebElement viewedByAnyone;
	@FindBy(xpath = "//form[@class='ng-pristine ng-invalid ng-touched']//input[@id='inlineRadio2']")private WebElement viewedByAssignes;
	@FindBy(xpath = "//app-sub-task-details//button[@id='myCenterModalLabelclose']")private WebElement cancel;
	@FindBy(xpath = "//app-sub-task-details//button[@class='btn saveandnext'][normalize-space()='Save']")private WebElement save;
	@FindBy(xpath = "//app-sub-task-details//div[@class='modal-header']//button[@type='button']")private WebElement closeWindow;
	@FindBy(xpath = "//app-task-details//button[text()='Delete task']")private WebElement deleteSubTask;
	@FindBy(xpath = "//app-notification-modal//button[text()='Delete']")private WebElement delete;
	@FindBy(xpath = "//app-notification-modal//button[text()='Cancel']")private WebElement canceTask;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='RanaTask123']")private WebElement checkbox;
	
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getCanceTask() {
		return canceTask;
	}
	public Add_Edit_SubTask(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getStartDate() {
		return startDate;
	}
	public WebElement getEndDate() {
		return endDate;
	}
	public WebElement getTeamMembers() {
		return teamMembers;
	}
	public WebElement getWatchers() {
		return watchers;
	}
	public WebElement getStatus() {
		return status;
	}
	public WebElement getPriority() {
		return priority;
	}
	public WebElement getOwner() {
		return owner;
	}
	public WebElement getAddToTask() {
		return addToTask;
	}
	public WebElement getViewedByAnyone() {
		return viewedByAnyone;
	}
	public WebElement getViewedByAssignes() {
		return viewedByAssignes;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getCloseWindow() {
		return closeWindow;
	}
	public WebElement getDeleteSubTask() {
		return deleteSubTask;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
}
