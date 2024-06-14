package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.Predefined_Selection;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_11 extends BaseClass {
	
@Test	
public void predefinedSelection() throws InterruptedException	
{
	
	Predefined_Selection ps=new Predefined_Selection(driver);
	ps.mouseHover(driver);
	ps.getSettings().click();
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
	