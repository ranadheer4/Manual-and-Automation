package com.cmd.V;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.ManageTinLocationPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
//abcd
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_02 extends BaseClass implements IConstants{
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	
	@Test
	public void addlLocation() throws InterruptedException, AWTException
	{
		ManageTinLocationPage addlocation=new ManageTinLocationPage(driver);
		addlocation.mouseHover(driver);
	//	addlocation.clickManageTinLocation();
        Thread.sleep(15000);
        addlocation.mouseHoverAddLoc(driver);
	//	addlocation.clickAddLocation();
		addlocation.clickPracticeInfo();
		Thread.sleep(5000);
	    addlocation.getDrpdownNew().sendKeys(eLib.readDataFromExcel("SmokeTC1", 1, 2));
        Thread.sleep(5000);
		addlocation.clickEnter(driver);
		Thread.sleep(5000);
		addlocation.practiceName(practicename);
		addlocation.clickSaveLocation();
		Reporter.log("Successfully added location",true);
		Thread.sleep(3000);
		
		
		
		
	}
	
		
}
