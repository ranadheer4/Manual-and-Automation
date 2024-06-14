package com.cmd.Expirations;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.Expiration_Weekly;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class ExpirationWeekly extends BaseClass{
    static {
        System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
    }  
     @Test  
     public void weeklyExpiration() throws InterruptedException {
         Expiration_Weekly ew=new Expiration_Weekly(driver);
           ew.mouseMover(driver);
           ew.clickExpirations();
           Thread.sleep(5000);
           ew.clickPage();
           Thread.sleep(5000);
           ew.getWeeklyExpiration().click();
           Thread.sleep(6000);
           ew.getTin().sendKeys(eLib.readDataFromExcel("Exp_Sendmail", 1, 0));
           ew.getUsers().sendKeys(eLib.readDataFromExcel("Exp_Sendmail", 1, 1));
           Thread.sleep(3000);
           ew.getSearch().click();
           Thread.sleep(7000);
           
     }
}

