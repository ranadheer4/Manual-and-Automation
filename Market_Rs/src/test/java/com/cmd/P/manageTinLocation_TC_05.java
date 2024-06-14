package com.cmd.P;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.ManageTinLocationPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.ExcelUtility;
import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.WebDriverUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public class manageTinLocation_TC_05 extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test
	public void addlLocation() throws InterruptedException, AWTException
    {
        ManageTinLocationPage addlocation=new ManageTinLocationPage(driver);
        addlocation.mouseHover(driver);
        addlocation.clickManageTinLocation();
        addlocation.clickAddLocation();
        addlocation.clickPracticeInfo();
        Thread.sleep(2000);
        addlocation.getDrpdownNew().sendKeys(eLib.readDataFromExcel("OnBoarding", 1, 1));
        addlocation.clickOnEnterButton(driver);        
        Thread.sleep(2000);
        //driver.findElement(By.id("3")).click();
        addlocation.practiceName("practicename");
        addlocation.clickSaveLocation();
        Reporter.log("Successfully created",true);
        CmdHomePage hpage = new CmdHomePage(driver);
        hpage.getSignOut().click();
      }
}