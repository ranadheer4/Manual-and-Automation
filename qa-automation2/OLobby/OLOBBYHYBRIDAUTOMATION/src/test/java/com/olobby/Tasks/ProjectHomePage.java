package com.olobby.Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.ProjectHomePage2;
import com.TaskManagement.ObjRepo.TaskManagement;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class ProjectHomePage extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void projectHomepageElements() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getTaskManageMent().click();
	   Thread.sleep(5000);
	   TaskManagement t = new TaskManagement(driver);
	   Thread.sleep(6000);
	   t.getProjectClicik().click();
	   
	   ProjectHomePage2 php = new  ProjectHomePage2(driver);
	   List<WebElement>rows=driver.findElements(By.xpath("//table[@class='dx-treelist-table dx-treelist-table-fixed']//tbody[@role='presentation']/tr"));
	   System.out.println("No of rows are:" +rows.size());
	   Thread.sleep(6000);
	   for(WebElement eachrow:rows) {
		   List<WebElement>cols=eachrow.findElements(By.tagName("td"));
		   //Iterate all ceells
		   for (WebElement eachcell:cols) {
			   String celldata=eachcell.getText();
			   Thread.sleep(6000);
			     if(celldata.equals("On-Boarding")) {
			  	   
			    	 eachcell.click();
			    	 break;
			     }

		   }
	   }
				   
	   }
	   
   }
  
//  for(int i=1;i<rows.size();i++) {
//	   //get cols collection from each row
//	   List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
//	   Thread.sleep(6000);
//	   System.out.println("rows No. "+i+"  "+"cols in each row::"+cols.size());
	
	// List<WebElement>cols=driver.findElements(By.xpath(""));
	   //System.out.println("No of rows are:" +cols.size());

//to print cells and rows data
//Thread.sleep(5000);
//System.out.println("\n"+celldata);


	   
	   
	   
	   
//	   php.getShowFullScreen().click();
//	   Thread.sleep(6000);
//	   php.getExport().click();
	   
	
  