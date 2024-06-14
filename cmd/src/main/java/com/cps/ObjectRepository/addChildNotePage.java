package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addChildNotePage {
	
	@FindBy(xpath="//span[normalize-space()='chandra920']")private WebElement click;
	
	@FindBy(xpath="//button[normalize-space()='Add Note']")private WebElement clickAddNote;
	
	@FindBy(xpath="//textarea[@id='description']")private WebElement enterDescription;
	
	@FindBy(xpath="//button[normalize-space()='Create']")private WebElement clickCreateButton;
	
	@FindBy(xpath="//h4[text()='Workflow Details']/../button[@type='button']/span")private WebElement clickCrossbotton;
	
	 public addChildNotePage(WebDriver driver) {
	      PageFactory.initElements(driver, this);
	   }

	public WebElement getClick() {
		return click;
	}

	public WebElement getClickAddNote() {
		return clickAddNote;
	}

	public WebElement getEnterDescription() {
		return enterDescription;
	}

	public WebElement getClickCreateButton() {
		return clickCreateButton;
	}

	public WebElement getClickCrossbotton() {
		return clickCrossbotton;
	}
	
	 
	 

}
