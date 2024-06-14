package com.cmd.prakash;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.CreateTaskPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.ExcelUtility;
import com.cps.genericUtility.FileUtility;
import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.JavaUtility;
import com.cps.genericUtility.WebDriverUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public class createTask_TC_01 extends BaseClass {
//	static {
//		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
//	}
     @Test(groups="smokeTest")
     public void createTaskAndVerify() throws InterruptedException, AWTException, IOException {
    	
		JavaUtility jLib = new JavaUtility();
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		wLib.waitTillPageGetsLoadImplicitlyWait(driver, 30);
        CmdHomePage hpage=new CmdHomePage(driver); 
		hpage.clickaddTask(driver);
	    CreateTaskPage ctp=new CreateTaskPage(driver);
		ctp.getSubjectDropDown().sendKeys(eLib.readDataFromExcel("CreateTask", 1, 0)+jLib.getRandomNumber());
		ctp.getDescriptionBox().sendKeys(eLib.readDataFromExcel("CreateTask", 1, 1)+jLib.getRandomNumber());
        ctp.getPayerdropdown().click();
		ctp.clickAndAddPayerDropDown(driver);
		ctp.getPayer2().click();
		ctp.getSelectParticularPayer().click();
	    ctp.getTINdropDown().click();
     	ctp.SelectParticularTin(driver);
     	ctp.getTINDropDown2().click();
		ctp.getTinProLocaDropdown().click();
		ctp.ClickParticularTin(driver);
    	ctp.getAssignToDropDown().click();
    	ctp.SelectAssign(driver);
    	ctp.waitForClickElement(driver);
    	ctp.getCreateButton().click();
    	Reporter.log("Task is created Successfully",true);
    	Thread.sleep(4000);
    	//click signout button
    	hpage.getSignOut().click();
	}
    
}	 
		
		
		
			

