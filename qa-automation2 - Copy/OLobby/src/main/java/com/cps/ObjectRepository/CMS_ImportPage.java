//Rana
package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class CMS_ImportPage extends WebDriverUtility {

	
	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
	@FindBy(xpath = "//span[normalize-space()='Provider Passport']")private WebElement providerPassport;
	@FindBy(xpath = "//i[@class='fa-cloud-download-alt fas']/following-sibling::span[text()='CMS Import']")private WebElement cmsImport;
	@FindBy(xpath = "//div[@class='col-10 pr-0']/input[@id='npi']")private WebElement npi;
	@FindBy(xpath = "//div[@class='col-2 pl-0']/button[text()='Search']")private WebElement searchBtn;

	public  CMS_ImportPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void mouseOverCMS(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);
	}
	public void npiSend()
	{
		npi.sendKeys(String.valueOf(100));
	}
	public void getProviderPassport() {
		 providerPassport.click();
	}
	public void getCmsImport() {
		cmsImport.click();;
	}
	public void getSearchBtn() {
		 searchBtn.click();
	}
}
