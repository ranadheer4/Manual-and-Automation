package com.notes.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.olobby.genericUtility.WebDriverUtility;

public class SharedWithMe extends WebDriverUtility {

	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='NoteBook']/..")private WebElement noteBook;
	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Page']/..")private WebElement page;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;	
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
//	@FindBy(xpath = "//div[@id='sharedWithMeTab']//descendant::a[text()='Tab']/..")private WebElement tab;
	
}
