package com.olobby.Settings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.LocationTrash;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_20 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void deleteGrpResFrmTrash() throws InterruptedException
	{
	
	HomePage hp = new HomePage(driver);
	LocationTrash lt = new LocationTrash(driver);
	Thread.sleep(5000);
	 	hp.mouseOverSetting(driver);
	hp.getLocationMO().click();
    lt.getThreeDotMahab().click();
    lt.getDeleteloc().click();
    lt.getDeletePopupBtn().click();
    Thread.sleep(1000);
    driver.switchTo().alert().accept();
    hp.getTrash().click();
    lt.getTrashGrpSelect().click();
    String text = lt.getGetTextTrashGrp().getText();
    System.out.println(text);
   lt.getRestoreBtn().click();
   lt.getRestorePopUp().click();
   hp.mouseOverSetting(driver);
	hp.getLocationMO().click();
	String text1 = lt.getGetTextGrp().getText();
	System.out.println(text1);
    
    
    
    
    
}
}