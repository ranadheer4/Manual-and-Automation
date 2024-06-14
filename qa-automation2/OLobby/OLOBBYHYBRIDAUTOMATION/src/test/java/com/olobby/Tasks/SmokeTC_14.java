package com.olobby.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.Search;
import com.TaskManagement.ObjRepo.SnapshotProjects;
import com.TaskManagement.ObjRepo.Sorting;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_14 extends BaseClass {


		static {
			System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
		}
		
		@Test
		public void SortingProjects() throws InterruptedException
		{
			HomePage hp = new HomePage(driver);
			TaskManagement tm = new TaskManagement(driver);
		//	Search sp = new Search(driver);
			SnapshotProjects sp = new SnapshotProjects(driver);
			Sorting sort = new Sorting(driver);
            hp.getTaskManageMent().click();
            tm.getSnapshotClick().click();
            Thread.sleep(5000);  
         //  tm.scrollBarAction(driver);
        //   tm.scrollBarAction(driver);
            sort.getProName().click();
            Thread.sleep(5000);
            sort.getProName().click();
            sp.getTaskProj().click();
            sp.getOverdueProj().click();
            sp.getTeammatesProj().click();
            sp.getCreatorProj().click();
            sp.getCreatedDateProj().click();
            sp.getLastModifiedProj().click();
            sp.getLastModifiedProj().click();
            
            
            
            
            
}
}