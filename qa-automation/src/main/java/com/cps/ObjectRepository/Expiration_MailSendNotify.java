package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class Expiration_MailSendNotify extends WebDriverUtility{
	 @FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement Leftsidebar;
	 @FindBy(xpath = "//body/ctg-root/app-main-layout[@class='ng-star-inserted']/section[@id='wrapper']/app-side-nav/div[@class='sidebar navbar-nav toggled']/div[@id='main-wrapper']/aside[@class='left-sidebar']/div[@class='scroll-sidebar']/nav[@class='sidebar-nav']/ul[@id='sidebarnav']/li[4]")private WebElement Expirations;
	 @FindBy(xpath = "//div[@class='topBox']")private WebElement PageClick;
	 @FindBy(xpath = "//datatable-body[@role='rowgroup']/descendant::datatable-scroller[@class='datatable-scroll ng-star-inserted']/descendant::span[text()=' 07/31/2023 ']/../../../descendant::span[text()=' 07/31/2023 ']/../../../descendant::datatable-body-cell/div/span/i[@class='far fa-envelope fa-2x']")private WebElement SendMail;
	 @FindBy(xpath = "//div[normalize-space()='Yes']")private WebElement OptionYesNo;
	 @FindBy(xpath = "//input[@id='exampleCheck1' and @formcontrolname='email']")private WebElement Uncheck;
	 @FindBy(xpath = "//input[@id='subEmail']")private WebElement Mail;
	 @FindBy(xpath = "//button[normalize-space()='Send']")private WebElement Send;
	 
	 public Expiration_MailSendNotify(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	 public void mouseMover(WebDriver driver) {
	      mouseOverAnElement(driver, Leftsidebar);
	      Expirations.click();
	   }
	 public void clickExpirations() {
		 Expirations.click();
	 }
	 public void clickPage() {
		 PageClick.click();
	 }
	 public void clickSendmail() {
		 SendMail.click();
	 }
	 public void clickOption() {
		 OptionYesNo.click();
	 }
	 public void clickUncheck() {
		 Uncheck.click();
	 }
	 public void clickSend() {
		 Send.click();
	 }
	public WebElement getMail() {
		return Mail;
	}
}
