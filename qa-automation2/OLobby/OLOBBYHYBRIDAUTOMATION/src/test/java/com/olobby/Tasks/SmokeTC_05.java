package com.olobby.Tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddTask;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;

public class SmokeTC_05 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void AddTasksFromFoldAccAssignTM() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		AddTask at = new AddTask(driver);
		Thread.sleep(5000);
        hp.getFolder().click();
        Thread.sleep(5000);
        at.RightClick(driver);
        at.getAddTaskFoldAcc().click();
        at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
        at.getTeammembers().click();
        //at.getTeammembers().sendKeys(eLib.readDataFromExcel("AddTask", 1, 4));
        Thread.sleep(3000);
        at.getTeamMemExternal051().click();
        at.getSaveBtn().click();
        Thread.sleep(3000);
        at.RightClick(driver);
        at.getAddTaskFoldAcc().click();
        at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
        at.getProjName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 1));
		at.clickOnEnterButton(driver);
		at.getStartDate().click();
	//	at.getNextMonth().click();
		at.getDateStart().click();
		at.getDueDate().click();
		at.getNextMonthDue().click();
	//	at.getNextMonthDue().click();
		at.getDateDue().click();
		at.getTeammembers().click();
		Thread.sleep(3000);
        at.getTeamMemExternal051().click();
        at.clickOnEscButton(driver);
        at.clickOnEscButton(driver);
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
		at.getDescription().sendKeys(eLib.readDataFromExcel("AddTask", 1, 2));
		at.getSaveBtn().click();
		
        
		
	//	
    
        
        
	}
}
