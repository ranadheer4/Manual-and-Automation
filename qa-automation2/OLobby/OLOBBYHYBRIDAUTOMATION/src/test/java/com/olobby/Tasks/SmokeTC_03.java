package com.olobby.Tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddTask;
import com.TaskManagement.ObjRepo.SnapshotTasks;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_03 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void AddTasks() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		//Projects pro = new Projects(driver);
		SnapshotTasks st = new SnapshotTasks(driver);
		AddTask at = new AddTask(driver);
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		hp.getTaskManageMent().click();
		tm.getSnapshotClick().click();
		st.getAddTask().click();
		at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
		at.getLocation().click();
		at.getIndia().click();
		at.getSaveBtn().click();
		Thread.sleep(5000); st.getAddTask().click();
		at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
		at.getLocation().click(); at.getIndia().click();
		at.getProjName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 1));
		at.clickOnEnterButton(driver);
	    at.getDescription().sendKeys(eLib.readDataFromExcel("AddTask", 1, 2));
		at.getSaveBtn().click(); Thread.sleep(5000); st.getAddTask().click();
		at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
		at.getLocation().click(); at.getIndia().click();
		at.getProjName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 1));
		at.clickOnEnterButton(driver);
		at.getDescription().sendKeys(eLib.readDataFromExcel("AddTask", 1, 2));
		at.getStartDate().click(); //at.getNextMonth().click();
		at.getDateStart().click(); at.getDueDate().click();
		at.getNextMonthDue().click(); //at.getNextMonthDue().click();
		at.getDateDue().click(); at.getSaveBtn().click();
		Thread.sleep(3000);
		st.getAddTask().click();
		at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
		at.getLocation().click();
		at.getIndia().click();
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
	//	at.getPriority().sendKeys(eLib.readDataFromExcel("AddTask", 1, 3));
	//	at.clickOnEnterButton(driver);
		at.getAttachUploadFiles().click();
	//	at.getBrowseFiles().click();
	//	driver.findElement(By.xpath("‪C:\\Users\\VikramDanvale\\Desktop\\inspect.png")).click();
		at.getConnectFiles().click();
		at.getIndiaGrp().click();
		Thread.sleep(3000);
		at.getPuneLoc().click();
		at.getTesting1().click();
		at.getFile().click();
		at.getConnFiles().click();
		at.getSaveBtnConnFiles().click();
		at.getSaveBtn().click();
	    
		
	}

}
