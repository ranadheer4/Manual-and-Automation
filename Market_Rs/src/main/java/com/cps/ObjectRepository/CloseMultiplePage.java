package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public class CloseMultiplePage extends WebDriverUtility{
	
	@FindBy(xpath="//span[@class='ng-arrow-wrapper']")private WebElement selectCatogoryDropDown;
	@FindBy(xpath="//span[@class='ng-arrow-wrapper']/ancestor::ng-select[@placeholder='Select Category']")private WebElement selectLocation;
	@FindBy(xpath="//input[@type='text']")private WebElement EnterCatorory;
	@FindBy(xpath="//span[@class='ng-arrow-wrapper']/ancestor::div[@class='form-row filter']/div/div/ng-select/descendant::span[@class='ng-arrow-wrapper']")private WebElement selectLocationDropDown;
	@FindBy(xpath="//span[text()='Location']")private WebElement selectParticularLocation;
	@FindBy(xpath="//span[text()='1101 location 89 fredbuck street mail box CLI-HYD']")private WebElement Selectnumber1;
	@FindBy(xpath="//div[@class='datatable-row-center datatable-row-group ng-star-inserted']/datatable-body-cell/div/label")private WebElement selectCheckbox;
	@FindBy(xpath="//div[@class='col']/button[text()='Close']")private WebElement CloseButton;
	@FindBy(xpath="//section[@id='wrapper']/descendant::ng-select[@ng-reflect-name='tin_id']/descendant::div[@role='combobox']/input[@type='text']")private WebElement firstDropDown;
	@FindBy(xpath="//span[text()='Location']")private WebElement a2;
	@FindBy(xpath="//div[@class='ng-select-container']//span[@class='ng-arrow-wrapper']")private WebElement SecondDropDown;
	@FindBy(xpath="//section[@id='wrapper']/descendant::div[@class='ng-value-container']/div[text()='Select Location']/../descendant::div[@role='combobox']/input[@type='text']")private WebElement SelectLocation2356;
	//span[@class='ng-arrow-wrapper']/ancestor::div[@class='form-row filter']/div/div/ng-select/descendant::span[@class='ng-arrow-wrapper']
	
	public CloseMultiplePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectCatogoryDropDown() {
		return selectCatogoryDropDown;
	}

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getEnterCatorory() {
		return EnterCatorory;
	}

	public WebElement getSelectLocationDropDown() {
		return selectLocationDropDown;
	}

	public WebElement getSelectParticularLocation() {
		return selectParticularLocation;
	}

	public WebElement getSelectnumber1() {
		return Selectnumber1;
	}

	public WebElement getSelectCheckbox() {
		return selectCheckbox;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

	public WebElement getFirstDropDown() {
		return firstDropDown;
	}

	public WebElement getA2() {
		return a2;
	}

	public WebElement getSecondDropDown() {
		return SecondDropDown;
	}

	public WebElement getSelectLocation2356() {
		return SelectLocation2356;
	}

	public WebElement getEnterCatorory1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void clickAndWait(WebDriver driver) {
		waitForElemenetToBeClickable(driver, Selectnumber1);
		
	}
 
	

}
