package com.olobby.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.SnapshotTasks;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.TaskManagement.ObjRepo.TasksFullScreenView;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_17 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void SortingSubTasks() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		TasksFullScreenView tfs = new TasksFullScreenView(driver);
		SnapshotTasks st = new SnapshotTasks(driver);
	    hp.getTaskManageMent().click();
	    tm.getSnapshotClick().click();
	    Thread.sleep(5000);
	    WebElement hideElement = driver.findElement(By.xpath("//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000000038 ']/../../td[@aria-colindex='4']/descendant::span[text()='ChangeLocation']/../following-sibling::span"));
        Thread.sleep(5000);
 	   ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hideElement);
 	   hideElement.click();
 	  Thread.sleep(5000);
 	    tfs.getAllSubTasks().click();
 	    tfs.getTaskId().click();
	    tfs.getAssignedBy().click();
	    tfs.getAssignedTo().click();
	    tfs.getCreator().click();
	    tfs.getCreatedDate().click();
	    tfs.getDueDate().click();
	    tfs.getPriority().click();
	    tfs.getLastModified().click();
        tfs.getModifiedBy().click();
        tfs.getCloseTab().click();
	    
}
}