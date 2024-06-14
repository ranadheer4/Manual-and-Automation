package com.cmd.V;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.ShowAllProviderPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_03 extends BaseClass implements IConstants {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	
	/*
	 * static { System.setProperty(IConstants.edgeKey, IConstants.edgeValue); }
	 */
	@Test
	public void addProvider() throws AWTException, InterruptedException
	{
		ShowAllProviderPage addprovider=new ShowAllProviderPage(driver);
		addprovider.mouseHover(driver);
		Thread.sleep(3000);
		addprovider.clickproviderPassport();
		
		addprovider.clickShowAllProvider();
		Thread.sleep(3000);
		addprovider.clickaddprovider();
		addprovider.clickBasicInfo();
		addprovider.firstName(firstname);
		addprovider.lastName(lastname);
		addprovider.getenterCred().sendKeys(eLib.readDataFromExcel("SmokeTC4", 1, 6));
		addprovider.clickOnEnterButton(driver);
		addprovider.enterSSN(Ssn);
		addprovider.clickSave();
		Thread.sleep(50000);
		addprovider.mouseHover1(driver);
		Reporter.log("Successfully added Provider",true);
		Thread.sleep(5000);
		
	}
}
