package com.notes.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.olobby.genericUtility.WebDriverUtility;

public class CreateNewBookself extends WebDriverUtility{
	
	@FindBy(xpath = "//input[@formcontrolname='bname']")private WebElement name;
	@FindBy(xpath = "//select[@formcontrolname='blocation']")private WebElement location;
	@FindBy(xpath = "//input[@placeholder='NB-seardh']")private WebElement searchUser;
	@FindBy(xpath = "//button[text()='Create']")private WebElement create;
	@FindBy(xpath = "//button[text()='Cancel']")private WebElement cancel;
	
	
	

}