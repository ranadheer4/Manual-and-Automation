package com.cmd.P;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CloseMultiplePage;
import com.cps.ObjectRepository.CmdHomePage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.DataBaseUtility;
import com.cps.genericUtility.ExcelUtility;
import com.cps.genericUtility.FileUtility;
import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.JavaUtility;
import com.cps.genericUtility.WebDriverUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
 //PRAKASH
public class closeMultiple_TC_03 extends BaseClass{
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}

	@Test(groups="smokeTest" )
	public void closeMultipleAndVerify() throws InterruptedException, IOException, AWTException {
		
		JavaUtility jLib=new JavaUtility();
		FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		wLib.waitTillPageGetsLoadImplicitlyWait(driver, 10);
		CmdHomePage hpage=new CmdHomePage(driver);
        hpage.getWorkflow().click();
	    hpage.clickcloseMultiple(driver);
		CloseMultiplePage cmp = new CloseMultiplePage(driver);
		Thread.sleep(3000);
		cmp.getSelectLocation().click();
	    cmp.getSelectLocationDropDown();
	    Thread.sleep(3000);
		cmp.getSelectParticularLocation().click();
		Thread.sleep(3000);
        WebElement Particular = cmp.getSelectLocation2356();
	    Thread.sleep(2000);
	    Particular.sendKeys(eLib.readDataFromExcel("CloseMultiple", 22, 1));
	    Thread.sleep(2000);
        wLib.clickOnEnterButton(driver);
        Thread.sleep(2000);
        //cmp.getSelectCheckbox();
        cmp.getCloseButton();
	    Reporter.log("Successfully Closed",true);
	    Thread.sleep(7000);
	 //   hpage.getSignOut().click();
	   
	    
   }
	
}
