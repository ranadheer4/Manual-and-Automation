package com.olobby.FileShare;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.createProjFileShare;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;



public class CreateProjectsPractice extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	
	@Test
	public void AddTasksFromFoldAccAssignTM() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		createProjFileShare cp = new createProjFileShare(driver);
		Thread.sleep(2000);
		hp.getFileShare().click();
		Thread.sleep(5000);
		cp.getCreateProj().click();
		cp.getClient().click();
		cp.getVikramC1().click();
		//cp.clickOnEnterButton(driver);
		cp.getProjDueDtae().click();
		cp.getDate().click();
	//	cp.getProjDueDtae().sendKeys(eLib.readDataFromExcel("createProj", 34, 1));
	//	cp.clickOnEnterButton(driver);
		cp.getProjName().sendKeys(eLib.readDataFromExcel("createProj", 109, 2));
		//cp.clickOnEnterButton(driver);
		//Thread.sleep(3000);
		cp.getAmrut().click();
		cp.getChandan().click();	
		cp.getDebashish().click();
		cp.getSupriya().click();
		//Thread.sleep(3000);
		//cp.scrollBarAction(driver);
		cp.getCreate().click();
		driver.quit();
		
	}
	
}
