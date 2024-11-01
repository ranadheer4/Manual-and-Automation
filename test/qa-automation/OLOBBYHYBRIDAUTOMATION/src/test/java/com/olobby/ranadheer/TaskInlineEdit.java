package com.olobby.ranadheer;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddProjectPage;
import com.TaskManagement.ObjRepo.InlineEdit;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class TaskInlineEdit extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void inlineEdit() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(2000);
	   hp.getTaskManageMent().click();
	   
	   TaskManagement t = new TaskManagement(driver);
	   
	   t.getTasksClick().click();
	   InlineEdit ie = new InlineEdit(driver);
	   Thread.sleep(2000);
	   ie.getAddRow().click();
	   Thread.sleep(5000);
	   ie.getTaskNameField().click();
	   Thread.sleep(5000);
	   ie.getTaskNameField().sendKeys(eLib.readDataFromExcel("Inline", 1, 0));
	   AddProjectPage ap = new AddProjectPage(driver);
	   ap.clickEnter(driver);
}
}