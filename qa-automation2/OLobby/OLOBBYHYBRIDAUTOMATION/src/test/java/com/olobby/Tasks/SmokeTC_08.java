package com.olobby.Tasks;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.TaskManagement;
import com.TaskManagement.ObjRepo.Tasks;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_08 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void DefaultView() throws InterruptedException
	{
		
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		Tasks tsk = new Tasks(driver);
	    hp.getTaskManageMent().click();
	    tm.getTasksClick().click();
	    tsk.getAddViews().click();
	    

	}
	
}
