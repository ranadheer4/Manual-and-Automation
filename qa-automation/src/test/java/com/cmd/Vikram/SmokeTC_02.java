package com.cmd.Vikram;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.ManageTinLocationPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
//abcd
public class SmokeTC_02 extends BaseClass implements IConstants{
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test
	public void addlLocation() throws InterruptedException
	{
		ManageTinLocationPage addlocation=new ManageTinLocationPage(driver);
		Thread.sleep(5000);
		addlocation.mouseHover(driver);
		
		addlocation.clickManageTinLocation();
		Thread.sleep(3000);
		
		addlocation.clickAddLocation();
		Thread.sleep(3000);
		addlocation.clickPracticeInfo();
		//Thread.sleep(5000);
	    addlocation.getDrpdownNew().sendKeys(eLib.readDataFromExcel("SmokeTC1", 1, 2));
        //Thread.sleep(5000);
		addlocation.clickEnter(driver);
		//Thread.sleep(5000);
		addlocation.practiceName(practicename);
		addlocation.clickSaveLocation();
		Thread.sleep(5000);
		Reporter.log("Successfully added location",true);
		
	}
}
