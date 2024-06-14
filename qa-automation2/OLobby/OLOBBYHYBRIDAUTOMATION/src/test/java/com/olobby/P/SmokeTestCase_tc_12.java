package com.olobby.P;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.Tasks;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTestCase_tc_12 extends BaseClass{
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test(groups="smokeTest")
	public void TestTrashFeatutreWithoutSelectingAnyRecord() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		HomePage hpage = new HomePage(driver);
		Thread.sleep(8000);
		hpage.getTrash().click();
		Thread.sleep(3000);
		Tasks t = new Tasks(driver);
		t.getClickDeleteDorever().click();
		//driver.findElement(By.xpat
		String text3 = "OLOBBY Dashboard";
		Assert.assertEquals(driver.getTitle(), text3, "Select at least one item to delete, PASS");
		Reporter.log("Select at least one item to delete, PASS", true);
		
	}

}
