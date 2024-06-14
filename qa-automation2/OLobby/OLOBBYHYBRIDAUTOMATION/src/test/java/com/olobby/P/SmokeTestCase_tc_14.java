package com.olobby.P;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;

public class SmokeTestCase_tc_14 extends BaseClass {  
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test(groups="smokeTest")
	public void TestTrashFeatureForQuickNotes() throws InterruptedException {
		
		
		HomePage hpage = new HomePage(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='assets/sidebaricons/quicknotes.png']")).click();
		Thread.sleep(3000);
		hpage.getNotes().click();
		driver.findElement(By.xpath("//span[normalize-space()='My Bookshelf']")).click();
		//driver.findElement(By.xpath(""))
		
		
	}

}
