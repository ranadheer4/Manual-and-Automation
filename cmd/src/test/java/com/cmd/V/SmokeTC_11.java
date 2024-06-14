package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_11 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
@Test	
public void createPredefinedNote() throws InterruptedException	
{
	
	Predefined_Selection ps=new Predefined_Selection(driver);
	ps.mouseHover(driver);
	ps.getSettings().click();
	Thread.sleep(7000);
	ps.getPredefinedSelection().click();
	ps.closeLeftSideBar(driver);
	ps.scrollBarAction(driver);
	ps.getWorkflowNotes().click();
	ps.getCreatePN().click();
	ps.getEnterSubject().sendKeys(eLib.readDataFromExcel("SmokeTC11", 1, 0));
	ps.getEnterDescription().sendKeys(eLib.readDataFromExcel("SmokeTC11", 1, 1));
	ps.getCreateBtn().click();
	Thread.sleep(5000);
}
	
	
}
	