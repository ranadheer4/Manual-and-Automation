package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.Edit_TIN;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_06 extends BaseClass
{

	@Test
	public void editTin() throws InterruptedException
	{
		Edit_TIN et = new Edit_TIN(driver);
		et.mouseHover(driver);
		et.clickManageTinLocation();
		et.getCategoryTin().sendKeys(eLib.readDataFromExcel("SmokeTC_6", 1, 0));
		et.clickOnEnterButton(driver);
		et.getTinGrpName().sendKeys(eLib.readDataFromExcel("SmokeTC_6", 1, 1));
		et.clickOnEnterButton(driver);
		et.getSearchBtn().click();
		et.getEdit().click();
		et.getTinNameR().clear();
		et.getTinNameR().sendKeys(eLib.readDataFromExcel("SmokeTC_6",1,2)+jLib.getRandomNumber());
		et.getTinGrpNameR().clear();
		et.getTinGrpNameR().sendKeys(eLib.readDataFromExcel("SmokeTC_6", 1, 1));
		et.getSaveBtn().click();
		
	}
}

