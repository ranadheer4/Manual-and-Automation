package com.cmd.P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.cps.genericUtility.IConstants;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public class calende {
	
        static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
		}
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.className("form-control")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement mon =
		driver.findElement(By.className("ui-datepicker-month"));
		Select s = new Select(mon);
		s.selectByValue("11");
		WebElement year =
		driver.findElement(By.className("ui-datepicker-year"));
		Select s1 = new Select(year);
		s1.selectByValue("1997");
		driver.findElement(By.xpath("//a[.='14']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9854798547");
		driver.findElement(By.id("renew_policy_submit")).submit();
		}
		


}
