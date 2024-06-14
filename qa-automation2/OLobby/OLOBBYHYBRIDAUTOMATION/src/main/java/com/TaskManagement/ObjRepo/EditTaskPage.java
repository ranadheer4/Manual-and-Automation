package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class EditTaskPage extends WebDriverUtility{
	
	@FindBy(xpath="//button[@id='myCenterModalLabelclose']")private WebElement clickCancelButton;
	@FindBy(xpath="//input[@placeholder='Enter Task Name ']")private WebElement enterTaskName;
	@FindBy(xpath="")private WebElement c;
	
	public EditTaskPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getClickCancelButton() {
		return clickCancelButton;
	}

	public WebElement getEnterTaskName() {
		return enterTaskName;
	}
	
	
	

}
