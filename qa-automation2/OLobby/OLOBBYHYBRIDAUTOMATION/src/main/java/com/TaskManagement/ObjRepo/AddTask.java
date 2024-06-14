package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class AddTask extends WebDriverUtility {

	@FindBy(xpath="//input[@id='tasknameautofocus']")private WebElement taskName;
	@FindBy(xpath="//input[@formcontrolname='startdate']")private WebElement startDate;
	////label[text()=' Start Date']/../../descendant::button[@class='dp-nav-header-btn']
	@FindBy(xpath = "//input[@formcontrolname='duedate']")private WebElement dueDate;
	@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='Value' and @formcontrolname='assignto']/descendant::div[@role='combobox']/input[@type='text']")private WebElement teammembers;
	@FindBy(xpath = "//ng-select[@class='ng-select ng-select-multiple ng-select-searchable ng-untouched ng-pristine ng-valid']//input[@type='text']")private WebElement watchers;
	@FindBy(xpath = "//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindvalue='Id' and @formcontrolname='status']/descendant::div[@role='combobox']/input[@type='text']")private WebElement status;
	@FindBy(xpath = "//ng-select[@class='ng-select ng-select-single ng-select-searchable ng-untouched ng-pristine ng-valid']//div[@class='ng-select-container']//div[@role='combobox']")private WebElement priority;
	@FindBy(xpath = "//ng-select[@formcontrolname='ownerId']//input[@type='text']")private WebElement owner;
	@FindBy(xpath = "//ng-select[@id='defaultlocation']//div[@role='combobox']")private WebElement location;
	@FindBy(xpath = "//ng-select[@id='selectedproject']//input[@type='text']")private WebElement projName;
	@FindBy(xpath = "//input[@id='inlineRadio2']")private WebElement viewAssignees;
	@FindBy(xpath = "//input[@id='inlineRadio1']")private WebElement viewAnyone;
	@FindBy(xpath = "//ng-select[@appendto='body']//div[@class='ng-select-container']//input[@type='text']")private WebElement addToSection;
	@FindBy(xpath = "//div[@class='col-md-8 form-group']//input[@type='text']")private WebElement lebelBoard;
	@FindBy(xpath = "//span[normalize-space()='Upload file(s)']")private WebElement attachUploadFiles;
	@FindBy(xpath = "//span[normalize-space()='Connect Olobby files']")private WebElement connectOlobbyFiles;
	@FindBy(xpath = "//div[@role='textbox']")private WebElement description;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")private WebElement cancelBtn;
	@FindBy(xpath = "//button[normalize-space()='Save']")private WebElement saveBtn;
	@FindBy(xpath = "//button[normalize-space()='Save and add subtask']")private WebElement saveAndAddSubTask;
	@FindBy(xpath="//span[@class='ng-option-label ng-star-inserted'][.='India']")private WebElement india;
	@FindBy(xpath = "//button[@data-date='05/30/2023']")private WebElement dateStart;
	@FindBy(xpath = "//button[@data-date='07/01/2023']")private WebElement dateDue;
	@FindBy(xpath = "//div[@data-hidden='false']//div[@class='dp-calendar-nav-container-right']")private WebElement nextMonthStart;
	@FindBy(xpath = "//div[@data-hidden='false']//div[@class='dp-calendar-nav-container-right']//button[@type='button']")private WebElement nextMonthDue;
	@FindBy(xpath = "//span[text()='Not Started']")private WebElement notStarted;
	@FindBy(xpath = "//span[normalize-space()='CRITICAL']")private WebElement priCritical;
	@FindBy(xpath = "//button[text()=' Browse files ']")private WebElement browseFiles;
	@FindBy(xpath = "//button[text()=' Connect files ']")private WebElement connectFiles;
	@FindBy(xpath = "//div[@class='card-body pb-1 ng-star-inserted']//dx-tree-view[@role='tree']")private WebElement puneLoc;
	@FindBy(xpath = "//li[@aria-label='AutomationTesting']//span[@class='clickablenode']")private WebElement testing1;
	@FindBy(xpath = "//body[1]/ngb-modal-window[3]/div[1]/div[1]/app-file-connect[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/img[1]")private WebElement file;
	@FindBy(xpath = "//div[@class='card style_1 ng-star-inserted']//div[@class='card-title text-truncate'][normalize-space()='India']")private WebElement indiaGrp;
	@FindBy(xpath = "//button[@type='submit'][text()='Connect files']")private WebElement connFiles;
	@FindBy(xpath = "//button[text()='Close']")private WebElement closeBtn;
	@FindBy(xpath = "//button[@class='btn saveandnext']")private WebElement saveBtnConnFiles;
	@FindBy(xpath = "//li[text()=' Add Task ']")private WebElement addTaskFoldAcc;
	@FindBy(xpath = "//div[@class='card style_1 ng-star-inserted']//div[@class='card-title text-truncate'][normalize-space()='India']")private WebElement indiaAddTaskFoldAcc;
	@FindBy(xpath = "//tr[@id='file_2_3']//div[@class='checkbox checkbox-primary']//input[@id='checkbox2']")private WebElement rightClick;
	@FindBy(xpath = "//input[@id='item-3']")private WebElement teamMemExternal051;
	@FindBy(xpath = "//span[normalize-space()='PUNE']")private WebElement puneFoldAcc;
	@FindBy(xpath = "//span[@title='PrashantG Testing']")private WebElement prashantGTestng;
	@FindBy(xpath = "//div[@class='card style_1 expendedtree ng-star-inserted']//div[@class='card-title text-truncate'][normalize-space()='India']")private WebElement indiaLocFoldAcces;
	@FindBy(xpath = "//td[text()=' No Access for this folder ']")private WebElement noAccess;
	@FindBy(xpath = "td[text()=' No Access for this folder ']")private WebElement noAccessGetText;
	@FindBy(xpath = "//label[normalize-space()='Add Task']")private WebElement clickBelowAddTask;
	@FindBy(xpath = "(//label[text()=' Watchers']/../../descendant::input[@type='text'])[6]")private WebElement clickWatcher;
	@FindBy(xpath = "//app-add-edit-task//button[@type='submit'][normalize-space()='Save']")private WebElement clickSave;
	@FindBy(xpath = "(//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='Value' and @formcontrolname='assignto']/descendant::div[@role='combobox']/input[@type='text'])[2]")private WebElement click1;
    @FindBy(xpath = "//input[@id='item-2']")private WebElement clickCheckBox;
    @FindBy(xpath = "//button[normalize-space()='Delete']")private WebElement clickTaskDeleteCorner;
    @FindBy(xpath = "//img[@src='assets/sidebaricons/trash.png']")private WebElement clickDelete;
    @FindBy(xpath = "//a[normalize-space()='Restore']")private WebElement clickRestore;
    @FindBy(xpath = "//button[normalize-space()='Restore']")private WebElement clickRestoreButton;

	public AddTask(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getClickWatcher() {
		return clickWatcher;
	}
	public WebElement getClickBelowAddTask() {
		return clickBelowAddTask;
	}
	public WebElement getClickSave() {
		return clickSave;
	}
	public WebElement getNoAccess() {
		return noAccess;
	}
	public WebElement getIndiaLocFoldAcces() {
		return indiaLocFoldAcces;
	}
	public WebElement getPrashantGTestng() {
		return prashantGTestng;
	}
	public WebElement getPuneFoldAcc() {
		return puneFoldAcc;
	}
	public WebElement getTeamMemExternal051() {
		return teamMemExternal051;
	}
	public void RightClick(WebDriver driver)
	{
		Actions ac = new Actions(driver);
		ac.contextClick(rightClick).perform();
	}
	public WebElement getTextMethod1()
	{
		return noAccessGetText;
	}
	public String getText()
    {
        return noAccessGetText.getText();
    }
	public WebElement getIndiaAddTaskFoldAcc() {
		return indiaAddTaskFoldAcc;
	}
	public WebElement getAddTaskFoldAcc() {
		return addTaskFoldAcc;
	}
	public WebElement getSaveBtnConnFiles() {
		return saveBtnConnFiles;
	}
	public WebElement getCloseBtn() {
		return closeBtn;
	}
	public WebElement getConnFiles() {
		return connFiles;
	}
	public WebElement getIndiaGrp() {
		return indiaGrp;
	}
	public WebElement getPuneLoc() {
		return puneLoc;
	}
	public WebElement getTesting1() {
		return testing1;
	}
	public WebElement getFile() {
		return file;
	}
	public WebElement getTaskName() {
		return taskName;
	}
	public WebElement getStartDate() {
		return startDate;
	}
	public WebElement getDueDate() {
		return dueDate;
	}
	public WebElement getTeammembers() {
		return teammembers;
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
	public WebElement getLocation() {
		return location;
	}
	public WebElement getProjName() {
		return projName;
	}
	public WebElement getViewAssignees() {
		return viewAssignees;
	}
	public WebElement getViewAnyone() {
		return viewAnyone;
	}
	public WebElement getAddToSection() {
		return addToSection;
	}
	public WebElement getLebelBoard() {
		return lebelBoard;
	}
	public WebElement getAttachUploadFiles() {
		return attachUploadFiles;
	}
	public WebElement getConnectOlobbyFiles() {
		return connectOlobbyFiles;
	}
	public WebElement getDescription() {
		return description;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getSaveAndAddSubTask() {
		return saveAndAddSubTask;
	}
	public WebElement getIndia() {
		return india;
	}
	public WebElement getDateStart() {
		return dateStart;
	}
	public WebElement getDateDue() {
		return dateDue;
	}
	public WebElement getNextMonth() {
		return nextMonthStart;
	}
	public WebElement getNextMonthDue() {
		return nextMonthDue;
	}
	public WebElement getNotStarted() {
		return notStarted;
	}
	public WebElement getPriCritical() {
		return priCritical;
	}
	public WebElement getBrowseFiles() {
		return browseFiles;
	}
	public WebElement getConnectFiles() {
		return connectFiles;
	}
    public WebElement getClick1() {
		return click1;
	}
    public WebElement getClickCheckBox() {
		return clickCheckBox;
	}
	public WebElement getClickTaskDeleteCorner() {
		return clickTaskDeleteCorner;
	}
	public WebElement getClickDelete() {
		return clickDelete;
	}
	public WebElement getClickRestore() {
		return clickRestore;
	}
	public WebElement getClickRestoreButton() {
		return clickRestoreButton;
	}
 
}
