package com.notes.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class MyBookshelf extends WebDriverUtility{
	
	@FindBy(xpath = "//img[@src='assets/images/add_icon.svg']")private WebElement createNewBookshelf;
	@FindBy(xpath = "//img[@src='assets/images/refresh_blueColor.svg']")private WebElement Refresh;
	@FindBy(xpath = "//input[@placeholder='Bookshelf 1']")private WebElement name;
	@FindBy(xpath = "//select[@formcontrolname='blocation']")private WebElement Location;
	@FindBy(xpath = "//input[@placeholder='NB-seardh']")private WebElement searchWith;
	@FindBy(xpath = "//button[text()='Create']")private WebElement Create;
	@FindBy(xpath = "//button[text()='Cancel']")private WebElement cancel;
	@FindBy(xpath = "//tbody[@role='presentation']/../descendant::td[@aria-colindex='1']/../descendant::span[text()='FirstBook']/../descendant::i")private WebElement ThreeDots;
	@FindBy(xpath = "//div[@role='menu']//span[text()='Delete']")private WebElement delete;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='FirstBook']")private WebElement checkbox;
	
	
	public MyBookshelf(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getCreateNewBookshelf() {
		return createNewBookshelf;
	}

	public WebElement getRefresh() {
		return Refresh;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getSearchWith() {
		return searchWith;
	}

	public WebElement getCreate() {
		return Create;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getThreeDots() {
		return ThreeDots;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}
	
}
