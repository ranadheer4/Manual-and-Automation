package com.fileShare.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.jdbc.Driver;
import com.olobby.genericUtility.WebDriverUtility;

public class Clients extends WebDriverUtility {
	@FindBy(xpath = "//app-clients//a[@id='clientlist']")private WebElement fsAllClients;
	@FindBy(xpath = "//app-clients//a[@id='clientgroup']")private WebElement clientByGroup;
	@FindBy(xpath = "//app-clients//img[@src='assets/images/edit_blueColor.svg']")private WebElement editClient;
	@FindBy(xpath = "//app-add-edit-client//button[normalize-space()='FS-CLNT-delete']")private WebElement deleteClinet;
	@FindBy(xpath = "//app-clients-by-group//tr[@role='row']/descendant::span[text()='Client Group 23-05']/ancestor::tr[1]/td[@aria-colindex='5']/descendant::button")private WebElement manageClients;
	@FindBy(xpath = "//app-create-client-group//button[normalize-space()='Delete']")private WebElement deleteGrpClnt;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='Client Group 23-05']")private WebElement checkbox;
	
	public Clients(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFsAllClients() {
		return fsAllClients;
	}

	public WebElement getClientByGroup() {
		return clientByGroup;
	}

	public WebElement getEditClient() {
		return editClient;
	}

	public WebElement getDeleteClinet() {
		return deleteClinet;
	}

	public WebElement getManageClients() {
		return manageClients;
	}

	public WebElement getDeleteGrpClnt() {
		return deleteGrpClnt;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}
	
	
}
