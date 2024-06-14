
package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Edit_Location;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_07 extends BaseClass
{
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void editLocation() throws InterruptedException
	{
		Edit_Location el=new Edit_Location(driver);
		el.mouseHover(driver);
		Thread.sleep(5000);
		el.getCategoryTin().click();
		el.getCategoryTin().sendKeys(eLib.readDataFromExcel("SmokeTC_7", 1, 0));
		el.clickOnEnterButton(driver);
		Thread.sleep(5000);
		el.getTinGrpName().sendKeys(eLib.readDataFromExcel("SmokeTC_7", 1, 3));
		el.clickOnEnterButton(driver);
		Thread.sleep(5000);
		el.getSearchBtn().click();
		Thread.sleep(5000);
		el.getExpandLoc().click();
		Thread.sleep(3000);
		el.getEditLoc().click();
		el.getTinDropD().sendKeys(eLib.readDataFromExcel("SmokeTC_7", 1, 2));
		el.clickOnEnterButton(driver);
		el.getPracticeName().clear();
		el.getPracticeName().sendKeys(eLib.readDataFromExcel("SmokeTC_7", 1, 3));
		el.clickOnEnterButton(driver);
		el.getSaveBtn().click();
		Thread.sleep(5000);
		
	}
}
