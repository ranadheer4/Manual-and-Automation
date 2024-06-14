package market_research;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.cps.genericUtility.IConstants;

public class CompanyProfiles {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void task() throws InterruptedException {
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://pitchbook.com/profiles/company/184026-16#overview");
	   Thread.sleep(10000);
	   driver.findElement(By.xpath("")).sendKeys("");
   
   }
   

}
