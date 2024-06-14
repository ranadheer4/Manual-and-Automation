package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class Edit_TIN extends WebDriverUtility {

	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
	@FindBy(xpath = "//span[normalize-space()='Manage TIN/Locations']")private WebElement ManageTinLocation;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[text()='Select Category']/following-sibling::div[@class='ng-value ng-star-inserted']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement categoryTin;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::ng-autocomplete[@formcontrolname='tin_search_name']/descendant::input[@type='text']")private WebElement tinGrpName;
	@FindBy(xpath = "//button[normalize-space()='SEARCH']")private WebElement searchBtn;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[text()='Book']/following-sibling::div[@class='d-flex flex-row ng-star-inserted']/descendant::div[text()=' Edit ']")private WebElement edit;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::label[text()='TIN']/following-sibling::div/div/input[@id='1']")private WebElement tinNameR;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::label[text()='TIN Group Name']/following-sibling::div/div/input[@id='2']")private WebElement tinGrpNameR;
	@FindBy(xpath = "//button[normalize-space()='SAVE']")private WebElement saveBtn;
	
	
	public Edit_TIN(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void mouseHover(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);
		ManageTinLocation.click();
	}
	public void clickManageTinLocation() {
		ManageTinLocation.click();
		
	}
	public WebElement getCategoryTin() {
		return categoryTin;
	}
	public WebElement getTinGrpName() {
		return tinGrpName;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getEdit() {
		return edit;
	}
	public WebElement getTinNameR() {
		return tinNameR;
	}
	public WebElement getTinGrpNameR() {
		return tinGrpNameR;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void setTinGrpName(WebElement tinGrpName) {
		this.tinGrpName = tinGrpName;
	}
	
	

	
	
	
	
	
	
}
