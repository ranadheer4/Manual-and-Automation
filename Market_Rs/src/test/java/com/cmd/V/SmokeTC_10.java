package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.ProviderPortalUser;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
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
		Thread.sleep(7000);
		ppu.getpPortalUser().click();
		Thread.sleep(7000);
		ppu.getProvidersList().click();
		Thread.sleep(5000);
		ppu.getProviderSelect().click();
		Thread.sleep(5000);
		ppu.getEmail().clear();
		Thread.sleep(5000);
		ppu.getEmail().sendKeys(eLib.readDataFromExcel("SmokeTC_10", 1, 0));
		ppu.getPwd().sendKeys(eLib.readDataFromExcel("SmokeTC_10", 1, 1));
		ppu.getAddToportal().click();
		ppu.getNoBtn().click();
		Thread.sleep(5000);
	}
}
