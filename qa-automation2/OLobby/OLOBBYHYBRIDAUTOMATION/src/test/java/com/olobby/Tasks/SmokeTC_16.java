package com.olobby.Tasks;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.SnapshotTasks;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.TaskManagement.ObjRepo.TasksFullScreenView;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_16 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void SortingTasksFullScrView() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		TasksFullScreenView tfs = new TasksFullScreenView(driver);
		SnapshotTasks st = new SnapshotTasks(driver);
	    hp.getTaskManageMent().click();
	    tm.getSnapshotClick().click();
	    st.getShowFullScrnTask().click();
	    Thread.sleep(5000);
 //     tfs.getTaskName().click();
	    tfs.getTaskId().click();
	    tfs.getAssignedProj().click();
	    tfs.getAssignedBy().click();
	    tfs.getAssignedTo().click();
	    tfs.getCreator().click();
	    tfs.getCreatedDate().click();
	    tfs.getDueDate().click();
	    tfs.getAttachment().click();
	    tfs.getLocation().click();
	    tfs.getPriority().click();
	    tfs.getLastModified().click();
	    tfs.getLastUpdatedBy().click();
        tfs.getCloseTab().click();
	    
	
}
}