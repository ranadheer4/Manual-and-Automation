package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class UserManagement extends WebDriverUtility{
	
	@FindBy(xpath="//span[text()='User Management']")private WebElement usermgment;
	@FindBy(xpath = "//input[@id='user_mobile']")private WebElement mobileNo;
	@FindBy(xpath = "//h6[@class='mb-0 p-1 ng-star-inserted']/div[@class='row']/div[text()='13sept user']")private WebElement clickUser;
	@FindBy(xpath = "//div[text()='007NesUser smith']/../../../../..//ancestor::div[@id='21464']/descendant::button[text()='Edit User']")private WebElement editUser;
	@FindBy(xpath = "//button[text()='Update']")private WebElement updatebtn;
	@FindBy(xpath = "//input[@id='user_job_title']")private WebElement jobTitle;
	@FindBy(xpath = "//div[text()='007NesUser smith']/../../../../..//ancestor::div[@id='21464']/descendant::button[text()='Add Favorites']")private WebElement addFavButton;
	@FindBy(xpath = "//input[@id='payer_id']")private WebElement payer;
	@FindBy(xpath = "//div[@class='modal-body']")private WebElement blankClick;
	@FindBy(xpath = "//input[@id='state_id']")private WebElement states;
	@FindBy(xpath = "//button[text()='Update Forms']")private WebElement updateForm;
	@FindBy(xpath = "//div[text()='007NesUser smith']/../../../../..//ancestor::div[@id='21464']/descendant::button[text()='Login History']")private WebElement loginHistory;
	@FindBy(xpath = "//div[text()='Download ']")private WebElement Download;
	@FindBy(xpath = "//input[@id='form_ids']")private WebElement Forms;
	@FindBy(xpath = "//span[text()='Decatur_Morgan_Hospital__Credentialing_Application_20191233[Stormbird,Alexen_118252_12272019]_222827 (1)']/following-sibling::span[text()='×']")private WebElement close;
	@FindBy(xpath = "//div[@role='option']/input[@id='item-1']")private WebElement option;
	@FindBy(xpath = "//span[text()='×']")private WebElement closeWindow;
	
//	https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fdev-refactor.credentialmydoc.com%2Fdownloads%2Fdownloaded_files%2FVikram__Danvale1_loginhistory.xlsx&wdOrigin=BROWSELINK
//https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fdev-refactor.credentialmydoc.com%2Fdownloads%2Fdownloaded_files%2FVikram__Danvale1_loginhistory.xlsx&wdOrigin=BROWSELINK	
	public UserManagement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void BlankClick(WebDriver driver)
	{
		mouseOverAnElement(driver, blankClick);
		blankClick.click();
	}
	
	public WebElement getUsermgment() {
		return usermgment;
	}
	public WebElement getMobileNo() {
		return mobileNo;
	}
	public WebElement getClickUser() {
		return clickUser;
	}
	public WebElement getEditUser() {
		return editUser;
	}
	public WebElement getUpdatebtn() {
		return updatebtn;
	}
	public WebElement getJobTitle() {
		return jobTitle;
	}
	public WebElement getAddFavButton() {
		return addFavButton;
	}
	public WebElement getPayer() {
		return payer;
	}
	public WebElement getStates() {
		return states;
	}
	public WebElement getUpdateForm() {
		return updateForm;
	}
	public WebElement getLoginHistory() {
		return loginHistory;
	}
	public WebElement getDownload() {
		return Download;
	}
	public WebElement getForms() {
		return Forms;
	}
	public WebElement getClose() {
		return close;
	}
	public WebElement getOption() {
		return option;
	}
	public WebElement getCloseWindow() {
		return closeWindow;
	}
	
	
}
