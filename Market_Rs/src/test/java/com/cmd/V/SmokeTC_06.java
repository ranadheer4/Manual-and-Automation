package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Edit_TIN;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_06 extends BaseClass
{
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void editTin() throws InterruptedException
	{
		Edit_TIN et = new Edit_TIN(driver);
		et.mouseHover(driver);
		Thread.sleep(5000);
	//	et.clickManageTinLocation();
		et.getCategoryTin().sendKeys(eLib.readDataFromExcel("SmokeTC_6", 1, 0));
		et.clickOnEnterButton(driver);
		et.getTinGrpName().sendKeys(eLib.readDataFromExcel("SmokeTC_6", 1, 1));
		et.clickOnEnterButton(driver);
		Thread.sleep(3000);
		et.getSearchBtn().click();
		Thread.sleep(5000);
		et.getEdit().click();
		et.getTinNameR().clear();
		et.getTinNameR().sendKeys(eLib.readDataFromExcel("SmokeTC_6",1,2)+jLib.getRandomNumber());
		et.getTinGrpNameR().clear();
		et.getTinGrpNameR().sendKeys(eLib.readDataFromExcel("SmokeTC_6", 1, 1));
		et.getSaveBtn().click();
		Thread.sleep(5000);
		
	}
}

