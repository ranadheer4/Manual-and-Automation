package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_14 extends BaseClass {

	
	@Test
	public void editTask() throws InterruptedException
	{
		Predefined_Selection ps3=new Predefined_Selection(driver);
		ps3.mouseHover(driver);
		ps3.getSettings().click();
		ps3.getPredefinedSelection().click();
		ps3.closeLeftSideBar(driver);
		ps3.scrollBarAction(driver);
		ps3.getWorkflowTask().click();
		ps3.getSearch().sendKeys(eLib.readDataFromExcel("SmokeTC13", 11, 0));
		ps3.scrollBarAction(driver);
		ps3.getEditbtn().click();
		ps3.getDescriptionTask().clear();
		ps3.getDescriptionTask().sendKeys(eLib.readDataFromExcel("SmokeTC13", 11, 1)+jLib.getRandomNumber());
		ps3.getUpdate().click();
		Thread.sleep(5000);
			
	}
}
