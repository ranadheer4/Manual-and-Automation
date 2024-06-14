package com.olobby.ObjectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	// Declaration
	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::*[local-name()='g' and @clip-path='url(#clip0_2_446)']")
	private WebElement location;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/images/stage_icon.svg']")
	private WebElement Organization;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/calendar.png']")
	private WebElement Calender;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/dashboard.png']")
	private WebElement Dashboard;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/Folder.png']")
	private WebElement Folder;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/taskmanagement.png']")
	private WebElement TaskManageMent;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/quicknotes.png']")
	private WebElement Notes;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/workflow.png']")
	private WebElement Workflow;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/email.png']")
	private WebElement Email;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/fileshare.png']")
	private WebElement FileShare;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/settings.png']")
	private WebElement Setting;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/trash.png']")
	private WebElement Trash;

	@FindBy(xpath = "//div[@class='left-side-menu']/descendant::img[@src='assets/sidebaricons/help.png']")
	private WebElement AboutUs;

	@FindBy(xpath = "//img[@src='assets/sidebaricons/alarm.png']")
	private WebElement Notification;

	@FindBy(xpath = "//div[@id='wrapper']/descendant::span[text()='ps']")
	private WebElement CliclCornerdd;

	@FindBy(xpath = "//b[text()='Logout']")
	private WebElement LgBtn;
	

	
	
	
	
	// Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Utilization
	public WebElement getLocation() {
		return location;
	}

	public WebElement getOrganization() {
		return Organization;
	}

	public WebElement getCalender() {
		return Calender;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getFolder() {
		return Folder;
	}

	public WebElement getTaskManageMent() {
		return TaskManageMent;
	}

	public WebElement getNotes() {
		return Notes;
	}

	public WebElement getWorkflow() {
		return Workflow;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getFileShare() {
		return FileShare;
	}

	public WebElement getSetting() {
		return Setting;
	}

	public WebElement getTrash() {
		return Trash;
	}

	public WebElement getAboutUs() {
		return AboutUs;
	}

	public WebElement getNotification() {
		return Notification;
	}

	public WebElement getCliclCornerdd() {
		return CliclCornerdd;
	}

	public WebElement getLgBtn() {
		return LgBtn;
	}

	public void clickSignOutLink(WebDriver driver) {
		mouseOverAnElement(driver, CliclCornerdd);
		LgBtn.click();
	}

	public void clickOnEscButton(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();

	}

}
