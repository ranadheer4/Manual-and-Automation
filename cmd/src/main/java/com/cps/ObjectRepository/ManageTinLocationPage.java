package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class ManageTinLocationPage extends WebDriverUtility {
    @FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
	@FindBy(xpath = "//span[normalize-space()='Manage TIN/Locations']")private WebElement ManageTinLocation;
	@FindBy(xpath="//div[text()='ADD TIN/GROUP ']")private WebElement addTinGroup;
	
	@FindBy(xpath = "//div[contains(text(),'TIN Information')]")private WebElement tinInfo;
	
	@FindBy(id = "1")private WebElement tinName;
	@FindBy(id = "2")private WebElement tinGrpName;
	@FindBy(xpath = "//button[normalize-space()='SAVE']")private WebElement saveBtn;
	@FindBy(xpath = "//div[text()='ADD LOCATION ']")private WebElement addLocation;
	@FindBy(xpath = "//div[contains(text(),'Practice Information')]")private WebElement practiceInfo;
	
	@FindBy(xpath = "(//div[@class='ng-select-container'])[1]")private WebElement tinDropdown;
	@FindBy(id = "3")private WebElement practiceName;
	@FindBy(xpath = "//button[normalize-space()='SAVE']")private WebElement saveBtnP;
	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement leftSideBar;
	@FindBy(xpath = "//span[normalize-space()='1201-ABHRA']")private WebElement selectTin;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::form/descendant::label[text()='TIN']/../descendant::input[@type='text']")private WebElement drpdownNew;
	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted']")private WebElement drpdownOptnNew;
	
	public ManageTinLocationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void mouseHover(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);
		ManageTinLocation.click();
	}
	public void mouseHoverAddLoc(WebDriver driver)
	{
		mouseOverAnElement(driver, addLocation);
		addLocation.click();
	}
	public void clickEnter(WebDriver driver)
	{
		clickOnEnterButton(driver);
	}
	
	
	
	public void dropdwnNew(WebElement eLib)
	{
		//sssdrpdownNew.
	}
	
	
	public void clickManageTinLocation() {
		ManageTinLocation.click();
		
	}
	
	public void clickAddTin()
	{
		addTinGroup.click();
	}
	public void clicktTinInfo() {
		
		tinInfo.click();
	}
	
	public void enterTinname()
	{
          tinName.click();
	}
	public void enterTingrpname(String tingrpname)
	{
		tinGrpName.sendKeys(tingrpname);
	}
	
	public void practiceName(String practicename)
	{
		practiceName.sendKeys(practicename);
	}
	public void clickSavebtn()
	{
		saveBtn.click();	
	}
	public void clickLoginbtnP()
	{
		saveBtnP.click();
	}
	public void clickPracticeInfo()
	{
		practiceInfo.click();
	}
	public void clickAddLocation()
	{
		addLocation.click();
	}
	public void selectTin()
	{
		tinDropdown.click();
	}
	public void sendTin()
	{
		selectTin.click();
	}
	public void clickSaveLocation()
	{
		saveBtnP.click();
	}
	
	public WebElement getAddTinGroup() {
		return addTinGroup;
	}
	public WebElement getTinInfo() {
		return tinInfo;
	}
	public WebElement getTinName() {
		return tinName;
	}
	public WebElement getTinGrpName() {
		return tinGrpName;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getAddLocation() {
		return addLocation;
	}
	public WebElement getPracticeInfo() {
		return practiceInfo;
	}
	public WebElement getTinDropdown() {
		return tinDropdown;
	}
	public WebElement getPracticeName() {
		return practiceName;
	}
	public WebElement getSaveBtnP() {
		return saveBtnP;
	}


	public WebElement getDrpdownNew() {
		return drpdownNew;
	}


	public WebElement getDrpdownOptnNew() {
		return drpdownOptnNew;
	}
	
	
	
	
	
}
