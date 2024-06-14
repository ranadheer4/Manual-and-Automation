package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class InlineEdit extends WebDriverUtility{
	@FindBy(xpath = "//app-task-list[@id='taskdata']//a[@class='addbtn pl-0']/..//*[name()='path' and contains(@d,'M10 5.7142')]")private WebElement addRow;
	@FindBy(xpath = "//td[@class='hover-column dx-datagrid-validator dx-validator dx-visibility-change-handler']//span[@container='body']")private WebElement taskNameField;
//	@FindBy(xpath = "")private WebElement addRow;
//	@FindBy(xpath = "")private WebElement addRow;
//	@FindBy(xpath = "")private WebElement addRow;
//	@FindBy(xpath = "")private WebElement addRow;
//	@FindBy(xpath = "")private WebElement addRow;
	
	public InlineEdit(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}

	public WebElement getAddRow() {
		return addRow;
	}

	public WebElement getTaskNameField() {
		return taskNameField;
	}
}
