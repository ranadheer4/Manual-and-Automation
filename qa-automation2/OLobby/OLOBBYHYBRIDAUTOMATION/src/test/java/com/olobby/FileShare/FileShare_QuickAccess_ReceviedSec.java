package com.olobby.FileShare;

import org.testng.annotations.Test;

import com.fileShare.ObjectRepo.QS_RequestFile;
import com.fileShare.ObjectRepo.QuickShare_Homepage;
import com.fileShare.ObjectRepo.file_Share;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class FileShare_QuickAccess_ReceviedSec extends BaseClass{
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(priority = 2)
   public void requestFiles2() throws InterruptedException {
	   
	   wLib.waitForPageToLoad(driver);
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getFileShare().click();
	   Thread.sleep(5000);
	   file_Share fs = new file_Share(driver);
	   
	   fs.getQuickShare().click();
	   Thread.sleep(5000);
	   QS_RequestFile qs = new QS_RequestFile(driver);
	   qs.getRequestFiles().click();
	   Thread.sleep(3000);
	   qs.getName().sendKeys(eLib.readDataFromExcel("RequestFile1", 1, 0));
	   
	   qs.getMail().sendKeys(eLib.readDataFromExcel("RequestFile1", 1, 1));
	   
	   qs.getAdd().click();
	   qs.getPin().sendKeys(eLib.readDataFromExcel("RequestFile1", 1, 2));
	   qs.getSubject().sendKeys(eLib.readDataFromExcel("RequestFile1", 1, 3));
	   qs.getSendRequest().click();
	   Thread.sleep(5000);
   }
   @Test(priority = 1)
		   public void receviedSection() throws InterruptedException {
	  
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getFileShare().click();
	   Thread.sleep(5000);
	   file_Share fs = new file_Share(driver);
	   fs.getQuickShare().click();
	   Thread.sleep(5000);
	   QuickShare_Homepage qh = new QuickShare_Homepage(driver);
	   qh.getRecevied().click();
	   Thread.sleep(3000);
	   qh.clickLinkByName("Eewww(3)");
	   Thread.sleep(3000);
	   //qh.selectCheckBoxRecevier("Requested by Nitin Pasula on 07/07/23 04:57 PM");
}
}