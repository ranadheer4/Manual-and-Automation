package com.olobby.Settings;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.LocationTrash;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_19 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void deleteLocResFrmTrash() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		LocationTrash lt = new LocationTrash(driver);
		Thread.sleep(5000);
		hp.mouseOverSetting(driver);
		hp.getLocationMO().click();
        lt.getThreeDotLoc().click();
        lt.getDeleteLocBtn().click();
        lt.getDeletePopupBtn().click();
        Thread.sleep(3000);
        hp.getTrash().click();
        Thread.sleep(3000);
        lt.getTrashLocSel().click();
        String text = lt.getTrashGetTextLoc().getText();
        System.out.println(text);
        lt.getRestoreBtn().click();
        lt.getRestorePopUp().click();
        hp.mouseOverSetting(driver);
        hp.getLocationMO().click();
        String text1 = lt.getLocNameGetText().getText();
        System.out.println(text1);
      
}
}