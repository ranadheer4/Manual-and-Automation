package com.olobby.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddTask;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;

public class SmokeTC_04 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void AddTasksFromFoldAcc() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		AddTask at = new AddTask(driver);
		Thread.sleep(5000);
        hp.getFolder().click();
        Thread.sleep(5000);
        at.RightClick(driver);
        at.getAddTaskFoldAcc().click();
        at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
        at.getProjName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 1));
		at.clickOnEnterButton(driver);
		at.getDescription().sendKeys(eLib.readDataFromExcel("AddTask", 1, 2));
		at.getStartDate().click();
	//	at.getNextMonth().click();
		at.getDateStart().click();
		at.getDueDate().click();
		at.getNextMonthDue().click();
	//	at.getNextMonthDue().click();
		at.getDateDue().click();
	//	at.getStatus().click();
	//	at.getNotStarted().click();
		at.getPriority().click();
		at.getPriCritical().click();
		at.getAttachUploadFiles().click();
		at.getConnectFiles().click();
		at.getIndiaAddTaskFoldAcc().click();
		Thread.sleep(3000);
		at.getPuneLoc().click();	
		at.getTesting1().click();
		at.getFile().click();
		at.getConnFiles().click();
		at.getSaveBtnConnFiles().click();
		at.getSaveBtn().click();
		
		

        
		
		
		
		
		
		
	}
}
