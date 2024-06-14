package com.olobby.FolderAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.InlineEdit;
import com.fileShare.ObjectRepo.UserAcees_Homepage;
import com.fileShare.ObjectRepo.file_Share;
import com.folders.ObjRepo.Location;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

import FolderAccess.Users_To_Group;

public class FolderAces_1 extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void usersAssignGroup() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   
	   hp.getFolder().click();
	   Thread.sleep(6000);
	   
	   Users_To_Group ug = new Users_To_Group(driver);
//	   Thread.sleep(8000);
	   ug.getFoldersPage().click();
	   Thread.sleep(8000);	
	   //add group and assign to users
//	   ug.getAddGroup().click();
//	   ug.getGrpName().sendKeys(eLib.readDataFromExcel("UsersAssignGrp", 1, 0));
//	   ug.getAddUsers().sendKeys(eLib.readDataFromExcel("UsersAssignGrp", 1, 1));
//	   ug.getSave().click();
	   //add folder and save
	   Actions ac = new Actions(driver);
//	   Thread.sleep(3000);
//	   ac.contextClick(ug.getrightclick()).perform();
//	   Thread.sleep(5000);
//	   ug.getAddFolderName().click();
//	   ug.getFolderName().sendKeys(eLib.readDataFromExcel("UsersAssignGrp", 1, 2));
//	   ug.getSave().click();
//	   Thread.sleep(3000);
	   //add fvorite and verify in dashboard
	   Location l = new Location(driver);
	   
	   l.getLocationHeader().click();
	   
	   Thread.sleep(5000);
	   l.getViewgrp().click();
//	   l.getFolderView().click();
	   Thread.sleep(8000);
	   ug.getAddFvrt().click();
	   Thread.sleep(5000);	
	   hp.getDashboard().click();
	   Thread.sleep(3000);
	   String ActualText = driver.findElement(By.xpath("//table[@role='presentation']/../descendant::td[@aria-colindex='1']//span[text()=' f1']")).getText();
	   String ExpectedText = "f1";
	   if (ActualText.equalsIgnoreCase(ExpectedText))
		{
			System.out.println("Text name is matching::"+ExpectedText+ " "+ActualText);
		}
		else
		{
			System.out.println("Text name is not matching::"+ExpectedText+ " "+ActualText);
		}
//	   Assert.assertEquals(ExpectedTitle, ActualTitle);
	   Thread.sleep(6000);
	   hp.getFolder().click();
//	   Thread.sleep(6000);
//	   ug.getAddFvrt().click();
	   Thread.sleep(6000);
	   l.getGroupHeader().click();
	   Thread.sleep(6000);
	   ac.contextClick(ug.getRightclicksubaddFolder()).perform();
	   //add sub folder
	   Thread.sleep(6000);
	   ug.getAddfoldervik().click();
	   Thread.sleep(6000);
	   ug.getFolderName().sendKeys(eLib.readDataFromExcel("UsersAssignGrp", 1, 0)+jLib.getRandomNumber());
	   Thread.sleep(6000);
	   ug.getSave().click();
	   Thread.sleep(3000);
   }
   }