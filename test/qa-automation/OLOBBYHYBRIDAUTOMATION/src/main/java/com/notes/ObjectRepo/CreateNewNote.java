package com.notes.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.prakash.genericUtility.WebDriverUtility;

public class CreateNewNote extends WebDriverUtility{
	@FindBy(xpath = "//input[@formcontrolname='notename']") private WebElement name;
	@FindBy(xpath = "//textarea[@formcontrolname='description']") private WebElement description;
	@FindBy(xpath = "//input[@placeholder='Search Users']") private WebElement searchUsers;
	@FindBy(xpath = "//button[@type='submit' and @value='submit']") private WebElement save;
	@FindBy(xpath = "//button[text()='Cancel']") private WebElement cancel;
	
	@FindBy(xpath = "//input[@placeholder='Search Users']") private WebElement searchUsers;
	@FindBy(xpath = "//input[@placeholder='Search Users']") private WebElement searchUsers;
	
	
	
	
	
	
	
}
