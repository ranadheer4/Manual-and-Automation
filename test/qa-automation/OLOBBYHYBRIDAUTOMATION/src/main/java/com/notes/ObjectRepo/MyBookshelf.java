package com.notes.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.prakash.genericUtility.WebDriverUtility;

public class MyBookshelf extends WebDriverUtility{
	
	@FindBy(xpath = "//img[@src='assets/images/add_icon.svg']")private WebElement createNewBookshelf;
	@FindBy(xpath = "//img[@src='assets/images/refresh_blueColor.svg']")private WebElement Refresh;
	@FindBy(xpath = "//input[@placeholder='Bookshelf 1']")private WebElement name;
	@FindBy(xpath = "//select[@formcontrolname='blocation']")private WebElement Location;
	@FindBy(xpath = "//input[@placeholder='NB-seardh']")private WebElement searchWith;
	@FindBy(xpath = "//button[text()='Create']")private WebElement Create;
	@FindBy(xpath = "//button[text()='Cancel']")private WebElement cancel;

}
