package com.olobby.FolderAccess;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.InlineEdit;
import com.folders.ObjRepo.Location;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;
import com.settings.ObjRepo.LocationPage;

import FolderAccess.Users_To_Group;

public class TrashFeatureFolder extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
      
   )
   public void trashfeature() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(6000);
	   //delete and restore folder
	   hp.getFolder().click();
	   Users_To_Group ug = new Users_To_Group(driver);
	   Thread.sleep(5000);
	   ug.getFoldersPage().click();
	   Thread.sleep(8000);	
	   Location l = new Location(driver);
	   
	   l.getLocationHeader().click();	   
	   Thread.sleep(5000);
	   l.getViewgrp().click();
//	   Thread.sleep(4000);
	   //l.getGroupHeader().click();
//	   l.getFolderView().click();
	   //delete and restore file
//	   Actions ac = new Actions(driver);
//	   Thread.sleep(5000);
//	   ac.contextClick(l.getFileDeleteRightclick()).perform();
//	   l.getDeleteFile().click();
//	   l.getFolderDeleteYes().click();
	   Thread.sleep(6000);
	   //delete main folder as within sub folder 
	   l.getFolderDelete().click();
//	   l.getFolderDeleteYes().click();
	   Thread.sleep(6000);
	   l.getFolderDeleteYes().click();
	   Thread.sleep(6000);
	   l.getFolderDeleteYes().click();
//	   Thread.sleep(3000);
//	   hp.settingLocation(driver);
	   //delete and restore group
//	   LocationPage lp = new LocationPage(driver);
//	   lp.getThreeGroupName().click();
//	   lp.getGroupDelete().click();
//	   lp.getDeleteGroupDelete().click();
//	   driver.switchTo().alert().accept();
	   InlineEdit ie = new InlineEdit(driver);
	   Thread.sleep(5000);
	   hp.getTrash().click();
	   Thread.sleep(6000);
	   l.getCheckbox().click();
	   Thread.sleep(6000);
	   ie.getRestoreButton().click();
	   Thread.sleep(6000);
	   ie.getRestorePopup().click();
	 
   }
}