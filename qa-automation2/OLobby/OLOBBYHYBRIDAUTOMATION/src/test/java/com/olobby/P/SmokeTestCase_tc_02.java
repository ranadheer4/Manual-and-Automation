package com.olobby.P;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddTask;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;


public class SmokeTestCase_tc_02 extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void verifyWatchersFunctionality() throws InterruptedException {
		//click task module
		HomePage hpage = new HomePage(driver);
		Thread.sleep(3000);
		hpage.getTaskManageMent().click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
	    WebElement hidenelement = driver.findElement(By.xpath("//dx-tree-list[@role='presentation']/descendant::td[@aria-colindex='3']/descendant::span[text()='P0000000008']/../../preceding-sibling::td[@aria-colindex='2']/descendant::span[text()='GoldenFish']/../following-sibling::span"));
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement);
        Thread.sleep(2000);
        hidenelement.click();
        AddTask at = new AddTask(driver);
        at.getClickBelowAddTask().click();
        Thread.sleep(2000);
        //enter task name
        at.getTaskName().sendKeys(eLib.readDataFromExcel("AddTask", 2, 0));
        Thread.sleep(2000);
        at.getClickWatcher().sendKeys(eLib.readDataFromExcel("AddTask", 3, 0));
        wLib.clickOnEnterButton(driver);
        at.getClickSave().click();
        String text = "Optbyte Software Solutions PVT. LTD.";
		Assert.assertEquals(driver.getTitle(), text, "Task is not created, PASS");
		Reporter.log("Task is not created, PASS", true);
		Thread.sleep(2000);
		//2nd test case
		at.getClick1().sendKeys(eLib.readDataFromExcel("AddTask", 3, 0));
		Thread.sleep(2000);
		wLib.clickOnEnterButton(driver);
		Thread.sleep(2000);
		at.getClickSave().click();
		String text1 = "Optbyte Software Solutions PVT. LTD.";
		Assert.assertEquals(driver.getTitle(), text1, "Team Members can not assigned as a watcher, PASS");
		Reporter.log("Team Members can not assigned as a watcher, PASS", true);
		Thread.sleep(2000);
		at.getClickWatcher().click();
		driver.findElement(By.xpath("//input[@id='item-1']")).click();
		at.getClickSave().click();
		String text2 = "Optbyte Software Solutions PVT. LTD.";
		Assert.assertEquals(driver.getTitle(), text2, "Team Members can not assigned as a watcher, PASS");
		Reporter.log("Team Members can not assigned as a watcher, PASS", true);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[@class='modal-content cursor-draggable']/descendant::ng-select[@bindlabel='Value' and @formcontrolname='assignto']/descendant::div[@role='combobox']/input[@type='text'])[2]")).click();
		at.getClick1().click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='item-2']")).click();
		at.getClickCheckBox().click();
		at.getClickSave().click();
		String text3 = "Optbyte Software Solutions PVT. LTD.";
		Assert.assertEquals(driver.getTitle(), text3, "Task is added, PASS");
		Reporter.log("Task is added, PASS", true);
		driver.findElement(By.xpath("//figure[@class='rounded-circle ng-star-inserted']//span[contains(text(),'P')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[normalize-space()='Logout']")).click();
	
	}

}

