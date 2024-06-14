package com.olobby.Tasks;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.ProjFullScrView;
import com.TaskManagement.ObjRepo.SnapshotProjects;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_18 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void SortingTasksFullScrView() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		ProjFullScrView pfs = new ProjFullScrView(driver);
		SnapshotProjects sp = new SnapshotProjects(driver);
	    hp.getTaskManageMent().click();
	    tm.getSnapshotClick().click();
        sp.getShowFullScrnProj().click();
       pfs.getProjName().click();
       pfs.getProjId().click();
       pfs.getTask().click();
       pfs.getOverdueTask().click();
       pfs.getCreator().click();
       pfs.getCreatedDate().click();
       pfs.getStartDate().click();
       pfs.getDueDate().click();
       pfs.getLastModified().click();
       pfs.getLastUpdated().click();
       pfs.getCloseTab().click();
        
        
}
}