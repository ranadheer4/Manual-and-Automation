package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Sorting extends WebDriverUtility {

	@FindBy(xpath="//div[contains(text(),'Project Name')]")private WebElement proName;
	@FindBy(xpath = "//div[contains(text(),'Task name')]")private WebElement taskName;
	@FindBy(xpath = "//div[text()='TaskId']")private WebElement taskid;
	@FindBy(xpath = "//div[@title='Assigned Project']")private WebElement assignProj;
	@FindBy(xpath = "//div[@title='Assigned by']")private WebElement assignBy;
	@FindBy(xpath = "//div[@title='Assigned To']")private WebElement assignTo;
	@FindBy(xpath = "//div[@class='dx-datagrid-text-content dx-text-content-alignment-left'][normalize-space()='Due Date']")private WebElement a;
		
	public Sorting(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getProName() {
		return proName;
	}

	public WebElement getTaskName() {
		return taskName;
	}
	
	
	
}
