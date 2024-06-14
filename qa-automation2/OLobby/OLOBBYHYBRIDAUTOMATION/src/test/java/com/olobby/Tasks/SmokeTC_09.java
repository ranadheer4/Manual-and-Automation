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

public class SmokeTC_09 extends BaseClass {

	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test
	public void ChangeLocWithoutProj() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		TaskManagement tm = new TaskManagement(driver);
		Edit_AddTask et = new Edit_AddTask(driver);
	    ChangeLocation cl=new ChangeLocation(driver);
		Thread.sleep(3000);
        hp.getTaskManageMent().click();
        tm.getTasksClick().click();
        Thread.sleep(7000);
        WebElement hideElement = driver.findElement(By.xpath("//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000000038 ']/../../td[@aria-colindex='4']/descendant::span[text()='ChangeLocation']/../following-sibling::span"));
        Thread.sleep(5000);
 	   ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hideElement);
 	   hideElement.click();
 	   et.getLocation().sendKeys(eLib.readDataFromExcel("ChangeLocation", 1, 0));
 	   et.clickOnEnterButton(driver);
 	   Thread.sleep(3000);
       et.getSave().click();
       Thread.sleep(3000);
       String text = cl.getMindSpace1().getText(); 
       System.out.println(text);
       Thread.sleep(5000);
       WebElement hideElement1 = driver.findElement(By.xpath("//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000000038 ']/../../td[@aria-colindex='4']/descendant::span[text()='ChangeLocation']/../following-sibling::span"));
       Thread.sleep(5000);
	   ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hideElement1);
	   hideElement1.click();
	   et.getLocation().sendKeys(eLib.readDataFromExcel("ChangeLocation", 2, 0));
	   et.clickOnEnterButton(driver);
	   Thread.sleep(3000);
      et.getSave().click();
      Thread.sleep(3000);
      String text1 = cl.getIndia9().getText(); 
      System.out.println(text1);
      
       
	}
}
