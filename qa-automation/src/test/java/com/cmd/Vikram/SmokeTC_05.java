package com.cmd.Vikram;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CMS_ImportPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

public class SmokeTC_05 extends BaseClass
{
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test
	public void cmsImportP() throws InterruptedException
	{
		CMS_ImportPage addPro=new CMS_ImportPage(driver);
		addPro.mouseOverCMS(driver);
		addPro.getProviderPassport();
		addPro.getCmsImport();
		addPro.npiSend();
		addPro.getSearchBtn();
		Reporter.log("Successfully NPI Send",true);
		Thread.sleep(3000);
		
	}
}
