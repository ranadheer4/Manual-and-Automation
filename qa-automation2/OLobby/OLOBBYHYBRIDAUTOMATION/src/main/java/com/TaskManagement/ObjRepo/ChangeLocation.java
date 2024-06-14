package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class ChangeLocation extends WebDriverUtility {

//	@FindBy(xpath="//div[text()=' T0000001697 ']")private WebElement taskId;
	@FindBy(xpath = "//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000000038 ']/../following-sibling::td[@aria-colindex='11']/../descendant::span[text()='MindSpace1']")private WebElement mindSpace1;
	@FindBy(xpath = "//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000001702 ']/../following-sibling::td[@aria-colindex='11']/../descendant::span[text()='India']")private WebElement India;
	@FindBy(xpath = "//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000000038 ']/../following-sibling::td[@aria-colindex='11']/../descendant::span[text()='India']")private WebElement India9;
	@FindBy(xpath = "//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000001745 ']/../following-sibling::td[@aria-colindex='11']/../descendant::span[text()='Mind space1']")private WebElement mindSpace11;
	@FindBy(xpath = "//tbody[@role='presentation']/descendant::td[@aria-colindex='5']/div[text()=' T0000001747 ']/../following-sibling::td[@aria-colindex='11']/../descendant::span[text()='Mind space1']")private WebElement mindSpacetask2;
	
	
	public ChangeLocation(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}

	public WebElement getMindSpace1() {
		return mindSpace1;
	}

	public WebElement getIndia() {
		return India;
	}

	public WebElement getIndia9() {
		return India9;
	}

	public WebElement getMindSpace11() {
		return mindSpace11;
	}

	public WebElement getMindSpacetask2() {
		return mindSpacetask2;
	}
	
	
	
}
