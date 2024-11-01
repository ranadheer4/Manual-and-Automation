package com.cmd.Vikram;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.ShowAllProviderPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

public class SmokeTC_03 extends BaseClass implements IConstants {
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void addProvider() throws AWTException, InterruptedException
	{
		ShowAllProviderPage addprovider=new ShowAllProviderPage(driver);
		addprovider.mouseHover(driver);
		addprovider.clickproviderPassport();
		addprovider.clickShowAllProvider();
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
		
	}
}
