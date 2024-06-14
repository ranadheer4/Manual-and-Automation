package com.fileShare.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class file_Share extends WebDriverUtility {
	@FindBy(xpath = "//app-sticky-notes-dashboard//a[@id='Dashboard']")private WebElement dashborad;
	@FindBy(xpath = "//app-sticky-notes-dashboard//a[@id='UserAccess']")private WebElement userAccess;
	@FindBy(xpath = "//app-sticky-notes-dashboard//a[@id='Clients']")private WebElement clients;
	@FindBy(xpath = "//app-sticky-notes-dashboard//a[@id='Projects']")private WebElement projects;
	@FindBy(xpath = "//app-sticky-notes-dashboard//a[@id='Quickshare']")private WebElement quickShare;
	
	public file_Share(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getDashborad() {
		return dashborad;
	}
	public WebElement getUserAccess() {
		return userAccess;
	}	
	public WebElement getClients() {
		return clients;
	}
	public WebElement getProjects() {
		return projects;
	}
	public WebElement getQuickShare() {
		return quickShare;
	}
		}