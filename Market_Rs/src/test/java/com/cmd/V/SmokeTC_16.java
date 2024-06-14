package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.ObjectRepository.UserManagement;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_16 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void editUser() throws InterruptedException
	{
		Predefined_Selection psum = new Predefined_Selection(driver);
		UserManagement eu = new UserManagement(driver);
		psum.mouseHover(driver);
		psum.getSettings().click();
		Thread.sleep(7000);
		eu.getUsermgment().click();
		psum.closeLeftSideBar(driver);
		Thread.sleep(7000);
	//	eu.getClickUser().click();
	//	Thread.sleep(3000);
		eu.getEditUser().click();
		eu.getJobTitle().clear();
		eu.getJobTitle().sendKeys(eLib.readDataFromExcel("SmokeTC16", 1, 1)+jLib.getRandomNumber());
		Thread.sleep(5000);
		eu.getUpdatebtn().click();
		Thread.sleep(5000);
	}
	
}
