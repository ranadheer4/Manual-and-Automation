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

public class CreateTaskPage extends WebDriverUtility {
	
	@FindBy(name="subject")private WebElement enterSubject;
	@FindBy(xpath="//input[@id='subject']")private WebElement SubjectDropDown;
	@FindBy(xpath="//ng-select[@id='subject']//input[@type='text']")private WebElement SelectSubjectDropDown;
	@FindBy(xpath="//span[normalize-space()='predefined task 10th jan 2021']")private WebElement enterParticularSubject;
	@FindBy(xpath="//textarea[@id='description']")private WebElement descriptionBox;
	@FindBy(xpath="//label[text()='Payer ']/../ng-select[@placeholder='Select Payer']/descendant::span[@class='ng-arrow-wrapper']")private WebElement payerdropdown;
	@FindBy(xpath="//div[@class='scrollable-content']")private WebElement SelectParticularPayer;
	@FindBy(xpath="//div[@class='scrollable-content']")private WebElement payer2;
	@FindBy(xpath="//ng-select[@name='tin']//span[@class='ng-arrow-wrapper']")private WebElement TINdropDown;
	@FindBy(xpath="//div[@aria-expanded='true']//input[@type='text']")private WebElement SelectParticularTIN;
	@FindBy(xpath="//ng-dropdown-panel[@role='listbox']")private WebElement TINDropDown2;
	@FindBy(xpath="//ng-select[@placeholder='Select category']//span[@class='ng-arrow-wrapper']")private WebElement TinProLocaDropdown;
	@FindBy(xpath="//span[text()='Tin']")private WebElement ClickTIN;
	@FindBy(xpath="//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @formcontrolname='user_assign_to']/descendant::div[@role='combobox']/input[@type='text']")private WebElement AssignToDropDown;
	@FindBy(xpath="//div[@class='scrollable-content']")private WebElement SelectParticularAssign;
    @FindBy(xpath="//button[normalize-space()='Create']")private WebElement CreateButton;
	public CreateTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEnterSubject() {
		return enterSubject;
	}

	public WebElement getPayer2() {
		return payer2;
	}

	public WebElement getDescriptionBox() {
		return descriptionBox;
	}

	public WebElement getPayerdropdown() {
		return payerdropdown;
	}

	public WebElement getTINdropDown() {
		return TINdropDown;
	}

	public WebElement getTinProLocaDropdown() {
		return TinProLocaDropdown;
	}
	

	public WebElement getTINDropDown2() {
		return TINDropDown2;
	}

	public WebElement getClickTIN() {
		return ClickTIN;
	}

	
	public WebElement getAssignToDropDown() {
		return AssignToDropDown;
	}

	public WebElement getSelectParticularAssign() {
		return SelectParticularAssign;
	}



	public WebElement getCreateButton() {
		return CreateButton;
	}

	public WebElement getSubjectDropDown() {
		return SubjectDropDown;
	}

	public WebElement getSelectSubjectDropDown() {
		return SelectSubjectDropDown;
	}
	public WebElement getEnterParticularSubject() {
		return enterParticularSubject;
	}
	public WebElement getSelectParticularPayer() {
		return SelectParticularPayer;
	}
	public WebElement getSelectParticularTIN() {
		return SelectParticularTIN;
	}
    public void clickAndadd(WebDriver driver) {
		mouseOverAnElement(driver,SelectSubjectDropDown);
		enterParticularSubject.click();
	}
	public void clickAndAddPayerDropDown(WebDriver driver) {
		mouseOverAnElement(driver,payerdropdown);
		SelectParticularPayer.click();
	}
	public void SelectParticularTin(WebDriver driver) {
		mouseOverAnElement(driver,TINdropDown);
		SelectParticularTIN.click();
		
	}
	public void ClickParticularTin(WebDriver driver) {
		mouseOverAnElement(driver,TinProLocaDropdown);
		ClickTIN.click();
	}
	public void SelectAssign(WebDriver driver) {
		mouseOverAnElement(driver,AssignToDropDown);
		SelectParticularAssign.click();
		
	}
	public void ClickCreateButton(WebDriver driver) {
		mouseOverAnElement(driver,CreateButton);
		
	}
	public void waitForClickElement(WebDriver driver) {
		waitForElemenetToBeClickable(driver, CreateButton);
	}
	public WebElement getPayer21() {
	
		return null;
	}
    public WebElement getTINDropDown22() {
		
		return null;
	}
	public WebElement getCreateButton2() {
	
		return null;
	}
    public WebElement getAssign24() {
	
		return null;
    }
}
