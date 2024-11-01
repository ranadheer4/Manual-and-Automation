package com.settings.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class LocationPage extends WebDriverUtility {
	
	@FindBy(xpath = "//div[@class='card-body']//input[@placeholder='Search Location']")private WebElement searchLocation;
	@FindBy(xpath = "//div[@class='card-body']//a[normalize-space()='Add Location']")private WebElement addLocation;
	@FindBy(xpath = "//div[@class='card-body']//input[@placeholder='Search Group']")private WebElement searchGroup;
	@FindBy(xpath = "//div[@class='card-body']//div[text()=' RanaOl']//descendant::a//img")private WebElement threeLocationName;
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right menuStyle mt-1 show']//ul[@class='dropdown-item list-unstyled']//li//a[@href='javascript:;'][normalize-space()='Edit']")private WebElement locationEdit;
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right menuStyle mt-1 show']//ul[@class='dropdown-item list-unstyled']//li//a[@href='javascript:;'][normalize-space()='Delete']")private WebElement locationDelete;
	@FindBy(xpath = "//div[@class='modal-body']//input[@placeholder='Name']")private WebElement editLocationSearch;
	@FindBy(xpath = "//div[@class='modal-body']//button[text()=' Close']")private WebElement editLocationClose;
	@FindBy(xpath = "//div[@class='modal-body']//button[text()=' Save']")private WebElement editLocationSave;
	@FindBy(xpath = "//div[@class='btn-group']//button[text()='Delete']")private WebElement deleteLocationDelet;
	@FindBy(xpath = "//div[@class='btn-group']//button[text()='Cancel']")private WebElement deleteLocationCancel;
	@FindBy(xpath = "//div[@class='card-body']//div[text()=' Hitec-1']//descendant::a//img")private WebElement threeGroupName;
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right menuStyle mt-1 show']//ul[@class='dropdown-item list-unstyled']//li//a[@href='javascript:;'][normalize-space()='Edit']")private WebElement groupEdit;
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right menuStyle mt-1 show']//ul[@class='dropdown-item list-unstyled']//li//a[@href='javascript:;'][normalize-space()='Delete']")private WebElement groupDelete;	
	@FindBy(xpath = "//form[@class='form ng-untouched ng-pristine ng-valid']//input[@id='groupname']")private WebElement editGroupSearch;
	@FindBy(xpath = "//form[@class='form ng-untouched ng-pristine ng-valid']//select[@id='locationvalue']")private WebElement editGroupLocationDD;
	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='Cancel']")private WebElement editGroupCancel;
	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='Save']")private WebElement editGroupSave;
	@FindBy(xpath = "//div[@class='btn-group']//button[text()='Delete']")private WebElement deleteGroupDelete;
	@FindBy(xpath = "//div[@class='btn-group']//button[text()='Cancel']")private WebElement deleteGroupCancel;
	@FindBy(xpath = "//a[normalize-space()='Add New Group'][1]")private WebElement addNewGroup;
	@FindBy(xpath = "//div[@class='modal-content']//input[@id='groupname']")private WebElement addGroupSearch;
	@FindBy(xpath = "//div[@class='modal-content']//select[@id='locationvalue']")private WebElement addNewGroupLocationDD;
	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='Cancel']")private WebElement addNewGroupCancel;
	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='Save']")private WebElement addNewGroupSave;
	
	public LocationPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	public WebElement getSearchLocation() {
		return searchLocation;
	}
	public WebElement getAddLocation() {
		return addLocation;
	}
	public WebElement getSearchGroup() {
		return searchGroup;
	}
	public WebElement getThreeLocationName() {
		return threeLocationName;
	}
	public WebElement getLocationEdit() {
		return locationEdit;
	}
	public WebElement getLocationDelete() {
		return locationDelete;
	}
	public WebElement getEditLocationSearch() {
		return editLocationSearch;
	}
	public WebElement getEditLocationClose() {
		return editLocationClose;
	}
	public WebElement getEditLocationSave() {
		return editLocationSave;
	}
	public WebElement getDeleteLocationDelet() {
		return deleteLocationDelet;
	}
	public WebElement getDeleteLocationCancel() {
		return deleteLocationCancel;
	}
	public WebElement getThreeGroupName() {
		return threeGroupName;
	}
	public WebElement getGroupEdit() {
		return groupEdit;
	}
	public WebElement getGroupDelete() {
		return groupDelete;
	}
	public WebElement getEditGroupSearch() {
		return editGroupSearch;
	}
	public WebElement getEditGroupLocationDD() {
		return editGroupLocationDD;
	}
	public WebElement getEditGroupCancel() {
		return editGroupCancel;
	}
	public WebElement getEditGroupSave() {
		return editGroupSave;
	}
	public WebElement getAddNewGroup() {
		return addNewGroup;
	}
	public WebElement getAddGroupSearch() {
		return addGroupSearch;
	}
	public WebElement getAddNewGroupLocationDD() {
		return addNewGroupLocationDD;
	}
	public WebElement getAddNewGroupCancel() {
		return addNewGroupCancel;
	}
	public WebElement getAddNewGroupSave() {
		return addNewGroupSave;
	}
	public WebElement getDeleteGroupDelete() {
		return deleteGroupDelete;
	}
	public void alertAccept() {
		switchToAlertPopUpAndAccept(null, null);
	}
	public WebElement getDeleteGroupCancel() {
		return deleteGroupCancel;
	}
}
