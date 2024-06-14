package com.notes.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.prakash.genericUtility.WebDriverUtility;

public class NotesHomepage extends WebDriverUtility {
	@FindBy(xpath = "//div[@class='navTab_options']//descendant::ul//descendant::li[@data-original-title='Create New Note']") private WebElement CreatenewNote;
	@FindBy(xpath = "//div[@class='navTab_options']//descendant::ul//descendant::li[@data-original-title='New Bookshelf']") private WebElement NewBookshelf;
	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='List of all']") private WebElement ListOfAll;
	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='My Bookshelf']") private WebElement MyBookshelf;
	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared with me']") private WebElement ShareWithMe;
	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Favorite']") private WebElement Favorite;
	@FindBy(xpath = "//div[@class='navTab_options']//descendant::ul//descendant::input[@placeholder='Search tag, title']") private WebElement Search;
//	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
//	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
//	
//	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
	
//	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
//	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
//	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
//	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
//	@FindBy(xpath = "//div[@class='navTab_options']//a//..//span[text()='Shared by me']") private WebElement SharedByMe;
	
	
	
}
