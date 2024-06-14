package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.ProviderPortalUser;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

public class SmokeTC_10 extends BaseClass {

	static {
	System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
}
	
	
	@Test
	public void ProviderPortalUser1() throws InterruptedException
	{
		ProviderPortalUser ppu=new ProviderPortalUser(driver);
		ppu.mouseHover(driver);
		ppu.getSettings().click();
		ppu.getpPortalUser().click();
		ppu.getProvidersList().click();
		ppu.getProviderSelect().click();
		ppu.getEmail().clear();
		ppu.getEmail().sendKeys(eLib.readDataFromExcel("SmokeTC_10", 1, 0));
		ppu.getPwd().sendKeys(eLib.readDataFromExcel("SmokeTC_10", 1, 1));
		ppu.getAddToportal().click();
		ppu.getNoBtn().click();
		
	}
}
