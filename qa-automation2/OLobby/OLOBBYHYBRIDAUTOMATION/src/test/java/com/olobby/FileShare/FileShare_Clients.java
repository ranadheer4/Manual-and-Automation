package com.olobby.FileShare;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.InlineEdit;
import com.fileShare.ObjectRepo.Clients;
import com.fileShare.ObjectRepo.Projects;
import com.fileShare.ObjectRepo.UserAcees_Homepage;
import com.fileShare.ObjectRepo.file_Share;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class FileShare_Clients extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void clients() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getFileShare().click();
	   Thread.sleep(8000);
	   file_Share fs = new file_Share(driver);
	   Thread.sleep(8000);
	   fs.getClients().click();
	   Clients c = new Clients(driver);
	   Thread.sleep(6000);
//	   c.getFsAllClients().click();
//	   c.getEditClient().click();
//	   Thread.sleep(3000);
//	   c.getDeleteClinet().click();
	   UserAcees_Homepage ua = new UserAcees_Homepage(driver);
	  
//	   Thread.sleep(3000);
//	   hp.getTrash().click();
	   InlineEdit ie = new InlineEdit(driver);
//	   Thread.sleep(3000);
//	   ie.getRestoreCheckbox().click();
//	   ie.getRestoreButton().click();		
//	   ie.getRestorePopup().click();
	   //delete CLIENTS by group and restore from trash
	   c.getClientByGroup().click();
	   Thread.sleep(6000);
	   c.getManageClients().click();
	   Thread.sleep(3000);
	   c.getDeleteGrpClnt().click();
	   Thread.sleep(3000);
	   ua.getdeleteNotify().click();
	   Thread.sleep(3000);
	   hp.getTrash().click();
	   Thread.sleep(3000);
	   c.getCheckbox().click();
	   Thread.sleep(3000);
	   ie.getRestoreButton().click();	
	   Thread.sleep(3000);
	   ie.getRestorePopup().click();
   }
  }
