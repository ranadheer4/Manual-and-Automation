/* Decompiler 32ms, total 260ms, lines 122 */
package com.cps.ObjectRepository;

import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cmd_Add_User extends WebDriverUtility implements IConstants {
   @FindBy(
      xpath = "//aside[@class='left-sidebar']"
   )
   private WebElement Leftsidebar;
   @FindBy(
      xpath = "//i[@class='fa fa-check-square']"
   )
   private WebElement Settings;
   @FindBy(
      xpath = "//span[text()='Add A User']/.."
   )
   private WebElement AddUser;
   @FindBy(
      xpath = "//ctg-add-user[@class='ng-star-inserted']//div[@id='content-wrapper']"
   )
   private WebElement PageClick;
   @FindBy(
      xpath = "//input[@id='user_first_name']"
   )
   private WebElement FirstName;
   @FindBy(
      xpath = "//input[@id='user_last_name']"
   )
   private WebElement LasttName;
   @FindBy(
      xpath = "//input[@id='user_email']"
   )
   private WebElement Email;
   @FindBy(
      xpath = "//input[@id='user_password']"
   )
   private WebElement Password;
   @FindBy(
      xpath = "//input[@id='user_confirmPassword']"
   )
   private WebElement ConfirmPassword;
   @FindBy(
      xpath = "//div[@id='content-wrapper']/descendant::ng-select[@bindlabel='label' and @placeholder='Select User Type']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement UserType;
   @FindBy(
      xpath = "//input[@id='Active']"
   )
   private WebElement ActiveUser;
   @FindBy(
      xpath = "//button[normalize-space()='Create']"
   )
   private WebElement Create;

   public Cmd_Add_User(WebDriver driver) {
      PageFactory.initElements(driver, this);
   }

   public void mouseMover(WebDriver driver) {
      mouseOverAnElement(driver, Leftsidebar);
      Settings.click();
   }

   public void clickSettings() {
      Settings.click();
   }

   public void clickAdduser() {
      AddUser.click();
   }

   public void pageClick() {
      PageClick.click();
   }

   public WebElement getFirstName() {
      return FirstName;
   }

   public WebElement getLasttName() {
      return LasttName;
   }

   public WebElement getEmail() {
      return Email;
   }

   public WebElement getPassword() {
      return Password;
   }

   public WebElement getConfirmPassword() {
      return ConfirmPassword;
   }

   public void clickUser(WebDriver driver) {
      mouseOverAnElement(driver, UserType);
      UserType.click();
   }

   public WebElement getUserType() {
      return UserType;
   }

   public void clickEnter(WebDriver driver) {
      clickOnEnterButton(driver);
   }

   public void clickActive() {
      ActiveUser.click();
   }

   public void clickCreate() {
      Create.click();
   }
}
