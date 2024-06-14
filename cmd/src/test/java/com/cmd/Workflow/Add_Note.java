
package com.cmd.Workflow;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.Cmd_Add_Note;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;
@Listeners(com.cps.genericUtility.ItestListenerImtn.class)
public class Add_Note extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void addNote() throws InterruptedException {
      Cmd_Add_Note n = new Cmd_Add_Note(driver);
      n.mouseMover(driver);
      n.clickWorkflowDropdown();
      Thread.sleep(5000);
      
      n.clickWorkflowpage();
      Thread.sleep(5000);
      n.pageClick();
      Thread.sleep(5000);
      n.clickAddnote();
      Thread.sleep(3000);
      n.getSubject().sendKeys(eLib.readDataFromExcel("Add_Note", 1, 0));
      n.getDescription().sendKeys(eLib.readDataFromExcel("Add_Note", 1, 1));
      n.getPayerdropdown().sendKeys(eLib.readDataFromExcel("Add_Note", 1, 2));
      n.clickEnter(driver);
      n.getTindropdown().sendKeys(eLib.readDataFromExcel("Add_Note", 1, 3));
      n.clickEnter(driver);
      n.getTinprovlocdropdown().sendKeys(eLib.readDataFromExcel("Add_Note", 1, 4));
      n.clickEnter(driver);
      n.getAutoTPLdrpdwn().sendKeys(eLib.readDataFromExcel("Add_Note", 1, 5));
      n.clickEnter(driver);
      n.getStatusDrpd().sendKeys(eLib.readDataFromExcel("Add_Note", 1, 6));
      n.clickEnter(driver);
      n.clickDate();
      
      n.clickCreate();
      Reporter.log("Successfully added note",true);
      
//      CmdHomePage hpage = new CmdHomePage(driver);
//      hpage.getSignOut().click();
   }
}
