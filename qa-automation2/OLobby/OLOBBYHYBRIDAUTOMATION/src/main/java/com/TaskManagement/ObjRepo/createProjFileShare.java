package com.TaskManagement.ObjRepo;

import com.olobby.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createProjFileShare extends WebDriverUtility {

	@FindBy(xpath= "//a[normalize-space()='Create Project']")private WebElement createProj;
	@FindBy(xpath = "//input[@role='combobox']")private WebElement client;
	@FindBy(xpath = "//input[@placeholder='Project due date']")private WebElement projDueDtae; 
	@FindBy(xpath = "//input[@id='projectname']")private WebElement projName;
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-create-edit-project[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/dx-data-grid[1]/div[1]/div[6]/div[1]/table[1]/tbody[2]/tr[1]/td[1]/span[1]")private WebElement amrut;
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-create-edit-project[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/dx-data-grid[1]/div[1]/div[6]/div[1]/table[1]/tbody[3]/tr[1]/td[1]/span[1]")private WebElement chandan;
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-create-edit-project[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/dx-data-grid[1]/div[1]/div[6]/div[1]/table[1]/tbody[4]/tr[1]/td[1]/span[1]")private WebElement debashish;
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-create-edit-project[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/dx-data-grid[1]/div[1]/div[6]/div[1]/table[1]/tbody[6]/tr[1]/td[1]/span[1]")private WebElement supriya;
	@FindBy(xpath = "//button[normalize-space()='Create']")private WebElement create;
	@FindBy(xpath = "//div[contains(text(),'vikram c1 - India')]")private WebElement vikramC1;
	@FindBy(xpath = "//div[contains(text(),'vikram c2 - India')]")private WebElement vikram2;
	@FindBy(xpath = "//button[@data-date='30-04-2023']")private WebElement date;


	public createProjFileShare(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

         
	public WebElement getDate() {
		return date;
	}


	public WebElement getVikram2() {
		return vikram2;
	}


	public WebElement getVikramC1() {
		return vikramC1;
	}


	public WebElement getCreateProj() {
		return createProj;
	}


	public WebElement getClient() {
		return client;
	}


	public WebElement getProjDueDtae() {
		return projDueDtae;
	}


	public WebElement getProjName() {
		return projName;
	}


	public WebElement getAmrut() {
		return amrut;
	}


	public WebElement getChandan() {
		return chandan;
	}


	public WebElement getDebashish() {
		return debashish;
	}


	public WebElement getSupriya() {
		return supriya;
	}


	public WebElement getCreate() {
		return create;
	}
	
	

}
