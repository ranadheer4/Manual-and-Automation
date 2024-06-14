package com.cmd.P;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.addChildNotePage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class addChildNote extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest" ,retryAnalyzer = com.cps.genericUtility.RetryAnalyserImptn.class)
	public void addChildNotee() throws InterruptedException {
		//create an object of addChildNotePage Class
       addChildNotePage add = new addChildNotePage(driver);
        //click on the link
		add.getClick().click();
		Thread.sleep(1000);
		//click on add note button
		add.getClickAddNote().click();
		Thread.sleep(1000);
		//enter description in box
		add.getEnterDescription().sendKeys("abcs");
		Thread.sleep(1000);
		//click on create button
		add.getClickCreateButton().click();
		Thread.sleep(3000);
		//click on close button
		add.getClickCrossbotton().click();
		Thread.sleep(3000);
		CmdHomePage hpage = new CmdHomePage(driver);
		//click on sign out button
		hpage.getSignOut().click();
	}

}
