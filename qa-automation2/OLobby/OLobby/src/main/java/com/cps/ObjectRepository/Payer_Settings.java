package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.WebDriverUtility;

public class Payer_Settings extends WebDriverUtility implements IConstants{
	@FindBy(xpath="//span[text()='Payer Setting']/../i")private WebElement PayerSettings;
	@FindBy(xpath = "//div[@class='whiteBack']")private WebElement PageClick;
	@FindBy(xpath="//div[@id='content-wrapper']/descendant::div[@class='ng-value ng-star-inserted']/span/following-sibling::span[text()='Select TIN']/../../descendant::div[@role='combobox']/input[@type='text']")private WebElement TinDropDown;
	@FindBy(xpath="//div[@id='content-wrapper']/descendant::ng-select[@bindlabel='name' and @placeholder='Select Locations']/descendant::div[@role='combobox']/input[@type='text']")private WebElement LocationDropDown;
	@FindBy(xpath="//div[@id='content-wrapper']/descendant::ng-select[@bindvalue='id' and @placeholder='Select Providers']/descendant::div[@role='combobox']/input[@type='text']")private WebElement ProviderDropDown;
	@FindBy(xpath = "//div[@id='content-wrapper']/descendant::ng-select[@bindvalue='id' and @placeholder='Select Payer']/descendant::div[@role='combobox']/input[@type='text']")private WebElement PayerOne;
	@FindBy(xpath="//div[@id='content-wrapper']/descendant::div[@class='ng-value ng-star-inserted']/span/following-sibling::span[text()='Select Payer Type']/../../descendant::div[@role='combobox']/input[@type='text']")private WebElement PayerType;
	@FindBy(xpath="//div[@id='content-wrapper']/descendant::div[@class='ng-value ng-star-inserted']/span/following-sibling::span[text()='Select Contract Type']/../../descendant::div[@role='combobox']/input[@type='text']")private WebElement ContractType;
	@FindBy(xpath="//div[@id='content-wrapper']/descendant::div[@class='ng-value ng-star-inserted']/span/following-sibling::span[text()='Select Status of Participation']/../../descendant::div[@role='combobox']/input[@type='text']")private WebElement ParticipationStatus;
//	@FindBy(xpath="//div[@class='input-group']/input[@formcontrolname='effective_date']/../div/button/i[@class='fas fa-calendar-alt']")private WebElement ClickCalendar;
//	@FindBy(xpath="//select[@title='Select month']")private WebElement SelectMonthType;
//	@FindBy(xpath="//select[@title='Select year']")private WebElement SelectYearType;
//	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[@class='ngb-dp-month ng-star-inserted']/ngb-datepicker-month/div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div")private WebElement Day;
//	@FindBy(xpath="")private WebElement TerminationDate;
	@FindBy(xpath="//input[@id='provider_no']")private WebElement ProviderNo;
	@FindBy(xpath="//div[@class='btn customOrange1 ng-star-inserted']")private WebElement Save;
	//@FindBy(xpath="")private WebElement 
	//@FindBy(xpath="")private WebElement 
	
	public Payer_Settings(WebDriver driver) {
	      PageFactory.initElements(driver, this);
	   }

	public WebElement getPayerSettings() {
		return PayerSettings;
		}
	
	public WebElement getPageClick() {
		return PageClick;
	}

	public void clickAndAddTinDropDown(WebDriver driver) {
	      mouseOverAnElement(driver, TinDropDown);
	      TinDropDown.click();
	   }
	public void clickAndAddLocationDropDown(WebDriver driver) {
	      mouseOverAnElement(driver, LocationDropDown);
	      LocationDropDown.click();
	   }
	
	public WebElement getTinDropDown() {
		return TinDropDown;
	}

	public WebElement getLocationDropDown() {
		return LocationDropDown;
	}

	public void clickAndAddProviderDropDown(WebDriver driver) {
	      mouseOverAnElement(driver, ProviderDropDown);
	      ProviderDropDown.click();
	   }
	public WebElement getProviderDropDown() {
		return ProviderDropDown;
	}
	public void clickAndAddPayeroneDropDown(WebDriver driver) {
	      mouseOverAnElement(driver, PayerOne);
	      PayerOne.click();
	   }
	
	public WebElement getPayerOne() {
		return PayerOne;
	}

	public void clickAndAddPayerType(WebDriver driver) {
	      mouseOverAnElement(driver, PayerType);
	      PayerType.click();
	   }
	public WebElement getPayerType() {
		return PayerType;
	}

	public void clickAndAddContractType(WebDriver driver) {
	      mouseOverAnElement(driver, ContractType);
	      ContractType.click();
	   }
	
	public WebElement getContractType() {
		return ContractType;
	}

	public WebElement getParticipationStatus() {
		return ParticipationStatus;
	}

	public void clickAndAddParticipationStatus(WebDriver driver) {
	      mouseOverAnElement(driver, ParticipationStatus);
	      ParticipationStatus.click();
	   }

	public WebElement getProviderNo() {
		return ProviderNo;
	}

	public void clickSave() {
		Save.click();
	}
	
//	public WebElement getClickCalendar() {
//		return ClickCalendar;
//	}
//
//	public void select_list_month(String month){
//	     Select monthDd=new Select(SelectMonthType);
//	     monthDd.selectByVisibleText(month);
//	  }
//	public void select_list_year(String year){
//	     Select yearDd=new Select(SelectYearType);
//	     yearDd.selectByVisibleText(year);
//	  }
//
//	public WebElement getSelectMonthType() {
//		return SelectMonthType;
//	}
//
//	public WebElement getSelectYearType() {
//		return SelectYearType;
//	}
//
//	public WebElement getDay() {
//		return Day;
//	}
	
//	public void clickDay() {
//		Day.sendKeys("6");
//	}
	
	
		
}

	


