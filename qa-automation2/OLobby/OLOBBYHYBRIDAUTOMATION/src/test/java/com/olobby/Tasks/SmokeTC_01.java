package com.olobby.Tasks;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.Projects;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_01 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void DefaultLocationProj() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		Projects pro = new Projects(driver);
		Thread.sleep(5000);
		hp.getTaskManageMent().click();
		tm.getProjectClicik().click();
		tm.getDefaultLoc().click();
		pro.getLocation().sendKeys(eLib.readDataFromExcel("Location", 2, 0));
		pro.clickOnEnterButton(driver);
		pro.getSaveBtn().click();
			
		
		}	
	
}
