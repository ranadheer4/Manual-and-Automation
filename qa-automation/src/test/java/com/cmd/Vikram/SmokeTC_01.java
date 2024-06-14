package com.cmd.Vikram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.ManageTinLocationPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

public class SmokeTC_01 extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void addTin() throws Throwable
	{
	   //Create object ManageTinLocationPage 
		CmdHomePage hpage = new CmdHomePage(driver);
		ManageTinLocationPage addtin=new ManageTinLocationPage(driver);			
		addtin.mouseHover(driver);	
		Thread.sleep(5000);
		addtin.clickManageTinLocation();
		Thread.sleep(2000);
		addtin.clickAddTin();
		Thread.sleep(2000);
		addtin.clicktTinInfo();
		Thread.sleep(2000);
		addtin.getTinName().sendKeys(eLib.readDataFromExcel("SmokeTC1",2,0));
		addtin.getTinGrpName().sendKeys(eLib.readDataFromExcel("SmokeTC1",2,1));
		Thread.sleep(3000);
		addtin.clickSavebtn();
		Reporter.log("Successfully added Tin",true);
		
	}
}
//sucess
