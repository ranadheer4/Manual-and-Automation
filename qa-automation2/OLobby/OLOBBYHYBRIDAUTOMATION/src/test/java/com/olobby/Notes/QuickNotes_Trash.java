package com.olobby.Notes;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.InlineEdit;
import com.folders.ObjRepo.Location;
import com.notes.ObjectRepo.ListofAll_Homepage;
import com.notes.ObjectRepo.MyBookshelf;
import com.notes.ObjectRepo.NotesHomepage;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class QuickNotes_Trash extends BaseClass{
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void quickNotesdelete() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(6000);
	   hp.getNotes().click();
	   NotesHomepage nhp = new NotesHomepage(driver);
	   Thread.sleep(6000);
	   nhp.getMyBookshelf().click();
	   Thread.sleep(6000);
	   MyBookshelf mb = new MyBookshelf(driver);
	   
	   mb.getThreeDots().click();
	   Thread.sleep(6000);
	   mb.getDelete().click();
	   Location l = new Location(driver);
	   Thread.sleep(6000);
	   l.getFolderDeleteYes().click();
	   Thread.sleep(6000);
//	   nhp.getListOfAll().click();
//	   ListofAll_Homepage lah = new ListofAll_Homepage(driver);
//	   Thread.sleep(3000);
//	   lah.getThreeDots().click();
//	   lah.getDelete().click();
//	   Thread.sleep(3000);
//	   l.getFolderDeleteYes().click();
	   InlineEdit ie = new InlineEdit(driver);
	   Thread.sleep(6000);
	   hp.getTrash().click();
	   Thread.sleep(6000);
	   mb.getCheckbox().click();
//	   ie.getRestoreCheckbox2().click();
	   Thread.sleep(6000);
	   ie.getRestoreButton().click();
	   Thread.sleep(6000);
	   ie.getRestorePopup().click();
   }	
}
