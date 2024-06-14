package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Tasks extends WebDriverUtility {

	@FindBy(xpath="//input[@placeholder='Search Task']")private WebElement searchTask;
	@FindBy(xpath="//span[text()='All Tasks']")private WebElement allTask;		
	@FindBy(xpath="//span[text()='My Tasks']")private WebElement myTask;
	@FindBy(xpath="//span[text()='My Tasks']/../../../descendant::span[text()='Assigned to me']")private WebElement assignToMeTask;
	@FindBy(xpath="//span[text()='My Tasks']/../../../descendant::span[text()='Assigned to others']")private WebElement assignToOthersTask;
	@FindBy(xpath="//span[text()='Completed tasks']")private WebElement completedTask;
	@FindBy(xpath="//a[text()=' Default view ']")private WebElement defaultView;
	@FindBy(xpath="//a[text()=' Latest_Update ']")private WebElement latestUpdate;
	@FindBy(xpath = "//body//app-root//app-sticky-notes-dashboard//a[2]")private WebElement addViews;
	@FindBy(xpath="//a[text()=' Add Task ']")private WebElement	addTask;
	@FindBy(xpath="//a[text()='Show all ']")private WebElement showAllTask;
	@FindBy(xpath="//a[text()='Due today ']")private WebElement dueToday; 
	@FindBy(xpath="//a[text()='Due this week']")private WebElement dueThisWeek;
	@FindBy(xpath="//a[text()='Due this week']/../../descendant::a[text()='Assigned today']")private WebElement assignTodayTask;
	@FindBy(xpath="//a[text()='Due this week']/../../descendant::a[text()='Unassigned due date ']")private WebElement unassignDuedateTask;
	@FindBy(xpath="//a[@ngbtooltip='Filter View']")private WebElement filter;
	@FindBy(xpath="//div[text()='Tasks']/../../descendant::*[local-name()='svg' and @viewBox='0 0 13 13']")private WebElement reloadTask;	
	@FindBy(xpath="//div[text()='Tasks']/../../descendant::*[local-name()='svg' and @viewBox='0 0 15 16']")private WebElement showFullScrnTask;
	@FindBy(xpath="//td[@id='dx-col-531']")private WebElement taskNameTasks;
	@FindBy(xpath="//div[text()='Assigned Project']")private WebElement assignProjTask;
	@FindBy(xpath="//div[text()='Assigned Project']/../descendant::span[@tabindex='0']")private WebElement assignProjFiltsearchTask;
	@FindBy(xpath="//div[text()='Assigned by']")private WebElement assignByTasks;
	@FindBy(xpath="//div[text()='Assigned To']")private WebElement assignToTasks;
	@FindBy(xpath="//div[text()='Tasks']/../../descendant::div[text()='Due Date']")private WebElement duedateTasks;
	@FindBy(xpath="//div[text()='Attachments']")private WebElement attachmentTask;
	@FindBy(xpath="//div[text()='Location']")private WebElement locationTask;
	@FindBy(xpath="//div[text()='Location']/../descendant::span[@tabindex='0']")private WebElement locFiltsearchTasks;
	@FindBy(xpath="//div[text()='Tasks']/../../descendant::div[text()='Created Date']")private WebElement createddateTasks;
	@FindBy(xpath="//div[text()='Tasks']/../../descendant::div[text()='Creator']")private WebElement creatorTasks;
	@FindBy(xpath="//div[text()='Priority']")private WebElement priorityTask;
	@FindBy(xpath="//div[text()='Priority']/../descendant::span[@tabindex='0']")private WebElement priorityFiltSearchTask;
	@FindBy(xpath="//div[text()='Status']/../descendant::span[@tabindex='0']")private WebElement statusFiltSearchTask;
	@FindBy(xpath="//div[text()='Status']")private WebElement statusTasks;
	@FindBy(xpath="//div[text()='Tasks']/../../descendant::div[text()='Last Modified']")private WebElement lastModifiedTasks;
	@FindBy(xpath="//div[text()='Tasks']/../../descendant::div[text()='Modified By']")private WebElement modifiedByTasks;
	@FindBy(xpath="//a[normalize-space()='Delete forever']")private WebElement clickDeleteDorever;
	
	
	
	public Tasks(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public WebElement getAddViews() {
		return addViews;
	}

	public WebElement getSearchTask() {
		return searchTask;
	}

	public WebElement getAllTask() {
		return allTask;
	}

	public WebElement getMyTask() {
		return myTask;
	}

	public WebElement getAssignToMeTask() {
		return assignToMeTask;
	}

	public WebElement getAssignToOthersTask() {
		return assignToOthersTask;
	}

	public WebElement getCompletedTask() {
		return completedTask;
	}

	public WebElement getDefaultView() {
		return defaultView;
	}

	public WebElement getLatestUpdate() {
		return latestUpdate;
	}

	public WebElement getAddTask() {
		return addTask;
	}

	public WebElement getShowAllTask() {
		return showAllTask;
	}

	public WebElement getDueToday() {
		return dueToday;
	}

	public WebElement getDueThisWeek() {
		return dueThisWeek;
	}

	public WebElement getAssignTodayTask() {
		return assignTodayTask;
	}

	public WebElement getUnassignDuedateTask() {
		return unassignDuedateTask;
	}

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getReloadTask() {
		return reloadTask;
	}

	public WebElement getShowFullScrnTask() {
		return showFullScrnTask;
	}

	public WebElement getTaskNameTasks() {
		return taskNameTasks;
	}

	public WebElement getAssignProjTask() {
		return assignProjTask;
	}

	public WebElement getAssignProjFiltsearchTask() {
		return assignProjFiltsearchTask;
	}

	public WebElement getAssignByTasks() {
		return assignByTasks;
	}

	public WebElement getAssignToTasks() {
		return assignToTasks;
	}

	public WebElement getDuedateTasks() {
		return duedateTasks;
	}

	public WebElement getAttachmentTask() {
		return attachmentTask;
	}

	public WebElement getLocationTask() {
		return locationTask;
	}

	public WebElement getLocFiltsearchTasks() {
		return locFiltsearchTasks;
	}

	public WebElement getCreateddateTasks() {
		return createddateTasks;
	}

	public WebElement getCreatorTasks() {
		return creatorTasks;
	}

	public WebElement getPriorityTask() {
		return priorityTask;
	}

	public WebElement getPriorityFiltSearchTask() {
		return priorityFiltSearchTask;
	}

	public WebElement getStatusFiltSearchTask() {
		return statusFiltSearchTask;
	}

	public WebElement getStatusTasks() {
		return statusTasks;
	}

	public WebElement getLastModifiedTasks() {
		return lastModifiedTasks;
	}

	public WebElement getModifiedByTasks() {
		return modifiedByTasks;
	}

	public WebElement getClickDeleteDorever() {
		return clickDeleteDorever;
	}
	
	
	
}
