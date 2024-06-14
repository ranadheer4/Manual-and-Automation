package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_15 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void editEmailTemplates() throws InterruptedException
	{
		Predefined_Selection ps4 = new Predefined_Selection(driver);
		ps4.mouseHover(driver);
		ps4.getSettings().click();
		Thread.sleep(7000);
		ps4.getPredefinedSelection().click();
		ps4.closeLeftSideBar(driver);
		ps4.scrollBarAction(driver);
		ps4.getEmailTemplates().click();
		ps4.getEmailCategory().sendKeys(eLib.readDataFromExcel("SmokeTC13", 20, 0));		
		ps4.clickOnEnterButton(driver);
		ps4.mouseHoverBlank(driver);
		ps4.getSearchTask().sendKeys(eLib.readDataFromExcel("SmokeTC13", 20, 1));
		Thread.sleep(5000);
		ps4.scrollBarAction(driver);
		ps4.getEditbtn().click();
		Thread.sleep(5000);
		ps4.getUpdate().click();
		Thread.sleep(5000);
		
	}
}
		