/* Decompiler 4ms, total 234ms, lines 25 */
package com.cmd.Rana;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.Cmd_DeleteNote_Task;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Delete_Note_Task extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void deleteNotetask() throws InterruptedException {
      Cmd_DeleteNote_Task d = new Cmd_DeleteNote_Task(driver);
      d.mouseMover(driver);
      d.clickWorkflowDropdown();
      Thread.sleep(3000);
      d.clickDeletenoteTask();
      Thread.sleep(3000);
      d.clickPage();
      Thread.sleep(3000);
      d.getDropdown_category().sendKeys(eLib.readDataFromExcel("Delete_Note_Task", 1, 0));
      d.clickEnter(driver);
      Thread.sleep(3000);
      d.getDropdown_Item_Category().sendKeys(eLib.readDataFromExcel("Delete_Note_Task", 1, 1));
      d.clickEnter(driver);
      d.clickPrtcularCheckbox();
      d.clickDelete();
      Reporter.log("Successfully VISIBLE delete note",true);
      Thread.sleep(3000);
//      CmdHomePage hpage=new CmdHomePage(driver);
//      hpage.getSignOut().click();
   }
}
