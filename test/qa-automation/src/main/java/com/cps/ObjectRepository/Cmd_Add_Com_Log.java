/* Decompiler 47ms, total 272ms, lines 119 */
package com.cps.ObjectRepository;

import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cmd_Add_Com_Log extends WebDriverUtility {
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
      xpath = "//div[normalize-space()='ADD COM LOG']"
   )
   private WebElement AddComLog;
   @FindBy(
      xpath = "//input[@id='caller_com_log']"
   )
   private WebElement Caller;
   @FindBy(
      xpath = "//textarea[@id='des_com_log']"
   )
   private WebElement Desription;
   @FindBy(
      xpath = "//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @id='ti_prac_com_log']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement Tin_PractiseDropdown;
   @FindBy(
      xpath = "//div[@class='modal-content']/descendant::ng-select[@bindlabel='name' and @formcontrolname='com_log_providers_dropdown']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement ProvidersDropdown;
   @FindBy(
      xpath = "//input[@id='No']"
   )
   private WebElement Assigncheckbox;
   @FindBy(
      xpath = "//button[normalize-space()='Save']"
   )
   private WebElement Save;

   public Cmd_Add_Com_Log(WebDriver driver) {
      PageFactory.initElements(driver, this);
   }

   public void mouseMover(WebDriver driver) {
      this.mouseOverAnElement(driver, this.Leftsidebar);
      this.Workflow_Dropdown.click();
   }

   public void clickWorkflowDropdown() {
      this.Workflow_Dropdown.click();
   }

   public void clickWorkflowpage() {
      this.Workflowpage.click();
   }

   public void pageClick() {
      this.Pageclick.click();
   }

   public void clickAddcomLog() {
      this.AddComLog.click();
   }

   public void clickAndaddTinpractiseDropDown(WebDriver driver) {
      this.mouseOverAnElement(driver, this.Tin_PractiseDropdown);
      this.Tin_PractiseDropdown.click();
   }

   public void clickAndaddProvidersDropDown(WebDriver driver) {
      this.mouseOverAnElement(driver, this.ProvidersDropdown);
      this.ProvidersDropdown.click();
   }

   public void clickEnter(WebDriver driver) {
      this.clickOnEnterButton(driver);
   }

   public WebElement getCaller() {
      return this.Caller;
   }

   public WebElement getDesription() {
      return this.Desription;
   }

   public WebElement getTin_PractiseDropdown() {
      return this.Tin_PractiseDropdown;
   }

   public WebElement getProvidersDropdown() {
      return this.ProvidersDropdown;
   }

   public void clickAssigncheck() {
      this.Assigncheckbox.click();
   }

   public void clickSave() {
      this.Save.click();
   }
}
