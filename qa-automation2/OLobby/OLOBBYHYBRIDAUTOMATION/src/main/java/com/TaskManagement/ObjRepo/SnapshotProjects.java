package com.TaskManagement.ObjRepo;

import com.olobby.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SnapshotProjects extends WebDriverUtility {

	@FindBy(xpath="//span[text()='All Projects']")private WebElement allProjects;
	@FindBy(xpath="//span[text()='My Projects']")private WebElement myProjects;
	@FindBy(xpath="//span[text()='My Projects']/../../../descendant::span[text()='Assigned to me']")private WebElement assignToMeProj;
	@FindBy(xpath="//span[text()='My Projects']/../../../descendant::span[text()='Assigned to others']")private WebElement assignToOthersProj;
	@FindBy(xpath="//span[text()='Completed projects']")private WebElement completedProj;
	@FindBy(xpath="//a[text()=' Add Project ']")private WebElement addProj;
	@FindBy(xpath="//a[text()=' Show all']")private WebElement showallProj;
	@FindBy(xpath="//a[text()='Due today ']")private WebElement duetodayproj;
	@FindBy(xpath="//a[text()=' Due this week']")private WebElement dueThisWeekProj;
	@FindBy(xpath="//a[text()=' Due this week']/../../descendant::a[text()='Assigned today']")private WebElement assignTodayProj;
	@FindBy(xpath="//a[text()=' Due this week']/../../descendant::a[text()='Unassigned due date']")private WebElement unassignDueDateProj;
	@FindBy(xpath="//input[@placeholder='Search Project']")private WebElement searchProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::*[local-name()='svg' and @viewBox='0 0 13 13']")private WebElement reloadProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::*[local-name()='svg' and @viewBox='0 0 15 16']")private WebElement showFullScrnProj;
	@FindBy(xpath="//td[@id='dx-col-500']")private WebElement projNameProj;
	@FindBy(xpath="//div[text()='Task']")private WebElement taskProj;
	@FindBy(xpath="//div[text()='Task']/../descendant::span[@tabindex='0']")private WebElement FiltsearchTasksProj;
	@FindBy(xpath="//div[text()=' Project Name ']/../../descendant::span[@tabindex='0']")private WebElement projNameFiltSearchProj;
	@FindBy(xpath="//div[text()='Overdue Tasks']/../descendant::span[@tabindex='0']")private WebElement overdueTasksFiltSearchProj;
	@FindBy(xpath="//div[text()='Teammates']/../descendant::span[@tabindex='0']")private WebElement teammatesFiltSearchProj;
	@FindBy(xpath="//div[text()='Teammates']")private WebElement teammatesProj;
	@FindBy(xpath="//div[text()='Overdue Tasks']")private WebElement overdueProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::div[text()='Creator']")private WebElement creatorProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::div[text()='Creator']/../descendant::span[@tabindex='0']")private WebElement creatorFiltSearchProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::div[text()='Created Date']/../descendant::span[@tabindex='0']")private WebElement createdDateFiltSearchProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::div[text()='Created Date']")private WebElement createdDateProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::div[text()='Last Modified']")private WebElement lastModifiedProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::div[text()='Created Date']/../descendant::span[@tabindex='0']")private WebElement lastModifiedFiltSearchProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::div[text()='Modified By']/../descendant::span[@tabindex='0']")private WebElement modifiedByFiltSearchProj;
	@FindBy(xpath="//div[text()='Projects']/../../descendant::div[text()='Modified By']")private WebElement modifiedByProj;
	
	public SnapshotProjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAllProjects() {
		return allProjects;
	}

	public WebElement getMyProjects() {
		return myProjects;
	}

	public WebElement getAssignToMeProj() {
		return assignToMeProj;
	}

	public WebElement getAssignToOthersProj() {
		return assignToOthersProj;
	}

	public WebElement getCompletedProj() {
		return completedProj;
	}

	public WebElement getAddProj() {
		return addProj;
	}

	public WebElement getShowallProj() {
		return showallProj;
	}

	public WebElement getDuetodayproj() {
		return duetodayproj;
	}

	public WebElement getDueThisWeekProj() {
		return dueThisWeekProj;
	}

	public WebElement getAssignTodayProj() {
		return assignTodayProj;
	}

	public WebElement getUnassignDueDateProj() {
		return unassignDueDateProj;
	}

	public WebElement getSearchProj() {
		return searchProj;
	}

	public WebElement getReloadProj() {
		return reloadProj;
	}

	public WebElement getShowFullScrnProj() {
		return showFullScrnProj;
	}

	public WebElement getProjNameProj() {
		return projNameProj;
	}

	public WebElement getTaskProj() {
		return taskProj;
	}

	public WebElement getFiltsearchTasksProj() {
		return FiltsearchTasksProj;
	}

	public WebElement getProjNameFiltSearchProj() {
		return projNameFiltSearchProj;
	}

	public WebElement getOverdueTasksFiltSearchProj() {
		return overdueTasksFiltSearchProj;
	}

	public WebElement getTeammatesFiltSearchProj() {
		return teammatesFiltSearchProj;
	}

	public WebElement getTeammatesProj() {
		return teammatesProj;
	}

	public WebElement getOverdueProj() {
		return overdueProj;
	}

	public WebElement getCreatorProj() {
		return creatorProj;
	}

	public WebElement getCreatorFiltSearchProj() {
		return creatorFiltSearchProj;
	}

	public WebElement getCreatedDateFiltSearchProj() {
		return createdDateFiltSearchProj;
	}

	public WebElement getCreatedDateProj() {
		return createdDateProj;
	}

	public WebElement getLastModifiedProj() {
		return lastModifiedProj;
	}

	public WebElement getLastModifiedFiltSearchProj() {
		return lastModifiedFiltSearchProj;
	}

	public WebElement getModifiedByFiltSearchProj() {
		return modifiedByFiltSearchProj;
	}

	public WebElement getModifiedByProj() {
		return modifiedByProj;
	}
	
	
	
}
