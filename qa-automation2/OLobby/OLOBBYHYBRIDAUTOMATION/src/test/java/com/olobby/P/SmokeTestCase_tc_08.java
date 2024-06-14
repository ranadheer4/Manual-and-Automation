package com.olobby.P;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.TaskManagement.ObjRepo.AddTask;
import com.TaskManagement.ObjRepo.SnapshotTasks;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
public class SmokeTestCase_tc_08 extends BaseClass{
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void VerifyTheTeamMembersAddedAsWatcherGetWatcherIconInTaskSnapshot() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		hpage.getTaskManageMent().click();
		Thread.sleep(2000);
		TaskManagement ts = new TaskManagement(driver);
		ts.getSnapshotClick().click();
		Thread.sleep(2000);
	    SnapshotTasks st = new SnapshotTasks(driver);
	    Thread.sleep(2000);
	    st.getAddTask().click();
	    Thread.sleep(2000);
	    AddTask at = new AddTask(driver);
	    at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 1, 0));
	    Thread.sleep(2000);
	    at.getIndiaLocFoldAcces();
	    at.getClickWatcher().sendKeys(eLib.readDataFromExcel("AddTask", 4, 0));
	    Thread.sleep(6000);
	   // AddTask at = new AddTask(driver);
	    driver.findElement(By.xpath("//input[@id='item-2']")).click();
	    wLib.clickOnEnterButton(driver);
	    Thread.sleep(2000);
	   // at.getSaveBtn().click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//figure[@class='rounded-circle ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//a[@class='dropdown-item btn']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vikram.danvale@nstarxinc.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Reset@123");
	    driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='hdrname']/../descendant::span[@class='clos']")).click();
	    Thread.sleep(2000);
	    hpage.getTaskManageMent().click();
	    Thread.sleep(2000);
		ts.getSnapshotClick().click();
		Thread.sleep(2000);
		
		
	    
	 }

}
