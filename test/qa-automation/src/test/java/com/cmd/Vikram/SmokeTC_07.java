
package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.Edit_Location;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_07 extends BaseClass
{

	@Test
	public void editLocation() throws InterruptedException
	{
		Edit_Location el=new Edit_Location(driver);
		el.mouseHover(driver);
		el.getCategoryTin().click();
		el.getCategoryTin().sendKeys(eLib.readDataFromExcel("SmokeTC_7", 1, 0));
		el.clickOnEnterButton(driver);
		el.getTinGrpName().sendKeys(eLib.readDataFromExcel("SmokeTC_7", 1, 3));
		el.clickOnEnterButton(driver);
		el.getSearchBtn().click();
		el.getExpandLoc().click();
		el.getEditLoc().click();
		el.getClear().click();
		el.getTinDropD().sendKeys(eLib.readDataFromExcel("SmokeTC_7", 1, 2));
		el.clickOnEnterButton(driver);
		el.getPracticeName().clear();
		el.getPracticeName().sendKeys(eLib.readDataFromExcel("SmokeTC_7", 1, 3));
		el.clickOnEnterButton(driver);
		el.getSaveBtn().click();
		
	}
}
