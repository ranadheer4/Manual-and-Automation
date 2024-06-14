package com.cmd.V;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.ManageTinLocationPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_01 extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void addTin() throws InterruptedException
	{	
				
	   //Create object ManageTinLocationPage 
		ManageTinLocationPage addtin=new ManageTinLocationPage(driver);			
		addtin.mouseHover(driver);
		addtin.clickManageTinLocation();
		Thread.sleep(10000);
		addtin.clickAddTin();
		addtin.clicktTinInfo();
		Thread.sleep(5000);
		addtin.getTinName().sendKeys(eLib.readDataFromExcel("SmokeTC1",2,0));
		addtin.getTinGrpName().sendKeys(eLib.readDataFromExcel("SmokeTC1",2,1));
		addtin.clickSavebtn();
		Reporter.log("Successfully added Tin",true);
		Thread.sleep(3000);
		
	}
}
//sucess
