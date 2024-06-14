package list;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationTask {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		int Speakercount=0;
		String speakerName = null;
	    String speakerRole= null;
	    String speakerCompany=null;
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//Excel File Initialization
		HSSFWorkbook wb=new HSSFWorkbook();
 		HSSFSheet sh= wb.createSheet("SpeakerDetails");
 		HSSFRow headerRow=sh.createRow(0);
 		headerRow.createCell(0).setCellValue("Speaker Name");
 		headerRow.createCell(1).setCellValue("Speaker Role");
 		headerRow.createCell(2).setCellValue("Speaker Company");
 		
		//Launching the NVidia Site
		driver.get("https://www.nvidia.com/gtc/session-catalog/?tab.allsessions=1700692987788001F1cG#/");
		driver.manage().window().maximize();
		System.out.println("NVIDIA Browser launched successfully");
		//Handling Banner Notification window
		WebElement eleBannerNotiAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='onetrust-banner-sdk']/div[@role='alertdialog']//div[@class='ot-sdk-row']")));
		WebElement btnBannerNotiAlertIUnderstand=driver.findElement(By.xpath("//div[@id='onetrust-banner-sdk']/div[@role='alertdialog']//div[@class='ot-sdk-row']//button[2]"));
		if(eleBannerNotiAlert.isDisplayed())
		{
			btnBannerNotiAlertIUnderstand.click();
			System.out.println("Banner Notification handle successfully");
		}
		//Handling Push Notification window
		WebElement elepushNotiAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']//div[ @class='pushcrew-notification-image-wrapper-safari']")));
		WebElement btnPushNotiAlertNotNow=driver.findElement(By.xpath("//div[@role='alertdialog']//div[ @class='pushcrew-button-wrapper']/button[1]"));
		if(elepushNotiAlert.isDisplayed())
		{
			btnPushNotiAlertNotNow.click();
			System.out.println("Push Notification handle successfully");
		}
		
		//Select the checkbox [Manufacturing] for the desired topic(Industry) by Iterating through all elements
		List<WebElement> elementsTopics = driver.findElements(By.xpath("//ul[@class='filters']//button/span[2]"));
		    for (WebElement eleTopics : elementsTopics)
		    {
		        String myText = eleTopics.getText();
		        if (myText.equals("Industry")) {
		           eleTopics.click();
		           Thread.sleep(3000);
		           System.out.println(myText + "Topic expanded" );
		        }
		    }		
		    List<WebElement> elementsTopicsCatagery = driver.findElements(By.xpath("//div[@id='industry']/div/div/label/span[2]"));
		    int size=elementsTopicsCatagery.size();
		    for (WebElement eleTopicsCatagery : elementsTopicsCatagery)
		    {
		        String myTextCategory = eleTopicsCatagery.getText();
		        if (myTextCategory.equals("Manufacturing")) {
		        WebElement chkboxName=driver.findElement(By.xpath("//div[@id='industry']/div/div/label/span[2][contains(text(),'"+eleTopicsCatagery.getText()+"')]/preceding-sibling::span"));	
		        Actions actions = new Actions(driver);
		        actions.moveToElement(chkboxName);
		        actions.perform();
		        Thread.sleep(3000);
		        chkboxName.click();
		           Thread.sleep(3000);
		           System.out.println(myTextCategory + "checbox is selected" );
		        }
		    }	
		    //Display all the speakers and add them to NvidiaSpeakersDetails excel file
	        WebElement btnShowMorePrimary=driver.findElement(By.cssSelector("button.mdBtnR.mdBtnR-primary.show-more-btn"));	
	        WebElement btnEndPage=driver.findElement(By.xpath("(//div[@class='page-footer-link-set__title'])[1]"));
	        	
	        btnShowMorePrimary.click();
        	Actions actions = new Actions(driver);
	        actions.moveToElement(btnShowMorePrimary);
	        actions.perform();
	        Thread.sleep(10000);
	        actions.moveToElement(btnEndPage);
	        actions.perform();
	        btnShowMorePrimary.click();
 	        actions.moveToElement(btnShowMorePrimary);
	        actions.perform();
	        Thread.sleep(10000);
	        actions.moveToElement(btnEndPage);
	        
	        List<WebElement> elementsAllSpeakers=driver.findElements(By.xpath("//ul[@class='search-results']/li//div[@data-test='speakers-component']//p/button/span"));	
            for (WebElement eleSpeaker : elementsAllSpeakers)
		    {            	
		      Speakercount++;		      	      
		      String strSpeakerName = eleSpeaker.getText();
		      WebElement mySpeakerRoleAndCompany=driver.findElement(By.xpath("//ul[@class='search-results']/li//div[@data-test='speakers-component']//p/button/span[contains(text(),'"+strSpeakerName+"')]/ancestor::button/ancestor::p"));			      
		      String txtSpeakerRoleAndCompany = mySpeakerRoleAndCompany.getText(); 
		   	  System.out.println("FULL Speaker details->" +txtSpeakerRoleAndCompany);	
		    			    	
		    try{
	    		 int firstIndex = txtSpeakerRoleAndCompany.indexOf(',');
			     int secendIndex = txtSpeakerRoleAndCompany.indexOf(',',firstIndex+1);
			     speakerName=txtSpeakerRoleAndCompany.substring(0,firstIndex);
	    		 speakerRole=txtSpeakerRoleAndCompany.substring(firstIndex+1,secendIndex);			    	
			     speakerCompany=txtSpeakerRoleAndCompany.substring(secendIndex+1);
			     System.out.println("Speaker number ==> "+Speakercount);
			     System.out.println("Speaker Name: "+speakerName);
			     System.out.println("Speaker Role: "+speakerRole);
			     System.out.println("Speaker Company: "+speakerCompany);
			          
		         } catch(StringIndexOutOfBoundsException e) {
		             System.out.println("Speaker not coatins all the details " );
		         }
		    
		    	//Writing Data into NvidiaTestData		    	
		 		HSSFRow dataRow=sh.createRow(Speakercount);
		 		dataRow.createCell(0).setCellValue(speakerName);
		 		dataRow.createCell(1).setCellValue(speakerRole);
		 		dataRow.createCell(2).setCellValue(speakerCompany);		 		
		     }	
            FileOutputStream file=new FileOutputStream("C:\\Users\\RanadheerDurgi\\git\\qa-automation(demo)\\HYBRIDAUTOMATIONFRAMEWORK\\src\\test\\resources\\Marks.xls");
	 		try {
				wb.write(file);
			     System.out.println("All the Speakers TestData details [Name, Role and Company] are added to excel file NvidiaSpeakersDetails.xlsx");
			} catch (IOException e) {
				e.printStackTrace();
			}
	 		System.out.println("Thank YOU");
	}
}
