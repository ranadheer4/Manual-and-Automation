package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.WebDriverUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public class CmdLoginPage extends WebDriverUtility {
	
	    //declaration
		@FindBy(xpath="//input[@formcontrolname='email']")
		
		private WebElement emailtxtbox;

		@FindBy(xpath = "//input[@placeholder='Password']")
		private WebElement passwordtxtEdt;
		//input[@placeholder='Password']

		@FindBy(xpath = "//button[@type='submit']")
		private WebElement Btn;
		//button[@type='submit']

		public CmdLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		

		/**
		 * @return the emailtxtbox
		 */
		public WebElement getEmailtxtbox() {
			return emailtxtbox;
		}


		/**
		 * @return the passwordtxtEdt
		 */
		public WebElement getPasswordtxtEdt() {
			return passwordtxtEdt;
		}


		/**
		 * @return the btn
		 */
		public WebElement getBtn() {
			return Btn;
		}
		public void enterUsername(String userName)
		{
			emailtxtbox.sendKeys(userName);
		}
		
		public void enterPassword(String passWord)
		{
			passwordtxtEdt.sendKeys(passWord);
		}
		
			
		public void clickLoginBtn()
		{
			Btn.click();
		}

		public void loginToApplication(String username,String password)
		{
			emailtxtbox.sendKeys(username);
			passwordtxtEdt.sendKeys(password);
			clickLoginBtn();
		}
         
	
	}
