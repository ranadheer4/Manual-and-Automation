package com.olobby.P;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.AddTask;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class SmokeTestCase_tc_11 extends BaseClass{
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void TestTrashFeatureForTasksAndSubTasks() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		hpage.getTaskManageMent().click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
	    WebElement hidenelement = driver.findElement(By.xpath("//tbody[@role='presentation']/../descendant::td[@aria-colindex='4']/../descendant::span[text()='RanadheerOL']/../../../../td[@aria-colindex='1']//span"));
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement);
        Thread.sleep(2000);
        hidenelement.click();
        Thread.sleep(3000);
        WebElement forcefully=driver.findElement(By.xpath("//app-task-list[@id='taskdata']//div[@class='card_links pull-right']//a[@class='actionbtn']//*[name()='svg']//*[name()='path' and contains(@d,'M5.2998 14')]"));
        forcefully.click();   
        Thread.sleep(2000);
        AddTask at = new AddTask(driver);
        at.getClickTaskDeleteCorner().click();
        //driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
        Thread.sleep(2000);
        at.getClickDelete().click();
        //driver.findElement(By.xpath("//img[@src='assets/sidebaricons/trash.png']")).click();
        Thread.sleep(3000);
        //at.getClickRestore().click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-location-row='India' and @data-name-row='RanadheerOL']")).click();
        //Thread.sleep(2000);
        at.getClickRestoreButton().click();
        //driver.findElement(By.xpath("//button[normalize-space()='Restore']")).click();
        
       
        }

}
