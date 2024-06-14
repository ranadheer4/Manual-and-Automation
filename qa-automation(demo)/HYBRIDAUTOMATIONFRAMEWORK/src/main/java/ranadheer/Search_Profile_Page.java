package ranadheer;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.prakash.genericUtility.WebDriverUtility;


	public class Search_Profile_Page extends WebDriverUtility {
		
		@FindBy(xpath="//input[@placeholder='Search profile previews']")private WebElement searchbar;
		@FindBy(xpath = "//div[@id='onetrust-banner-sdk']//button[text()='Accept All Cookies']")private WebElement acceptCookies;
		@FindBy(xpath = "//button[@type='submit']")private WebElement searchSubmit;
		@FindBy(tagName =  "a")private List<WebElement> companyNames;
		@FindBy(tagName = "li")private List<WebElement> liElements;
		
		
		public Search_Profile_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getSearchOption() {
			return searchbar;
		}
		
		public WebElement getAccept() {
			return acceptCookies;
		
		}
		public WebElement getClickSubmit() {
			return searchSubmit;
		}
		
	    // Method to get all company names
	    public List<WebElement> getAllCompanyNames() {
	        return companyNames;
	    }
	    String exptName="ai21 labs";
	    // Method to click on the company profile with the specified name
	    public void clickCompanyProfile(String companyName) {
	        for (WebElement companyElement : getAllCompanyNames()) {
	            if (companyElement.getAttribute("title").equalsIgnoreCase(companyName)) {
	                companyElement.click();
	                break;
	            }
	        }}
	    public List<WebElement> getExtr() {
	        return liElements;
	    }
	    public void extractCEONames(String extrct) {
	         for (WebElement liElement : getExtr()) {
	             if (liElement.getText().contains(extrct)) {
	                    WebElement pElement = liElement.findElement(By.tagName("p"));
	                    String ceoName = pElement.getText();
	                    System.out.println("CEO Name: " + ceoName);
	                    
	                }
	            }
	        
	    }
	    
	}