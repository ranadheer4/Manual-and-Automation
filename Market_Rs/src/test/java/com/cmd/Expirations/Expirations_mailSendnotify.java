package com.cmd.Expirations;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.Expiration_MailSendNotify;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class Expirations_mailSendnotify extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
		}
	
   @Test(groups = {"SmokeTest"})
   public void sendMail() throws InterruptedException {
	   Expiration_MailSendNotify ms=new Expiration_MailSendNotify(driver);
	   ms.mouseMover(driver);
       ms.clickExpirations();
       Thread.sleep(5000);
       ms.clickPage();
       Thread.sleep(5000);
       ms.clickTableCell(5, 2);
       //ms.clickSendMail("Abadie Brianna");
       
       ms.getSendMail().click();
       Thread.sleep(3000);
       ms.clickOption();
       Thread.sleep(3000);
       ms.clickUncheck();
       Thread.sleep(8000);
       ms.getMail().sendKeys(eLib.readDataFromExcel("Exp_Sendmail_Notify", 1, 0));
       ms.clickSend();
       Reporter.log("Successfully Mail Sent",true);
       Thread.sleep(7000); 
//       CmdHomePage hpage = new CmdHomePage(driver);
//       hpage.getSignOut().click();
}
}