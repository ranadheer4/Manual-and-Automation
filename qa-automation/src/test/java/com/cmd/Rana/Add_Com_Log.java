/* Decompiler 7ms, total 242ms, lines 28 */
package com.cmd.Rana;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.Cmd_Add_Com_Log;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Add_Com_Log extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void addComlog() throws InterruptedException {
      Cmd_Add_Com_Log acl = new Cmd_Add_Com_Log(driver);
      acl.mouseMover(driver);
      acl.clickWorkflowDropdown();
      Thread.sleep(5000);
      acl.clickWorkflowpage();
      Thread.sleep(3000);
      acl.pageClick();
      Thread.sleep(3000);
      acl.clickAddcomLog();
      Thread.sleep(5000);
      acl.getCaller().sendKeys(eLib.readDataFromExcel("Add_Com_Log", 1, 0));
      acl.getDesription().sendKeys(eLib.readDataFromExcel("Add_Com_Log", 1, 1));
      acl.getTin_PractiseDropdown().sendKeys(eLib.readDataFromExcel("Add_Com_Log", 1, 2));
      acl.clickEnter(driver);
      Thread.sleep(5000);
      acl.getProvidersDropdown().sendKeys(eLib.readDataFromExcel("Add_Com_Log", 1, 3));
      acl.clickEnter(driver);
      acl.clickAssigncheck();
      Thread.sleep(5000);
      acl.clickSave();
      Reporter.log("Successfully Created com log",true);
      Thread.sleep(5000);
      
   }
}
