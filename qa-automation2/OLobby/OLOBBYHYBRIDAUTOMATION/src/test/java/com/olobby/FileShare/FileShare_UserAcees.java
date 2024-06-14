package com.olobby.FileShare;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.InlineEdit;
import com.fileShare.ObjectRepo.UserAcees_Homepage;
import com.fileShare.ObjectRepo.file_Share;
import com.folders.ObjRepo.Location;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class FileShare_UserAcees extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void fileShare() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(6000);
	   hp.getFileShare().click();
	   file_Share fs = new file_Share(driver);
	   Thread.sleep(6000);
	   fs.getUserAccess().click();
	   UserAcees_Homepage ua = new UserAcees_Homepage(driver);
//	   ua.getUserList().click();
//	   Thread.sleep(3000);
//	   ua.getCheckBox().click();
//	   ua.getDelete().click();
//	   ua.getdeleteNotify().click();
	   InlineEdit ie = new InlineEdit(driver);
//	   Thread.sleep(5000);
//	   hp.getTrash().click();
//	   ie.getRestoreCheckbox().click();
//	   ie.getRestoreButton().click();	
//	   ie.getRestorePopup().click();
	   //delete users by group and restore from trash
	   Thread.sleep(6000);
	   ua.getUserByGroup().click();
	   Thread.sleep(6000);
	   ua.getAddUser().click();
	   Thread.sleep(6000);
	   ua.getDeleteUser().click();
	   Thread.sleep(6000);
	   ua.getdeleteNotify().click();
	   Thread.sleep(6000);
	   hp.getTrash().click();
	   Thread.sleep(6000);
	   ua.getCheckbox().click();
	   Thread.sleep(6000);
	   ie.getRestoreButton().click();	
	   Thread.sleep(6000);
	   ie.getRestorePopup().click();
	   
   }
   
   }