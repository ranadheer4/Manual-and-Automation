package com.cmd.V;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.ViewGeneratedForms;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_09 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	
	@Test
	public void viewGeneratedForm() throws InterruptedException
	{
		ViewGeneratedForms vgf=new ViewGeneratedForms(driver);
		vgf.mouseHover(driver);
		vgf.getReports().click();
		vgf.getGeneratedForm().click();
		Thread.sleep(10000);
//		vgf.getFormDate().click();
//		Thread.sleep(10000);
	//	vgf.getDate().click();	
	//	Thread.sleep(5000);
  //      vgf.getToDate().click();
   //     vgf.getDate().click();
        vgf.getCategory().sendKeys(eLib.readDataFromExcel("SmokeTC_9", 1, 0));
        vgf.clickOnEnterButton(driver);
        vgf.getItem().sendKeys(eLib.readDataFromExcel("SmokeTC_9", 1, 1));
        Thread.sleep(5000);
        vgf.clickOnEnterButton(driver);
        Thread.sleep(5000);
        vgf.getSearch().click();
        Thread.sleep(5000);
        vgf.getPdf().click();
        Thread.sleep(7000);
        
		
	}
	
}
