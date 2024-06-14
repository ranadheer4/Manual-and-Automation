package com.olobby.P;

import org.apache.maven.artifact.repository.metadata.Snapshot;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.SnapshotTasks;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTestCase_tc_10 extends BaseClass{
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void VerifyAllTaskAndShowAllTabs() throws InterruptedException {
		
		HomePage hpage = new HomePage(driver);
		hpage.getTaskManageMent().click();
		Thread.sleep(3000);
		SnapshotTasks ss = new SnapshotTasks(driver);
		ss.getShowAllTask().click();
		Reporter.log("successfully click show all Tabs",true);
		Thread.sleep(3000);
		ss.getDueToday().click();
		Reporter.log("successfully click Due Today",true);
		Thread.sleep(3000);
		ss.getDueThisWeek().click();
		Reporter.log("successfully click due this week tab",true);
		Thread.sleep(3000);
		ss.getAssignTodayTask().click();
		Reporter.log("successfully click Assigned Today",true);
		Thread.sleep(2000);
		ss.getUnassignDuedateTask().click();
		Reporter.log("successfully click UnAssignedDue Date",true);
		Thread.sleep(2000);
		

	}
}
