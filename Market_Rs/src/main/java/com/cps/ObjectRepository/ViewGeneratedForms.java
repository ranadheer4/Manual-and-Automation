package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class ViewGeneratedForms extends WebDriverUtility
{

	@FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement mouseLeftSideBar;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::span[text()='Reports']")private WebElement reports;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::span[text()='Generated Form']")private WebElement generatedForm;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::input[@placeholder='From Date']/../div/button/i[@class='fas fa-calendar-alt']")private WebElement formDate;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::input[@placeholder='To Date']/../div/button/i[@class='fas fa-calendar-alt']")private WebElement toDate;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[text()='Select category']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement category;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[text()='Select Item']/following-sibling::div[@role='combobox']/input[@type='text']")private WebElement item;
	@FindBy(xpath = "//button[normalize-space()='Search']")private WebElement search;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::span[text()='Jun 08,2023 08:32 AM']/ancestor::div[@class='datatable-row-center datatable-row-group ng-star-inserted']/descendant::datatable-body-cell/div/div/span/i[@class='far fa-file-pdf fa-lg']")private WebElement pdf;
	@FindBy(xpath = "//section[@id='wrapper']/descendant::div[text()='20']")private WebElement date;
	
	
	public WebElement getDate() {
		return date;
	}


	public ViewGeneratedForms(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void mouseHover(WebDriver driver)
	{
		mouseOverAnElement(driver, mouseLeftSideBar);
		
	}


	public WebElement getReports() {
		return reports;
	}


	public WebElement getGeneratedForm() {
		return generatedForm;
	}


	public WebElement getFormDate() {
		return formDate;
	}


	public WebElement getToDate() {
		return toDate;
	}


	public WebElement getCategory() {
		return category;
	}


	public WebElement getItem() {
		return item;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getPdf() {
		return pdf;
	}
	
	
}
