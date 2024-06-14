package com.folders.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

	public class Homepage extends WebDriverUtility{

	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[1]/descendant::span[text()='Export']")private WebElement olExport;
	@FindBy(xpath = "//div[@class='checkbox checkbox-primary']//input[@id='checkbox2' and @value='666']")private WebElement checkbox;
	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[1]/descendant::span[text()='Email']")private WebElement email;
	@FindBy(xpath = "//div[@class='checkbox checkbox-primary']//input[@id='checkbox2' and @value='667']")private WebElement checkbox2;
	@FindBy(xpath = "//div//input[@placeholder='To']")private WebElement toEmail;
	@FindBy(xpath = "//div[@class='modal-content']//button[@type='submit']")private WebElement sendEmail;
	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[2]/descendant::span[text()='Lock']")private WebElement lock;
	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[2]/descendant::span[text()='Unlock']")private WebElement unLock;
	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[2]/descendant::span[text()='Expand']")private WebElement expand;
	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[2]/descendant::span[text()='Collapse']")private WebElement collapse;
	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[3]/descendant::span[text()='Increase']")private WebElement increase;
	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[3]/descendant::span[text()='Decrease']")private WebElement decrease;
	@FindBy(xpath = "//div[@id='folder']/descendant::th[text()=' File ']/../../../descendant::tr[2]/td[3]/descendant::span[@class='fullscreen']")private WebElement exit;
	@FindBy(xpath = "//div[@id='filefoldertabpane']//tr//td//a[@id='clicktoreload_3']//img")private WebElement refresh;

	
	public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);

	}
	public WebElement getOlExport() {
		return olExport;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCheckbox2() {
		return checkbox2;
	}
	public WebElement getToEmail() {
		return toEmail;
	}
	public WebElement getSendEmail() {
		return sendEmail;
	}
	public void clickEnter(WebDriver driver) {
	    clickOnEnterButton(driver);
	}
	public WebElement getLock() {
		return lock;
	}
	public WebElement getUnLock() {
		return unLock;
	}
	public WebElement getExpand() {
		return expand;
	}
	public WebElement getCollapse() {
		return collapse;
	}
	public WebElement getIncrease() {
		return increase;
	}
	public WebElement getDecrease() {
		return decrease;
	}
	public WebElement getExit() {
		return exit;
	}
	public WebElement getRefresh() {
		return refresh;
	}
	
}