package com.olobby.Tasks;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.Search;
import com.TaskManagement.ObjRepo.SnapshotTasks;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_12 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test
	public void SearchTasks() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		SnapshotTasks st = new SnapshotTasks(driver);
		Search sert = new Search(driver);
		hp.getTaskManageMent().click();
	    tm.getSnapshotClick().click();
	    st.getSearchTask().sendKeys(eLib.readDataFromExcel("ChangeLocation", 1, 2));
	    String text = sert.getSearchTask1().getText();
	    System.out.println(text);
	    
	}
}
