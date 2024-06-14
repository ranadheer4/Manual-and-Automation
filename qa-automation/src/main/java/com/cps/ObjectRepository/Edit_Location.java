package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class Edit_Location extends WebDriverUtility {
	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
	@FindBy(xpath = "//span[normalize-space()='Manage TIN/Locations']")private WebElement ManageTinLocation;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[text()='Select Category']/following-sibling::div[@class='ng-value ng-star-inserted']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement categoryTin;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::ng-autocomplete[@ng-reflect-placeholder='Location Name']/descendant::input[@type='text']")private WebElement locationName;
	@FindBy(xpath = "//button[normalize-space()='SEARCH']")private WebElement searchBtn;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[text()='Danvale3']")private WebElement expandLoc;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::span[@title='Edit VVV']")private WebElement editLoc;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::ng-select[@ng-reflect-name='tin_id']/descendant::input[@type='text']")private WebElement tinDropD;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::input[@id='3']")private WebElement practiceName;
	@FindBy(xpath = "//form-builder[@ng-reflect-values='[object Object]']//button[@class='btn customOrange ng-star-inserted'][normalize-space()='SAVE']")private WebElement saveBtn;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::span[@title='Clear all']")private WebElement clear;

	
	public Edit_Location(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void mouseHover(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);
		ManageTinLocation.click();
	}
	public WebElement getClear() {
		return clear;
	}
	public WebElement getCategoryTin() {
		return categoryTin;
	}
	public WebElement getTinGrpName() {
		return locationName;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getExpandLoc() {
		return expandLoc;
	}
	public WebElement getEditLoc() {
		return editLoc;
	}
	public WebElement getTinDropD() {
		return tinDropD;
	}
	public WebElement getPracticeName() {
		return practiceName;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getManageTinLocation() {
		return ManageTinLocation;
	}
}
