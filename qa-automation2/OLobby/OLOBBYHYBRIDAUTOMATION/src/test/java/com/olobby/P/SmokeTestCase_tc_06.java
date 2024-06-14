package com.olobby.P;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.EditTaskPage;
import com.TaskManagement.ObjRepo.Projects;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.TaskManagement.ObjRepo.Tasks;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;

public class SmokeTestCase_tc_06 extends BaseClass{
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	@Test(groups="SmokeTest")
	public void m1() throws InterruptedException {
	   HomePage hpage = new HomePage(driver);
	   hpage.getTaskManageMent().click();
	   Projects p = new Projects(driver);
	   TaskManagement ts = new TaskManagement(driver);
	   Tasks t = new Tasks(driver);
	   ts.getTasksClick().click();
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0,4000)");
	   WebElement hidenelement = driver.findElement(By.xpath("//dx-tree-list[@role='presentation']/descendant::td[@aria-colindex='3']/descendant::span[text()='P0000000491']/../../preceding-sibling::td[@aria-colindex='2']/descendant::span[text()='GoldenFish']/../following-sibling::span"));
       Thread.sleep(2000);
       ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement);
       Thread.sleep(2000);
       hidenelement.click();
       //EditTaskPage edt = new EditTaskPage();
       
       
       
       
	   
	  }

}
