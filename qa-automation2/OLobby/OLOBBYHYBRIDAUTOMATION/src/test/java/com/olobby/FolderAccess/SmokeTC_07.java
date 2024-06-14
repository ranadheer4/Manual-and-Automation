package com.olobby.FolderAccess;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddTask;
import com.TaskManagement.ObjRepo.NavigTasksFrmFoldAcc;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_07 extends BaseClass {

	static {
	     System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
}

	@Test
	public void LinkedTaskVerify() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		AddTask at = new AddTask(driver);
		NavigTasksFrmFoldAcc nt = new NavigTasksFrmFoldAcc(driver);
		Thread.sleep(7000);
		hp.getFolder().click();
		nt.getLinkedTask().click();
		nt.getAttachmentClick().click();
		nt.doubleClick(driver);
		String text1 = nt.getFileName().getText();
		System.out.println(text1);
        at.RightClick(driver);
        nt.getDeleteFile().click();
        String text = nt.getDeletePopup().getText();
        System.out.println(text);
        nt.clickOnTabButton(driver);
        nt.clickOnEnterButton(driver);
        nt.RightClickOnDeleteFile(driver);	
        nt.getDeleteFile().click();
        nt.clickOnTabButton(driver);
        String text2 = nt.getNoBtn().getText();
        System.out.println(text2);
        nt.clickOnEnterButton(driver);
    
       	
	}
}
