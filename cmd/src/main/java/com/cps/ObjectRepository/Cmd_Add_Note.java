/* Decompiler 61ms, total 734ms, lines 163 */
package com.cps.ObjectRepository;

import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cmd_Add_Note extends WebDriverUtility implements IConstants {
   @FindBy(
      xpath = "//aside[@class='left-sidebar']"
   )
   private WebElement Leftsidebar;
   @FindBy(
      xpath = "//i[@class='fa fa-th-large']"
   )
   private WebElement Workflow_Dropdown;
   @FindBy(
      xpath = "//i[@class='fa-network-wired fas']"
   )
   private WebElement Workflowpage;
   @FindBy(
      xpath = "//body/ctg-root/app-main-layout[@class='ng-star-inserted']/section[@id='wrapper']/div[1]"
   )
   private WebElement Pageclick;
   @FindBy(
      xpath = "//div[text()='ADD NOTE ']"
   )
   private WebElement Addnote;
   @FindBy(
      xpath = "//input[@id='subject']"
   )
   private WebElement Subject;
   @FindBy(
      xpath = "//textarea[@id='description']"
   )
   private WebElement Description;
   @FindBy(
      xpath = "//div[@class='modal-content']/descendant::ng-select[@bindvalue='id']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement Payerdropdown;
   @FindBy(
      xpath = "//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @placeholder='Select TIN']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement Tindropdown;
   @FindBy(
      xpath = "//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @name='location-provider']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement Tinprovlocdropdown;
   @FindBy(
      xpath = "//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @formcontrolname='category_item_id']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement AutoTPLdrpdwn;
   @FindBy(
      xpath = "//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @placeholder='Select Status']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement StatusDrpd;
   @FindBy(
      xpath = "//input[contains(@placeholder,'mm-dd-yyyy')]"
   )
   private WebElement Date;
   @FindBy(
      xpath = "//button[contains(text(),'Create')]"
   )
   private WebElement Create;

   public Cmd_Add_Note(WebDriver driver) {
      PageFactory.initElements(driver, this);
   }

   public void mouseMover(WebDriver driver) {
      mouseOverAnElement(driver, Leftsidebar);
      Workflow_Dropdown.click();
   }

   public void clickWorkflowDropdown() {
      Workflow_Dropdown.click();
   }

   public void clickWorkflowpage() {
      Workflowpage.click();
   }

   public void pageClick() {
      Pageclick.click();
   }

   public void clickAddnote() {
      Addnote.click();
   }

   public void clickAndAddPayerDropDown(WebDriver driver) {
      mouseOverAnElement(driver, Payerdropdown);
      Payerdropdown.click();
   }

   public WebElement getPayerdropdown() {
      return Payerdropdown;
   }

   public void clickEnter(WebDriver driver) {
      clickOnEnterButton(driver);
   }

   public void clickAndAddTinDropDown(WebDriver driver) {
      mouseOverAnElement(driver, Tindropdown);
      Tindropdown.click();
   }

   public void clickAndAddTinProvLocDropDown(WebDriver driver) {
      mouseOverAnElement(driver, Tinprovlocdropdown);
      Tinprovlocdropdown.click();
   }

   public WebElement getSubject() {
      return Subject;
   }

   public WebElement getDescription() {
      return Description;
   }

   public WebElement getTindropdown() {
      return Tindropdown;
   }

   public WebElement getTinprovlocdropdown() {
      return Tinprovlocdropdown;
   }

   public WebElement getStatusDrpd() {
      return StatusDrpd;
   }

   public void clickAndaddAutoTPL(WebDriver driver) {
      mouseOverAnElement(driver, AutoTPLdrpdwn);
      AutoTPLdrpdwn.click();
   }

   public WebElement getAutoTPLdrpdwn() {
      return AutoTPLdrpdwn;
   }

   public void clickAndaddStatus(WebDriver driver) {
      mouseOverAnElement(driver, StatusDrpd);
      StatusDrpd.click();
   }

   public void clickDate() {
      Date.clear();
      Date.sendKeys("10022023");
   }

   public WebElement getDate() {
      return Date;
   }

   public void clickCreate() {
      Create.click();
   }
}
