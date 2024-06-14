package com.cps.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cps.genericUtility.WebDriverUtility;

public class Expiration_Weekly extends WebDriverUtility{
    
    @FindBy(xpath = "//aside[@class='left-sidebar']")private WebElement Leftsidebar;
     @FindBy(xpath = "//body/ctg-root/app-main-layout[@class='ng-star-inserted']/section[@id='wrapper']/app-side-nav/div[@class='sidebar navbar-nav toggled']/div[@id='main-wrapper']/aside[@class='left-sidebar']/div[@class='scroll-sidebar']/nav[@class='sidebar-nav']/ul[@id='sidebarnav']/li[4]")private WebElement Expirations;
     @FindBy(xpath = "//div[@class='topBox']")private WebElement PageClick;
     @FindBy(xpath = "//div[@id='content-wrapper']//ul[@class='nav-pills nav']//a[text()=' Weekly Expiration ']")private WebElement WeeklyExpiration;
     @FindBy(xpath = "//div[@id='content-wrapper']/descendant::ng-select[@bindlabel='tin_grp_name' and @placeholder='Select TIN']/descendant::div[@role='combobox']/input[@type='text']")private WebElement Tin;
     @FindBy(xpath = "//div[@id='content-wrapper']/descendant::ng-select[@bindlabel='label_name' and @placeholder='Select Users']/descendant::div[@role='combobox']/input[@type='text']")private WebElement Users;
     @FindBy(xpath = "//button[@type='submit']")private WebElement Search;
     

    public Expiration_Weekly(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void mouseMover(WebDriver driver) {
      mouseOverAnElement(driver, Leftsidebar);
      Expirations.click();
    }
    public void clickExpirations() {
     Expirations.click();
    }
    public void clickPage() {
     PageClick.click();
    }
    public WebElement getWeeklyExpiration() {
        return WeeklyExpiration;
    }
    public WebElement getTin() {
        return Tin;
    }
    public WebElement getUsers() {
        return Users;
    }
    public WebElement getSearch() {
        return Search;
    }
    
}