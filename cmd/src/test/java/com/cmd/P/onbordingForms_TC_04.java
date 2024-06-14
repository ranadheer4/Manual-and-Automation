package com.cmd.P;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.OnBoardingPage;
import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.ExcelUtility;
import com.cps.genericUtility.FileUtility;
import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.JavaUtility;
import com.cps.genericUtility.WebDriverUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public class onbordingForms_TC_04 extends BaseClass{
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	@Test(groups="smokeTest")
	public void GenerateOnBoardingForm() throws InterruptedException {
		WebDriverUtility wLib= new WebDriverUtility();
		JavaUtility jLib=new JavaUtility();
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		OnBoardingPage OBP=new OnBoardingPage(driver);
		OBP.getClickSetting().click();
		Thread.sleep(1000);
		OBP.getClickOnBoarding().click();
		Thread.sleep(1000);
		OBP.getClickProvideCredential().click();
		Thread.sleep(1000);
		OBP.getEnterMail().sendKeys(eLib.readDataFromExcel("OnBoarding", 0, 1));
		
		OBP.getClickSendButton().click();
		Reporter.log("Successfully sent mail",true);
		Thread.sleep(10000);
		CmdHomePage hpage=new CmdHomePage(driver);
		
		hpage.getSignOut().click();
		hpage.getLogoutLink().click();
		
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox/FMfcgzGrcjNrtTXsvNnxpRWTSQhSPFDq");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dranadheer4@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9963883545Durgi");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		////div[@id=':1n']//*[text()='CredentialMyDoc']
		driver.findElement(By.xpath("//div[@id=':1n']//*[text()='CredentialMyDoc']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='credentialmydoc.com/forms?id=']")).click();
		Thread.sleep(3000);
		//get parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("ranadheer.durgi@nstarxinc.com");
		//get collections of all window id's
		Set<String>allwins = driver.getWindowHandles();
		//Iterate all wins
		for(String each:allwins)
			{
			//switch to CW when PW is not equals to CW
				if(!parent.equals(each))
				{
				//switch to each window
					String childpagetitles = driver.switchTo().window(each).getTitle();
					driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("ranadheer.durgi@nstarxinc.com");
					driver.findElement(By.xpath("//button[@class='btn btn-default btn-primary']")).click();
					System.out.println(childpagetitles);
	}
}
		//switch to CW
		//driver.switchTo().window(each);
}
}