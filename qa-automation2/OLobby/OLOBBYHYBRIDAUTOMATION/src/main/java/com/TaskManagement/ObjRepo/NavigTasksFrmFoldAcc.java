package com.TaskManagement.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class NavigTasksFrmFoldAcc extends WebDriverUtility {

	@FindBy(xpath= "//tr[@id='file_2_4']//div[@class='ng-star-inserted']//img")private WebElement linkedTask; 
	@FindBy(xpath= "//label[normalize-space()='(1)']")private WebElement attachmentClick;
	@FindBy(xpath= "//span[contains(text(),'LinkedTask')]")private WebElement fileName;
	@FindBy(xpath= "//tbody/tr[@id='file_2_4']/td[3]/span[2]")private WebElement verifyFile;
	@FindBy(xpath = "//span[contains(text(),'DeleteFile')]")private WebElement DeleteFile;
	@FindBy(xpath = "//li[text()=' Delete File ']")private WebElement deleteFile;
	@FindBy(xpath = "//h4[text()='Delete']")private WebElement deletePopup;
	@FindBy(xpath = "//button[text()='OK']")private WebElement okBtn;
	@FindBy(xpath = "//button[text()='No']")private WebElement NoBtn;
	
	public NavigTasksFrmFoldAcc(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getNoBtn() {
		return NoBtn;
	}
	public WebElement getOkBtn() {
		return okBtn;
	}
	public WebElement getDeletePopup() {
		return deletePopup;
	}
	public void RightClickOnDeleteFile(WebDriver driver)
	{
		
		Actions ac = new Actions(driver);
		ac.contextClick(DeleteFile).perform();
	}
	public WebElement getDeleteFile() {
		return deleteFile;
	}
	public WebElement getOlobbyDemo() {
		return deleteFile;
	}
	public WebElement getLinkedTask() {
		return linkedTask;
	}
	public WebElement getAttachmentClick() {
		return attachmentClick;
	}
	public WebElement getFileName() {
		return fileName;
	}
	public WebElement getVerifyFile() {
		return verifyFile;
	}
	public void doubleClick(WebDriver driver)
	{
		
		Actions ac = new Actions(driver);
		ac.doubleClick(fileName).perform();
	}
}
