/* Decompiler 17ms, total 720ms, lines 95 */
package com.cps.ObjectRepository;

import com.cps.genericUtility.IConstants;
import com.cps.genericUtility.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cmd_DeleteNote_Task extends WebDriverUtility implements IConstants {
   @FindBy(
      xpath = "//aside[@class='left-sidebar']"
   )
   private WebElement Leftsidebar;
   @FindBy(
      xpath = "//i[@class='fa fa-th-large']"
   )
   private WebElement Workflow_Dropdown;
   @FindBy(
      xpath = "//span[normalize-space()='Delete Note/Task']"
   )
   private WebElement Delete_Note_Task;
   @FindBy(
      xpath = "//body/ctg-root/app-main-layout[@class='ng-star-inserted']/section[@id='wrapper']/div[1]"
   )
   private WebElement Pageclick;
   @FindBy(
      xpath = "//div[@id='content-wrapper']/descendant::ng-select[@bindlabel='cat_name' and @placeholder='Select Category']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement Dropdown_category;
   @FindBy(
      xpath = "//div[@id='content-wrapper']/descendant::ng-select[@bindlabel='name' and @formcontrolname='custom_id']/descendant::div[@role='combobox']/input[@type='text']"
   )
   private WebElement Dropdown_Item_Category;
   @FindBy(
      xpath = "//body[1]/ctg-root[1]/app-main-layout[1]/section[1]/div[1]/ctg-delete-note-task[1]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[2]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/label[1]/input[1]"
   )
   private WebElement Selct_particular_checkbox;
   @FindBy(
      xpath = "//button[normalize-space()='Delete']"
   )
   private WebElement Delete_button;

   public Cmd_DeleteNote_Task(WebDriver driver) {
      PageFactory.initElements(driver, this);
   }

   public void mouseMover(WebDriver driver) {
     mouseOverAnElement(driver, Leftsidebar);
     Workflow_Dropdown.click();
   }

   public void clickWorkflowDropdown() {
      Workflow_Dropdown.click();
   }

   public void clickDeletenoteTask() {
      Delete_Note_Task.click();
   }

   public void clickPage() {
      Pageclick.click();
   }

   public void clickSelectdropDown(WebDriver driver) {
      mouseOverAnElement(driver, Dropdown_category);
      Dropdown_category.click();
   }

   public void clickSelectitemDropdown(WebDriver driver) {
      mouseOverAnElement(driver, Dropdown_Item_Category);
      Dropdown_Item_Category.click();
   }

   public void clickEnter(WebDriver driver) {
      clickOnEnterButton(driver);
   }

   public WebElement getDropdown_category() {
      return Dropdown_category;
   }

   public WebElement getDropdown_Item_Category() {
      return Dropdown_Item_Category;
   }

   public void clickPrtcularCheckbox() {
      Selct_particular_checkbox.click();
   }

   public void clickDelete() {
      Delete_button.click();
   }
}
