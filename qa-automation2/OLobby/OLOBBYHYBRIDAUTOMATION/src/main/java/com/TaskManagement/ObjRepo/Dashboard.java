package com.TaskManagement.ObjRepo;

import com.olobby.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends WebDriverUtility {

	@FindBy(xpath= "//span[text()='Task']")private WebElement task;
	@FindBy(xpath="//h4[text()=' Tasks ']/../../descendant::span[text()='For Me ']/../../descendant::span[text()='Tasks']")private WebElement tasksForMe;
	@FindBy(xpath="//h4[text()=' Tasks ']/../../descendant::span[text()='For Me ']/../../descendant::span[text()='Project Tasks']")private WebElement projTaskForMe;
	@FindBy(xpath = "//h4[text()=' Tasks ']/../../descendant::span[text()='For Me ']/../../descendant::span[text()='No Due Date']")private WebElement noDueDateForMe;
	@FindBy(xpath = "//h4[text()=' Tasks ']/../../descendant::span[text()='For Me ']/../../descendant::span[text()='Overdue']")private WebElement overdueForMe;
	@FindBy(xpath = "//h4[text()=' Tasks ']/../../descendant::span[text()='For Others ']/../../descendant::span[text()='Tasks']")private WebElement taskForOthers;
	@FindBy(xpath= "//h4[text()=' Tasks ']/../../descendant::span[text()='For Others ']/../../descendant::span[text()='Project Tasks']")private WebElement proTaskFrOthers;
	@FindBy(xpath= "//h4[text()=' Tasks ']/../../descendant::span[text()='For Others ']/../../descendant::span[text()='No Due Date']")private WebElement dueDateFrOthers;
	@FindBy(xpath= "//h4[text()=' Tasks ']/../../descendant::span[text()='For Others ']/../../descendant::span[text()='Overdue']")private WebElement overdueFrOthers;
	@FindBy(xpath="//h4[text()=' Watching ']/../../descendant::span[text()='For Me ']/../../descendant::span[text()='Tasks']")private WebElement tasksWatching;
	@FindBy(xpath= "//h4[text()=' Watching ']/../../descendant::span[text()='For Me ']/../../descendant::span[text()='Project Tasks ']")private WebElement proTaskWatching;
	@FindBy(xpath= "//h4[text()=' Watching ']/../../descendant::span[text()='For Me ']/../../descendant::span[text()='No Due Date']")private WebElement noDueDateWatching;
	@FindBy(xpath= "//h4[text()=' Watching ']/../../descendant::span[text()='For Me ']/../../descendant::span[text()='Overdue']")private WebElement overdueWatching;	
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::button[text()=' See All ']")private WebElement seeAllTaskListFrMe;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::button[text()=' See All ']")private WebElement seeAllTaskListFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Task List ']/../../descendant::option[text()=' All ']")private WebElement allTListFrMe;
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Task List ']/../../descendant::option[text()=' Task ']")private WebElement taskTListFrMe;
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Task List ']/../../descendant::option[text()=' Project ']")private WebElement projTListFrMe;
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Tasks Due ']/../../descendant::option[text()=' All ']")private WebElement allTDueFrMe;
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Tasks Due ']/../../descendant::option[text()=' Task ']")private WebElement taskDueFrMe;
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Tasks Due ']/../../descendant::option[text()=' Project ']")private WebElement projDueFrMe;
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Completed ']/../../descendant::option[text()=' All ']")private WebElement allCompFrMe;	
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Completed ']/../../descendant::option[text()=' Task ']")private WebElement taskCompFrMe;
	@FindBy(xpath= "//h4[text()=' Task for me ']/../../descendant::h5[text()=' Completed ']/../../descendant::option[text()=' Project ']")private WebElement projCompFrMe;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Task List ']/../../descendant::option[text()=' All ']")private WebElement allTListFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Task List ']/../../descendant::option[text()=' Task ']")private WebElement taskTListFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Task List ']/../../descendant::option[text()=' Project ']")private WebElement projTListFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Tasks Due ']/../../descendant::option[text()=' All ']")private WebElement allTDueFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Tasks Due ']/../../descendant::option[text()=' Task ']")private WebElement taskTDueFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Tasks Due ']/../../descendant::option[text()=' Project ']")private WebElement projTDueFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Completed ']/../../descendant::option[text()=' All ']")private WebElement allCompFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Completed ']/../../descendant::option[text()=' Task ']")private WebElement taskCompFrOthers;
	@FindBy(xpath= "//h4[text()=' Task for others ']/../../descendant::h5[text()=' Completed ']/../../descendant::option[text()=' Project ']")private WebElement projCompFrOthers;
    
	
	public Dashboard(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}


	public WebElement getTask() {
		return task;
	}


	public WebElement getTasksForMe() {
		return tasksForMe;
	}


	public WebElement getProjTaskForMe() {
		return projTaskForMe;
	}


	public WebElement getNoDueDateForMe() {
		return noDueDateForMe;
	}


	public WebElement getOverdueForMe() {
		return overdueForMe;	
	}


	public WebElement getTaskForOthers() {
		return taskForOthers;
	}


	public WebElement getProTaskFrOthers() {
		return proTaskFrOthers;
	}


	public WebElement getDueDateFrOthers() {
		return dueDateFrOthers;
	}


	public WebElement getOverdueFrOthers() {
		return overdueFrOthers;
	}


	public WebElement getTasksWatching() {
		return tasksWatching;
	}


	public WebElement getProTaskWatching() {
		return proTaskWatching;
	}


	public WebElement getNoDueDateWatching() {
		return noDueDateWatching;
	}


	public WebElement getOverdueWatching() {
		return overdueWatching;
	}


	public WebElement getSeeAllTaskListFrMe() {
		return seeAllTaskListFrMe;
	}


	public WebElement getSeeAllTaskListFrOthers() {
		return seeAllTaskListFrOthers;
	}


	public WebElement getAllTListFrMe() {
		return allTListFrMe;
	}


	public WebElement getTaskTListFrMe() {
		return taskTListFrMe;
	}


	public WebElement getProjTListFrMe() {
		return projTListFrMe;
	}


	public WebElement getAllTDueFrMe() {
		return allTDueFrMe;
	}


	public WebElement getTaskDueFrMe() {
		return taskDueFrMe;
	}


	public WebElement getProjDueFrMe() {
		return projDueFrMe;
	}


	public WebElement getAllCompFrMe() {
		return allCompFrMe;
	}


	public WebElement getTaskCompFrMe() {
		return taskCompFrMe;
	}


	public WebElement getProjCompFrMe() {
		return projCompFrMe;
	}


	public WebElement getAllTListFrOthers() {
		return allTListFrOthers;
	}


	public WebElement getTaskTListFrOthers() {
		return taskTListFrOthers;
	}


	public WebElement getProjTListFrOthers() {
		return projTListFrOthers;
	}


	public WebElement getAllTDueFrOthers() {
		return allTDueFrOthers;
	}


	public WebElement getTaskTDueFrOthers() {
		return taskTDueFrOthers;
	}


	public WebElement getProjTDueFrOthers() {
		return projTDueFrOthers;
	}


	public WebElement getAllCompFrOthers() {
		return allCompFrOthers;
	}


	public WebElement getTaskCompFrOthers() {
		return taskCompFrOthers;
	}


	public WebElement getProjCompFrOthers() {
		return projCompFrOthers;
	}

	

}
