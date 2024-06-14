package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_12 extends BaseClass {

	@Test
	public void editNoteInPreDefSel() throws InterruptedException
	{
		Predefined_Selection ps1 = new Predefined_Selection(driver);
		ps1.mouseHover(driver);
		ps1.getSettings().click();
		ps1.getPredefinedSelection().click();
		Thread.sleep(5000);
		ps1.closeLeftSideBar(driver);
		Thread.sleep(5000);
		ps1.scrollBarAction(driver);
		Thread.sleep(5000);
		ps1.getSearch().sendKeys(eLib.readDataFromExcel("SmokeTC12", 1, 0));
		
		
		
	}
}
