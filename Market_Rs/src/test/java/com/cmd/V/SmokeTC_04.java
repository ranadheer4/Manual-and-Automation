package com.cmd.V;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.GenerateForm_WFPg;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class SmokeTC_04 extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void GenerateForm() throws InterruptedException, AWTException
	{
		GenerateForm_WFPg generateForm=new GenerateForm_WFPg(driver);
		
		Thread.sleep(10000);
		generateForm.clickGenerateForm();
	    generateForm.getEntityTypeField().sendKeys(eLib.readDataFromExcel("SmokeTC4", 1, 5));
		generateForm.clickEnter(driver);
		generateForm.clickNextBtn();
		generateForm.getProviderName().sendKeys(eLib.readDataFromExcel("SmokeTC4", 1, 0));
	    generateForm.clickEnter(driver);
		Thread.sleep(5000);
		generateForm.getLocation().sendKeys(eLib.readDataFromExcel("SmokeTC4", 1, 1));
	    generateForm.clickEnter(driver);
	    Thread.sleep(3000);
		generateForm.clickAdd();
		generateForm.clickNext1();
		generateForm.getclickFormtypeF().sendKeys(eLib.readDataFromExcel("SmokeTC4", 1, 2));
		generateForm.clickEnter(driver);
		Thread.sleep(3000);
		generateForm.getPayerTypeField().sendKeys(eLib.readDataFromExcel("SmokeTC4", 1, 3));
		generateForm.clickEnter(driver);
		Thread.sleep(3000);
		generateForm.getSelectFormF().sendKeys(eLib.readDataFromExcel("SmokeTC4", 1, 4));
	    generateForm.clickEnter(driver);
	    generateForm.clickPreview();
		generateForm.clickClose();
        generateForm.clickAddForm();
		generateForm.clickDowldForm();
		Thread.sleep(5000);
		generateForm.mouseOver3(driver);
		Reporter.log("Successfully Generated report",true);
		Thread.sleep(5000);
		
	
		
	}
}
