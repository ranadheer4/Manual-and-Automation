package com.olobby.P;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.InlineEdit;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;

public class SmokeTestCase_tc_13 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smikeTest")
	public void TestTrashFeatureForProjects() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		hpage.getTaskManageMent().click();
		Thread.sleep(2000);
		InlineEdit iet = new InlineEdit(driver);
		iet.getDeleteButton().click();
		
		
		
	}

}
