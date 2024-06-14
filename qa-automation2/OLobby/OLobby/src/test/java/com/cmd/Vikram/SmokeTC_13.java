package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_13 extends BaseClass {

	@Test
	public void createTaskInPDS() throws InterruptedException
	{
		Predefined_Selection ps2=new Predefined_Selection(driver);
		ps2.mouseHover(driver);
		ps2.getSettings().click();
		ps2.getPredefinedSelection().click();
		ps2.closeLeftSideBar(driver);
		ps2.scrollBarAction(driver);
		ps2.getWorkflowTask().click();
		ps2.getCreatePT().click();
		ps2.getSubjectTask().sendKeys(eLib.readDataFromExcel("SmokeTC13", 1, 0));
		ps2.getDescriptionTask().sendKeys(eLib.readDataFromExcel("SmokeTC13", 1, 1)+jLib.getRandomNumber());
		ps2.getCreateTaskBtn().click();
    	Thread.sleep(3000);
		
	}
}
