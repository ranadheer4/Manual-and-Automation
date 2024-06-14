package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnBoardingPage {
	@FindBy(xpath="//span[text()='Settings']/../i")private WebElement ClickSetting;
	
	@FindBy(xpath="//span[text()='Onboarding Forms']/../i")private WebElement ClickOnBoarding;
	
	@FindBy(xpath="//h5[text()='Comprehensive Surgical Care, Application for Privileges']/../following-sibling::a[text()='Send Form']")private WebElement ClickProvideCredential;
	
	@FindBy(xpath="//form[@class='ng-untouched ng-pristine ng-valid']/descendant::input[@placeholder='Enter Email']")private WebElement EnterMail;
	
	@FindBy(xpath="//div[text()='Send']")private WebElement ClickSendButton;
	
	public OnBoardingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickSetting() {
		return ClickSetting;
	}

	public WebElement getClickOnBoarding() {
		return ClickOnBoarding;
	}

	public WebElement getClickProvideCredential() {
		return ClickProvideCredential;
	}

	public WebElement getEnterMail() {
		return EnterMail;
	}

	public WebElement getClickSendButton() {
		return ClickSendButton;
	}
	
	
}
