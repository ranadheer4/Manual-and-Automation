package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.ObjectRepository.UserManagement;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_18 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void loginHistory() throws InterruptedException
	{
		Predefined_Selection psum1 = new Predefined_Selection(driver);
		UserManagement eu1 = new UserManagement(driver);
		psum1.mouseHover(driver);
		psum1.getSettings().click();
        Thread.sleep(10000);
		eu1.getUsermgment().click();
		psum1.closeLeftSideBar(driver);
		eu1.getClickUser().click();
		eu1.getLoginHistory().click();
		eu1.getCloseWindow().click();
		Thread.sleep(3000);
	}
}
