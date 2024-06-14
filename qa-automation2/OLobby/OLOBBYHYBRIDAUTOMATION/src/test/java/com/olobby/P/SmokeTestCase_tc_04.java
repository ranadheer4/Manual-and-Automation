package com.olobby.P;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;

public class SmokeTestCase_tc_04 extends BaseClass{
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void deleteExcistingProject() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		hpage.getTaskManageMent().click();
		Thread.sleep(2000);
//  	TaskManagement ts = new TaskManagement(driver);
//		ts.getProjectClicik().click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
	    WebElement hidenelement = driver.findElement(By.xpath("//tbody[@role='presentation']/../descendant::td[@aria-colindex='4']/../descendant::span[text()='RanadheerOL']/../../../../td[@aria-colindex='1']//span"));
	    //WebElement hidenelement = driver.findElement(By.xpath("//dx-tree-list[@role='presentation']/descendant::td[@aria-colindex='3']/descendant::span[text()='P0000000011']/../../preceding-sibling::td[@aria-colindex='2']/descendant::span[text()='GoldenFish']/../following-sibling::span"));
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement);
        Thread.sleep(2000);
        hidenelement.click();
        Thread.sleep(4000);
        //ts.getClickDeleteProject().click();
        Thread.sleep(2000);
        //ts.getClickDelete().click();
        Thread.sleep(5000);
        hpage.getTrash().click();
        driver.findElement(By.xpath("//input[@value='2742']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Restore']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Restore']")).click();
        
	}
}
