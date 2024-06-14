package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class LocationTrash extends WebDriverUtility {

	@FindBy(xpath="//div[text()=' LocationTrash']/descendant::a[@class='dropdown-toggle ml-1']")private WebElement threeDotLoc;
	@FindBy(xpath = "//div[text()=' LocationTrash']/descendant::ul[@class='dropdown-item list-unstyled']/descendant::a[text()='Delete']")private WebElement deleteLocBtn;
	@FindBy(xpath = "//button[text()='Delete']")private WebElement deletePopupBtn;
	@FindBy(xpath = "//td[@class='hiddenbefore'][text()=' LocationTrash ']")private WebElement trashGetTextLoc;
	@FindBy(xpath = "//tbody[2]/tr[1]/td[1]/div[1]/input[1]")private WebElement trashLocSel;
	@FindBy(xpath = "//a[normalize-space()='Restore']")private WebElement restoreBtn;
	@FindBy(xpath = "//button[text()='Restore']")private WebElement restorePopUp;
	@FindBy(xpath = "//div[text()=' LocationTrash']")private WebElement locNameGetText;
	@FindBy(xpath = "//div[text()=' Mahabaleshwar']/descendant::a[@class='dropdown-toggle ml-1']")private WebElement threeDotMahab;
	@FindBy(xpath = "//div[text()=' Mahabaleshwar']/descendant::ul[@class='dropdown-item list-unstyled']/descendant::a[text()='Delete']")private WebElement deleteloc;
	@FindBy(xpath = "//td[@class='hiddenbefore'][text()=' Mahabaleshwar ']")private WebElement getTextTrashGrp;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='Mahabaleshwar']")private WebElement trashGrpSelect;
	@FindBy(xpath = "//div[text()=' Mahabaleshwar']")private WebElement getTextGrp;
	
	public LocationTrash(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public WebElement getGetTextGrp() {
		return getTextGrp;
	}

	public WebElement getTrashGrpSelect() {
		return trashGrpSelect;
	}

	public WebElement getGetTextTrashGrp() {
		return getTextTrashGrp;
	}

	public WebElement getThreeDotMahab() {
		return threeDotMahab;
	}

	public WebElement getDeleteloc() {
		return deleteloc;
	}

	public WebElement getThreeDotLoc() {
		return threeDotLoc;
	}

	public WebElement getDeleteLocBtn() {
		return deleteLocBtn;
	}

	public WebElement getDeletePopupBtn() {
		return deletePopupBtn;
	}

	public WebElement getTrashGetTextLoc() {
		return trashGetTextLoc;
	}

	public WebElement getTrashLocSel() {
		return trashLocSel;
	}

	public WebElement getRestoreBtn() {
		return restoreBtn;
	}

	public WebElement getRestorePopUp() {
		return restorePopUp;
	}

	public WebElement getLocNameGetText() {
		return locNameGetText;
	}
	
}
