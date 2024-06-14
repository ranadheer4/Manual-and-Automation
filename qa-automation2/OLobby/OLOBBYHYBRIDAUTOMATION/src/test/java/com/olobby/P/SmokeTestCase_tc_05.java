package com.olobby.P;

import org.testng.annotations.Test;
import com.TaskManagement.ObjRepo.AddTask;
import com.TaskManagement.ObjRepo.SnapshotTasks;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;

public class SmokeTestCase_tc_05 extends BaseClass{
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void AddDublicateProject() throws InterruptedException {
		
		HomePage hpage = new HomePage(driver);
		hpage.getTaskManageMent().click();
		Thread.sleep(3000);
	    TaskManagement ts = new TaskManagement(driver);
		ts.getSnapshotClick().click();
		Thread.sleep(2000);
		//click add Task
		SnapshotTasks st = new SnapshotTasks(driver);
		st.getAddTask().click();
		Thread.sleep(2000);
		AddTask at = new AddTask(driver);
		//st.getAddTask().click();
		at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
		at.getLocation().click();
		at.getIndia().click();
		at.getProjName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 1));
		at.clickOnEnterButton(driver);
//		at.getStartDate().click();
//		at.getNextMonth().click();
//		at.getDateStart().click();
//    	at.getDueDate().click();
		at.getNextMonthDue().click();
//		at.getNextMonthDue().click();
//		at.getDateDue().click();
//     	at.getStatus().click();
//		at.getNotStarted().click();
//		at.getPriority().click();
//		at.getPriCritical().click();
		at.getDescription().sendKeys(eLib.readDataFromExcel("AddTask", 1, 2));
		at.getSaveBtn().click();
		//driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
	}
}
