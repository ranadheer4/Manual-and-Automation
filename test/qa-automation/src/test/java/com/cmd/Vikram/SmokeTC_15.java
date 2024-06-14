package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_15 extends BaseClass {

	
	@Test
	public void editEmailTemplates() throws InterruptedException
	{
		Predefined_Selection ps4 = new Predefined_Selection(driver);
		ps4.mouseHover(driver);
		ps4.getSettings().click();
		ps4.getPredefinedSelection().click();
		ps4.closeLeftSideBar(driver);
		ps4.scrollBarAction(driver);
		ps4.getEmailTemplates().click();
		ps4.getEmailCategory().sendKeys(eLib.readDataFromExcel("SmokeTC13", 20, 0));		
		ps4.clickOnEnterButton(driver);
		ps4.mouseHoverBlank(driver);
		ps4.getSearchTask().sendKeys(eLib.readDataFromExcel("SmokeTC13", 20, 1));
		Thread.sleep(3000);
		ps4.scrollBarAction(driver);
		ps4.getEditbtn().click();
		ps4.getUpdate().click();
		Thread.sleep(5000);
		
	}
}
		