package com.olobby.P;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.EditTaskPage;
import com.olobby.genericUtility.IConstants;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;

public class SmokeTestCase_tc_09 extends BaseClass{
	
	static{
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void VerifyTheWatcherAreAbleToViewTheTask() throws InterruptedException {
		HomePage hpage = new HomePage(driver);
		hpage.getTaskManageMent().click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		WebElement hidenelement = driver.findElement(By.xpath("((//div[@role='presentation'])[34]/descendant::tr/descendant::span[text()='Open'])[1]"));
	    Thread.sleep(2000);
	    ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement);
	    Thread.sleep(2000);
	    hidenelement.click();
	    EditTaskPage etp  = new EditTaskPage(driver);
	    etp.getClickCancelButton().click();
	    Thread.sleep(4000);
	    JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		WebElement hidenelement1 = driver.findElement(By.xpath("((//div[@role='presentation'])[34]/descendant::tr/descendant::span[text()='Open'])[1]"));
	    Thread.sleep(2000);
	    ((JavascriptExecutor)driver).executeScript("document.scrollIntoView",hidenelement1);
	    Thread.sleep(2000);
	    hidenelement1.click();
	    Thread.sleep(4000);
	    etp.getEnterTaskName().sendKeys("nitin");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@data-dismiss='modal']//img")).click();
	 }
}
