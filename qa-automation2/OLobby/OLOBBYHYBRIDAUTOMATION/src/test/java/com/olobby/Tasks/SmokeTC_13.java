package com.olobby.Tasks;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.Search;
import com.TaskManagement.ObjRepo.SnapshotProjects;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_13 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void SearchProjects() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		SnapshotProjects snapp = new SnapshotProjects(driver);
		Search sp = new Search(driver);
		hp.getTaskManageMent().click();
		tm.getSnapshotClick().click();
		snapp.getSearchProj().sendKeys(eLib.readDataFromExcel("ChangeLocation", 1, 3));
		Thread.sleep(5000);
		String text = sp.getSearchProj1().getText();
        System.out.println(text);
        
		
		
	}
}
