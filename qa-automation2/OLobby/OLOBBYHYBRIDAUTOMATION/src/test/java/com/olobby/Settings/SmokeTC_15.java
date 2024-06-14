package com.olobby.Settings;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.SnapshotTasks;
import com.TaskManagement.ObjRepo.Sorting;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_15 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void SortingTasks() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		Sorting sort = new Sorting(driver);
		SnapshotTasks st = new SnapshotTasks(driver);
        hp.getTaskManageMent().click();
        tm.getSnapshotClick().click();
        Thread.sleep(5000);
        sort.getTaskName().click();
     //   Thread.sleep(1000);
        sort.getTaskName().click();
        st.getAssignProjTask();
        st.getAssignByTasks().click();
        st.getAssignToTasks().click();
        st.getDuedateTasks().click();
        st.getAttachmentTask().click();
        st.getLocationTask().click();
        st.getCreateddateTasks().click();
        st.getCreatorTasks().click();
        st.getPriorityTask().click();
        st.getStatusTasks().click();
        st.getLastModifiedTasks().click();
        st.getModifiedByTasks().click();
    
	
}
}