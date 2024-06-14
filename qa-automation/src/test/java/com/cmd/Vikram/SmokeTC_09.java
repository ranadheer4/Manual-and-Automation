package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.ViewGeneratedForms;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_09 extends BaseClass {

	
	@Test
	public void viewGeneratedForm() throws InterruptedException
	{
		ViewGeneratedForms vgf=new ViewGeneratedForms(driver);
		vgf.mouseHover(driver);
		vgf.getReports().click();
		vgf.getGeneratedForm().click();
		vgf.getFormDate().click();
		vgf.getDate().click();		
        vgf.getToDate().click();
        vgf.getDate().click();
        vgf.getCategory().sendKeys(eLib.readDataFromExcel("SmokeTC_9", 1, 0));
        vgf.clickOnEnterButton(driver);
        vgf.getItem().sendKeys(eLib.readDataFromExcel("SmokeTC_9", 1, 1));
        vgf.clickOnEnterButton(driver);
        vgf.getSearch().click();
        vgf.getPdf().click();
        Thread.sleep(5000);
        
		
	}
	
}
