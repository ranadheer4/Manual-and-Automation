package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class GenerateForm_WFPg extends WebDriverUtility {

	@FindBy(xpath="//div[text()='GENERATE FORM ']")private WebElement generatebtn;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::label[text()='Document related to']/following-sibling::ng-select[@placeholder='Select Assign To']/descendant::input[@type='text']")private WebElement entityTypeField;
	@FindBy(xpath = "//button[normalize-space()='Next']")private WebElement nextBtn;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[@class='ng-value-container']/div[text()='Select Provider']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement providerName;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[@class='ng-value-container']/div[text()='Select Location']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement location;
	@FindBy(xpath = "//button[normalize-space()='ADD']")private WebElement add;
	@FindBy(xpath = "//button[text()='Next ']")private WebElement nextBtn1;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[@class='ng-value-container']/div[text()='Select Form type']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement formTypeField;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[@class='ng-value-container']/div[text()='Select Payer type']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement payerTypeField;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[@class='ng-value-container']/div[text()='Select Form']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement selectFormField;
	@FindBy(xpath = "//button[normalize-space()='Preview']")private WebElement preview;
	@FindBy(xpath = "//div[text()='Close']")private WebElement close;
	@FindBy(xpath = "//button[normalize-space()='Add Form']")private WebElement addformBtn;
	@FindBy(xpath = "//i[@class='far fa-file-pdf ml-4 text-danger download py-1']")private WebElement dwldForm;
	@FindBy(xpath = "//ng-dropdown-panel[@id='a4e2203f7a38']//div[@class='ng-dropdown-panel-items scroll-host']")private WebElement scrollBar;
	@FindBy(xpath = "//div[@class='ng-dropdown-panel-items scroll-host']")private WebElement scrollBar1;
	@FindBy(id = "generateForm")private WebElement clickBlank;
    @FindBy(xpath = "//ng-dropdown-panel[@id='a63aeaa80083']/div[@class='ng-dropdown-panel-items scroll-host']")private WebElement scrollBar2;
    @FindBy(xpath = "//div[@class='topBox']/h4[text()='Generate Form']")private WebElement blankClick1;
    @FindBy(xpath = "//label[text()='Select Form']")private WebElement blankClick2;
    
	
	public GenerateForm_WFPg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clickEnter(WebDriver driver)
	{
		clickOnEnterButton(driver);
	}
	public void waitForPage(WebDriver driver)
	{
		waitForPageToLoad(driver);
	}
	public void clickGenerateForm() {
		generatebtn.click();
	}
	public void waitElementVisibleLoc(WebDriver driver)
	{
		waitTillElementToVisible(driver, location);
	}
	public void waitElemClickLoc(WebDriver driver)
	{
		waitForElemenetToBeClickable(driver, location);
	}
	public void waitClick(WebElement element)
	{
		waitAndClick(location);
	}
public WebElement getEntityTypeField() {
		return entityTypeField;
	}
	public void clickNextBtn()
	{
		nextBtn.click();
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getProviderName() {
		return providerName;
	}
	public void clickAdd()
	{
		add.click();
	}
	public void clickNext1()
	{
		nextBtn1.click();
	}
	public WebElement getclickFormtypeF()
	{
		return formTypeField;
	}
	public WebElement getSelectFormF()
	{
		return selectFormField;
	}
	public WebElement getPayerTypeField()
	{
		return payerTypeField;
	}
	public void clickPreview()
	{
		preview.click();
	}
	public void clickClose()
	{
		close.click();
	}
	public void clickAddForm()
	{
		addformBtn.click();
	}
	public void clickDowldForm()
	{
		dwldForm.click();
	}
	public void mouseOver1(WebDriver driver)
	{
		mouseOverAnElement(driver, scrollBar);
		scrollBar.click();
	}
	public void mouseOver2(WebDriver driver)
	{
		mouseOverAnElement(driver, scrollBar);
		scrollBar1.click();
	}
	public void mouseOver3(WebDriver driver)
	{
		mouseOverAnElement(driver, blankClick2);
		blankClick2.click();
	}
	
	public void clickBlankS()
	{
		clickBlank.click();
	}
	
	
	
	
}

