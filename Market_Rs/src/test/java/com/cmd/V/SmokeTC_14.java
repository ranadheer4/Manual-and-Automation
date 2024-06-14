package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_14 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void editTask() throws InterruptedException
	{
		Predefined_Selection ps3=new Predefined_Selection(driver);
		ps3.mouseHover(driver);
		ps3.getSettings().click();
		Thread.sleep(7000);
		ps3.getPredefinedSelection().click();
		ps3.closeLeftSideBar(driver);
		ps3.scrollBarAction(driver);
		ps3.getWorkflowTask().click();
		ps3.getSearch().sendKeys(eLib.readDataFromExcel("SmokeTC13", 11, 0));
		ps3.scrollBarAction(driver);
		Thread.sleep(3000);
		ps3.getEditbtn().click();
		ps3.getDescriptionTask().clear();
		ps3.getDescriptionTask().sendKeys(eLib.readDataFromExcel("SmokeTC13", 11, 1)+jLib.getRandomNumber());
		Thread.sleep(3000);
		ps3.getUpdate().click();
		Thread.sleep(5000);
			
	}
}
