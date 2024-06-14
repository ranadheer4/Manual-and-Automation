package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.ObjectRepository.UserManagement;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_17 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void addFavorites() throws InterruptedException
	{
		
		Predefined_Selection psum1 = new Predefined_Selection(driver);
		UserManagement eu1 = new UserManagement(driver);
		psum1.mouseHover(driver);
		psum1.getSettings().click();
		Thread.sleep(10000);
		eu1.getUsermgment().click();
		psum1.closeLeftSideBar(driver);
		eu1.getClickUser().click();
		eu1.getAddFavButton().click();
		eu1.getPayer().sendKeys(eLib.readDataFromExcel("SmokeTC16", 12, 0));
		Thread.sleep(5000);
		eu1.clickOnEnterButton(driver);
		eu1.BlankClick(driver);
		eu1.getStates().sendKeys(eLib.readDataFromExcel("SmokeTC16", 12, 1));
		Thread.sleep(5000);
		eu1.clickOnEnterButton(driver);	
		eu1.BlankClick(driver);
		Thread.sleep(5000);
		eu1.getForms().click();
		Thread.sleep(5000);
		eu1.getClose().click();
		Thread.sleep(5000);
		eu1.getOption().click();
		eu1.getUpdateForm().click();
		Thread.sleep(5000);	
	}
	
}
