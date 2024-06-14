package com.cps.genericUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.cps.ObjectRepository.CmdHomePage;
import com.cps.ObjectRepository.CmdLoginPage;

public class BaseClass {
	public static WebDriver sdriver;
	public WebDriver driver;
	public DataBaseUtility dLib=new DataBaseUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public FileUtility fLib=new FileUtility();
	public WebDriverUtility  wLib=new WebDriverUtility();
	public JavaUtility jLib=new JavaUtility();
	/**
	 * connecting to database
	 */
	/*@BeforeSuite
	public void dbConfig()
	{
		dLib.connectToDB();
	}*/
	/**
	 * launching the browser
	 * @throws Throwable
	 */
	//@Parameters("BROWSER")
	@BeforeClass
	public void launchTheBrowser()
	{  
		String BROWSER = null;
		try {
			BROWSER = fLib.getPropertKeyValue("browser");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(BROWSER);
		String URL = null;
		try {
			URL = fLib.getPropertKeyValue("url");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();	
		}else if(BROWSER.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			driver=new ChromeDriver(co);
			
		}
		else  {
			driver=new ChromeDriver();
		}
        System.out.println("Browser successfully launched");	
      //implicitly wait
        sdriver=driver;
        wLib.waitForPageToLoad(driver);
        //enter the URL of the Application
        sdriver.get(URL);
        //maximize the screen
        driver.manage().window().maximize();
	}
	/**
	 * login to application
	 */
	@BeforeMethod
	public void loginToAppln(){
		String USERNAME = null;
		try {
			USERNAME = fLib.getPropertKeyValue("username");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		String PASSWORD = null;
		try {
			PASSWORD = fLib.getPropertKeyValue("password");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		CmdLoginPage lpage=new CmdLoginPage(driver);
		lpage.enterUsername(USERNAME);
		lpage.enterPassword(PASSWORD);
		lpage.clickLoginBtn();
		System.out.println("Login successful");
	}
	/**
	 * logout from application
	 */
	@AfterMethod
	public void logoutFromAppln(){
		CmdHomePage hpage=new CmdHomePage(driver);
		hpage.getSignOut().click();
		hpage.getLogoutLink().click();
		System.out.println("Logout successful");
	}
	/**
	 * close the browser
	 */
	@AfterClass
	public void closeTheBrowser(){
		driver.quit();
		System.out.println("Browser successfully closed");
	}
	/**
	 * close database configuration
	 */
	
}
