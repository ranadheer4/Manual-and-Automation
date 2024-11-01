package com.olobby.FileShare;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.InlineEdit;
import com.fileShare.ObjectRepo.Projects;
import com.fileShare.ObjectRepo.UserAcees_Homepage;
import com.fileShare.ObjectRepo.file_Share;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class FileShare_Projects extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void projects() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getFileShare().click();
	   file_Share fs = new file_Share(driver);
	   Thread.sleep(8000);
	   fs.getProjects().click();
	   Thread.sleep(5000);
	   Projects p = new Projects(driver);
	   p.getProjectList().click();
	   Thread.sleep(6000);
	   p.getEditProject().click();
	   Thread.sleep(8000);
	   p.getDeleteProject().click();
	   Thread.sleep(6000);
	   UserAcees_Homepage ua = new UserAcees_Homepage(driver);
	   
	   ua.getdeleteNotify().click();
	   Thread.sleep(5000);
	   hp.getTrash().click();
	   InlineEdit ie = new InlineEdit(driver);
	   Thread.sleep(6000);
	   p.getCheckbox().click();
	   Thread.sleep(6000);
	   ie.getRestoreButton().click();		
	   Thread.sleep(6000);
	   ie.getRestorePopup().click();
	   //delete area and restore 
	   
   }
}