package com.olobby.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.ChangeLocation;
import com.TaskManagement.ObjRepo.Edit_AddTask;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTC_11 extends BaseClass {

	

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void ChangeLocSubTask() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		Edit_AddTask et = new Edit_AddTask(driver);
	    ChangeLocation cl=new ChangeLocation(driver);
		Thread.sleep(3000);
        hp.getTaskManageMent().click();
        tm.getTasksClick().click();
        Thread.sleep(7000);
        WebElement hideElement = driver.findElement(By.xpath("//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000001745 ']/../../td[@aria-colindex='4']/descendant::span[text()='India Task1']/../following-sibling::span"));
        Thread.sleep(5000);
 	   ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hideElement);
 	   hideElement.click();
 	   et.getLocation().sendKeys(eLib.readDataFromExcel("ChangeLocation", 1, 0));
 	   et.clickOnEnterButton(driver);
 	   Thread.sleep(3000);
       et.getSave().click();
       String text = cl.getMindSpace11().getText(); 
       System.out.println(text);
       String text1 = cl.getMindSpacetask2().getText(); 
       System.out.println(text1);
       
       
	}
}
