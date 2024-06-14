package com.olobby.FolderAccess;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddTask;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_06 extends BaseClass {

	static {
		     System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void AddTasksFromFoldAccNoAccess() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		AddTask at = new AddTask(driver);
		Thread.sleep(7000);
		hp.getFolder().click();
        at.getIndiaLocFoldAcces().click();
        Thread.sleep(3000);
        at.getPuneFoldAcc().click();
        Thread.sleep(3000);
        at.getPrashantGTestng().click();
        Thread.sleep(3000);
        at.getNoAccess().click();
        String text = at.getNoAccess().getText();
       System.out.println(text);
        Thread.sleep(3000);
    
	//   driver.quit();
	   
	}
}
