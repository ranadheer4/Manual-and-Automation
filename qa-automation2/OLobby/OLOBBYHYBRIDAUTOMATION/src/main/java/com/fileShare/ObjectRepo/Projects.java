package com.fileShare.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Projects extends WebDriverUtility {
	@FindBy(xpath = "//app-projects//a[@id='projectlist']")private WebElement projectList;
	@FindBy(xpath = "//app-projects//a[@id='projectlistbygrp']")private WebElement projectByClients;
	@FindBy(xpath = "//app-project-list//tr[@role='row']/descendant::td[text()='31-05 P2']/ancestor::tr[1]/td[@aria-colindex='9']/descendant::button")private WebElement editProject;
	@FindBy(xpath = "//app-create-edit-project//button[normalize-space()='Delete']")private WebElement deleteProject;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='31-05 P2']")private WebElement checkbox;


	public Projects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProjectList() {
		return projectList;
	}

	public WebElement getProjectByClients() {
		return projectByClients;
	}

	public WebElement getEditProject() {
		return editProject;
	}

	public WebElement getDeleteProject() {
		return deleteProject;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}
	
}