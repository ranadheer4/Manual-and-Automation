package com.olobby.Tasks;
import org.testng.annotations.Test;
import com.olobby.genericUtility.IConstants;
import com.olobby.genericUtility.JavaUtility;
import com.TaskManagement.ObjRepo.AddProjectPage;
import com.TaskManagement.ObjRepo.AddTask;
import com.TaskManagement.ObjRepo.Projects;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;

public class SmokeTestCase_tc_01 extends BaseClass {
	
//	static {
//		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
//	}
	@Test(groups="smokeTest")
    public void NewProjectCreationAndActionOnIt() throws InterruptedException {
		JavaUtility jLib = new JavaUtility();
		HomePage hpage = new HomePage(driver);
		Thread.sleep(3000);
		hpage.getTaskManageMent().click();
		Thread.sleep(2000);
		TaskManagement ts = new TaskManagement(driver);
		ts.getProjectClicik().click();
		Thread.sleep(3000);
		Projects  p = new Projects(driver);
		p.getAddProj().click();
		Thread.sleep(3000);
		AddProjectPage adp = new AddProjectPage(driver);
		adp.getEnterProjectName().sendKeys(eLib.readDataFromExcel("AddProject", 2, 0));
		Thread.sleep(3000);
		adp.getClickSaveButton().click();
		//Thread.sleep(3000);
	    ts.getProjectClicik().click();
		//Thread.sleep(5000);
		p.getAddProj().click();
		//Thread.sleep(4000);
		adp.getEnterProjectName().sendKeys(eLib.readDataFromExcel("AddProject", 2, 0));
		Thread.sleep(4000);
		AddTask at = new AddTask(driver);
		at.getStartDate().click(); at.getNextMonth().click();
		at.getDateStart().click(); //at.getDueDate().click();
		at.getNextMonthDue().click(); at.getNextMonthDue().click();
		at.getDateDue().click();
		at.getSaveBtn().click();
		Thread.sleep(3000);
		ts.getProjectClicik().click();
		p.getAddProj().click();
		adp.getEnterProjectName().sendKeys(eLib.readDataFromExcel("AddProject", 2, 0));
		Thread.sleep(3000);
		at.getStartDate().click(); at.getNextMonth().click();
		at.getDateStart().click(); at.getDueDate().click();
		at.getNextMonthDue().click(); at.getNextMonthDue().click();
		at.getDateDue().click();
		at.getStatus().click();
		at.getNotStarted().click();
		adp.getEnterPriority().click();
	    at.getSaveBtn().click();
	    
	 }
		
}
	
	


