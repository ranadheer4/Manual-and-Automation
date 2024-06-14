package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class ProjFullScrView extends WebDriverUtility {

	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Start Date']")private WebElement startDate;
	@FindBy(xpath="//div[contains(text(),'Project Name')]")private WebElement ProjName;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left dx-sort-indicator']")private WebElement ProjId;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][normalize-space()='Task']")private WebElement Task;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Overdue Tasks']")private WebElement OverdueTask;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Creator']")private WebElement creator;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Created Date']")private WebElement createdDate;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Due Date']")private WebElement DueDate;
	@FindBy(xpath="//div[@class='dx-treelist-text-content dx-text-content-alignment-left'][text()='Last Modified']")private WebElement lastModified;
	@FindBy(xpath="//div[text()='LastUpdatedByName']")private WebElement lastUpdated;
	@FindBy(xpath="//div[@class='cdk-drag-handle modal-header']//button[@type='button']")private WebElement closeTab;
	
	public ProjFullScrView(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getProjName() {
		return ProjName;
	}

	public WebElement getProjId() {
		return ProjId;
	}

	public WebElement getTask() {
		return Task;
	}

	public WebElement getOverdueTask() {
		return OverdueTask;
	}

	public WebElement getCreator() {
		return creator;
	}

	public WebElement getCreatedDate() {
		return createdDate;
	}

	public WebElement getDueDate() {
		return DueDate;
	}

	public WebElement getLastModified() {
		return lastModified;
	}

	public WebElement getLastUpdated() {
		return lastUpdated;
	}

	public WebElement getCloseTab() {
		return closeTab;
	}

	
	
}
