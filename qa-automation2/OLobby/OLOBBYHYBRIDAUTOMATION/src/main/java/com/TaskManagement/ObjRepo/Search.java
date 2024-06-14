package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Search extends WebDriverUtility {

	@FindBy(xpath="//span[contains(text(),'SearchProject1')]")private WebElement searchProj1;
	@FindBy(xpath = "//span[contains(text(),'SearchTask1')]")private WebElement searchTask1;
	
	
	
	
	
	public Search(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    



	public WebElement getSearchTask1() {
		return searchTask1;
	}





	public WebElement getSearchProj1() {
		return searchProj1;
	}
	
	
}
