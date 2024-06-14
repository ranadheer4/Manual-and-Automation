package market_research;

import com.prakash.ObjectRepo.EditGeneralInfoPage;
import com.prakash.ObjectRepo.ExcelUtils;
import com.prakash.ObjectRepo.HomePage;
import com.prakash.genericUtility.BaseClass;
import com.prakash.genericUtility.IConstants;

import ranadheer.Search_Profile_Page;

import java.io.IOException;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.prakash.genericUtility.ItestListenerImtn.class)
	public class Company_Profiles extends BaseClass {
		static {
			System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
		}
		
	    @Test(priority=1)
	    public void task() throws InterruptedException
	    {
	    	Search_Profile_Page sf = new Search_Profile_Page(driver);
	    	sf.getAccept().click();
	    	sf.getSearchOption().sendKeys(eLib.readDataFromExcel("Company_List", 2, 0));  	
	    
	    	sf.getClickSubmit().click();
	    	sf.clickCompanyProfile("AI21 labs");
	    	Thread.sleep(3000);
	    	System.out.println("Company_Launched");
	    	sf.extractCEONames("CEO");
	    	Thread.sleep(2000);
	    	
	        /**EditGeneralInfoPage egi=new EditGeneralInfoPage(driver);
	        egi.getClickAdmin().click();
	        egi.clickOrganization(driver);
	        egi.getEdit().click();
	        egi.getPhone().clear();
	        egi.getPhone().sendKeys(eLib.readDataFromExcel("Orange1_EditGenInfo", 1, 0));
	        egi.selectCountry(eLib.readDataFromExcel("Orange1_EditGenInfo", 1, 1));
	        egi.getSave().click();
	        Reporter.log("Successfully Edited--priority=1",true);
	        HomePage hpage=new HomePage(driver);
	        hpage.getWelComeAbc().click();
	        hpage.getLgoutLink().click();**/
	    	
	     }
	   
}
