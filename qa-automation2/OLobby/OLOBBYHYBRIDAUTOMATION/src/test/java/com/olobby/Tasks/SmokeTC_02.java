package com.olobby.Tasks;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.Projects;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;

public class SmokeTC_02 extends BaseClass {

	@Test
	public void t1()
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		Projects pro = new Projects(driver);
		hp.getTaskManageMent().click();
		tm.getSnapshotClick().click();
	
}
}