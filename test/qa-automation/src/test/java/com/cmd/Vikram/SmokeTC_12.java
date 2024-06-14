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
		ps1.closeLeftSideBar(driver);
		ps1.scrollBarAction(driver);
		ps1.getWorkflowNotes().click();
		ps1.getSearch().sendKeys(eLib.readDataFromExcel("SmokeTC12", 1, 0));	
		Thread.sleep(1000);
		ps1.getEditbtn().click();
		ps1.getEnterDescription().clear();
		ps1.getEnterDescription().sendKeys(eLib.readDataFromExcel("SmokeTC12", 1, 1)+jLib.getRandomNumber());
		ps1.getUpdate().click();
		Thread.sleep(3000);
	}
}
