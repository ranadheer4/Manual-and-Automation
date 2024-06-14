package com.olobby.P;
import org.testng.annotations.Test;

import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;


public class SmokeTestCase_tc_03 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void VerifyTheWatcherAreAbleToViewThetTsk() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		Thread.sleep(2000);
		hpage.getTaskManageMent().click();
		Thread.sleep(2000);
		
	}
}
