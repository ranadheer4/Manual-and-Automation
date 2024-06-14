package com.notes.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class ListofAll_Homepage extends WebDriverUtility{
	@FindBy(xpath = "//tbody[@role='presentation']/../descendant::td[@aria-colindex='1']/../descendant::span[text()='FourthBookshelf']/../descendant::i")private WebElement ThreeDots;
	@FindBy(xpath = "//div[@role='menu']//span[text()='Delete']")private WebElement delete;
//	@FindBy(xpath = "")private WebElement ThreeDots;
//	@FindBy(xpath = "")private WebElement ThreeDots;
//	@FindBy(xpath = "")private WebElement ThreeDots;
	
	public ListofAll_Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getThreeDots() {
		return ThreeDots;
	}

	public WebElement getDelete() {
		return delete;
	}

	
}
