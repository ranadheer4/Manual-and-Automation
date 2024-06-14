package com.fileShare.ObjectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.BaseClass;

public class QuickShare_Homepage extends BaseClass {
	@FindBy(xpath = "//app-quickshare-file//a[@id='Send-tab']")private WebElement SendFiles;
	@FindBy(xpath = "//app-quickshare-file//a[@id='Request-tab']")private WebElement RequestFiles;
	@FindBy(xpath = "//app-quickshare-file//a[@id='My-tab']")private WebElement MyLinks;
	@FindBy(xpath = "//app-quickshare//a[@id='receive']")private WebElement Recevied;
	@FindBy(xpath = "//app-quickshare//a[@id='sent']")private WebElement Sent;
	@FindBy(xpath = "//app-quickshare//a[@id='link']")private WebElement Link;
	@FindBy(xpath = "//app-quickshare-list//img[@src='assets/images/delete(new).svg']")private WebElement Delete;
	
	@FindBy(xpath = "//app-received//span[@class='font-14']")
	private List<WebElement> recevierNames;
	@FindBy(xpath = "//app-received//span[@class='fill-control-indicator']")
    private List<WebElement> checkboxElements;
//div[@class='card border-0 p-0 mt-3 mb-0']/descendant::label[text()=' Requested by Nitin Pasula on 07/07/23 04:57 PM ']/ancestor::div[@class='card border-0 p-0 mt-3 mb-0']/descendant::label[@class='custom-control black-checkbox my-1 px-2']
	
	public QuickShare_Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSendFiles() {
		return SendFiles;
	}

	public WebElement getRequestFiles() {
		return RequestFiles;
	}

	public WebElement getMyLinks() {
		return MyLinks;
	}

	public WebElement getRecevied() {
		return Recevied;
	}

	public WebElement getSent() {
		return Sent;
	}

	public WebElement getLink() {
		return Link;
	}

	public WebElement getDelete() {
		return Delete;
	}
	
	public void clickLinkByName(String linkName) {
	    for (WebElement linkElement : recevierNames) {
	         if (linkElement.getText().equals(linkName)) {
	             linkElement.click();
	              return;
	            }
	         
	        }
	 
	    }
	public void clickCheckboxByName(String checkboxName) {
        for (WebElement checkboxElement : checkboxElements) {
            if (checkboxElement.getAttribute("Helloworld(0)").equals(checkboxName)) {
                checkboxElement.click();
                return;
            }	
        }
}
	public void selectCheckBoxRecevier(String name) {
		driver.findElement(By.xpath("//div[@class='card border-0 p-0 mt-3 mb-0']/descendant::label[text()=' "+name+" ']/ancestor::div[@class='card border-0 p-0 mt-3 mb-0']/descendant::label[@class='custom-control black-checkbox my-1 px-2']\r\n"
				+ "")).click();
	}
}
