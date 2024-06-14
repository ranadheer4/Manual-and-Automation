package com.cmd.Vikram;

import org.testng.annotations.Test;

import com.cps.ObjectRepository.Edit_Provider;
import com.cps.genericUtility.BaseClass;

public class SmokeTC_08 extends BaseClass {		
	@Test
	 public void editProvider() throws InterruptedException 
	 {
	
		Edit_Provider ep=new Edit_Provider(driver);
		//ep.getEmail().sendKeys(eLib.readDataFromExcel("SmokeTC_8", 1, 0));
		//ep.getPwd().sendKeys(eLib.readDataFromExcel("SmokeTC_8", 1, 1));
		//ep.getLoginBtn().click();
		ep.mouseHover(driver);
		ep.getProviderPassport().click();
		ep.getShowAllProvider().click();
		ep.getProvider().sendKeys(eLib.readDataFromExcel("SmokeTC_8", 1, 0));
		ep.clickOnEnterButton(driver);
		ep.getSearch().click();
		ep.getEditProvider().click();
		//Thread.sleep(3000);
		ep.getBasicPI().click();
		ep.getFirstName().clear();
		ep.getFirstName().sendKeys(eLib.readDataFromExcel("SmokeTC_8", 1, 1));
		ep.clickOnEnterButton(driver);
		ep.getLastName().clear();
		ep.getLastName().sendKeys(eLib.readDataFromExcel("SmokeTC_8", 1, 2));
		ep.clickOnEnterButton(driver);
		ep.getCred().clear();
		ep.getCred().sendKeys(eLib.readDataFromExcel("SmokeTC_8", 1, 3));
		ep.clickOnEnterButton(driver);
		ep.getSsn().clear();
		ep.getSsn().sendKeys(eLib.readDataFromExcel("SmokeTC_8", 1, 4));
		ep.clickOnEnterButton(driver);
		ep.getSave().click();
		Thread.sleep(10000);
	 }
}

