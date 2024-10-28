package market_research;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Write_Read_Data {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		/**ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--lang=en");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver(options);**/
		//Please add below code for driver intialization and reslove issue
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		//waiting for the slowly loading webpage set the 
		option.setPageLoadStrategy(PageLoadStrategy.NONE);
		driver = new ChromeDriver(option);//clear all cookies from the browser session
		driver.manage().deleteAllCookies();
		//Comment the below line in the code//System.setProperty("webdriver.chrome.driver", "path");

		getData();
		driver.close();
	}

	private static void getData() throws IOException, InterruptedException {
		
		String excelpath="C:\\Users\\RanadheerDurgi\\git\\qa-automation(demo)\\HYBRIDAUTOMATIONFRAMEWORK\\Rusell.xls";
		FileInputStream fis= new FileInputStream(excelpath);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet=workbook.getSheetAt(0);
		Iterator<Row> rows=sheet.iterator();
		Row firstRow=rows.next();
		
		int i=1;
		while(rows.hasNext()) {
			Row getRow = sheet.getRow(i);
			Iterator<Cell> cell=getRow.iterator();	
			Cell c=cell.next();
			String CompanyName=c.getStringCellValue();
			driver.get("https://pitchbook.com/profiles");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='q']")).sendKeys(CompanyName,Keys.ENTER);
			Thread.sleep(5000);
			WebElement companyLocater=driver.findElement(By.xpath("//a[contains(@title,'"+CompanyName+"')]"));
			String companyNameInPage=companyLocater.getAttribute("title");
			try {
				if(companyNameInPage.contains(CompanyName)) {
					//Click on Company Name
					companyLocater.click();
			//Get Address
			List<WebElement> addressLine=driver.findElements(By.xpath("//h5[text()='Corporate Office']/parent::div/ul/li"));
			String address="";
			for(WebElement a:addressLine) {
				String add=a.getText();
				address=address+" "+add;
			}
			Cell addressCell=getRow.createCell(1);
			addressCell.setCellValue(address);
			
			//Get Year
			try {
			String year=driver.findElement(By.xpath("//li[text()='Year Founded']/following-sibling::li")).getText();
			Cell yearCell=getRow.createCell(2);
			yearCell.setCellValue(year);
			}
			catch(Exception e) {
				Cell yearCell=getRow.createCell(2);
				yearCell.setCellValue("Year not found in company site");
			}
			
			//Get Website
			try {
			String website=driver.findElement(By.xpath("//h5[text()='Website']/following-sibling::a")).getAttribute("href");
			Cell websitCell=getRow.createCell(3);
			websitCell.setCellValue(website);
			}
			catch(Exception e) {
				Cell websitCell=getRow.createCell(3);
				websitCell.setCellValue("Website not found in company site");
			}
			
			//Get Employee count
			try {
			String employeeCount=driver.findElement(By.xpath("//li[text()='Employees']/following-sibling::li")).getText();
			Cell employeeCell=getRow.createCell(4);
			employeeCell.setCellValue(employeeCount);
			}
			catch(Exception e){
				Cell employeeCell=getRow.createCell(4);
				employeeCell.setCellValue("Employees count not found in company site");
			}
			
			//Get CEO details
			try {
			String ceoText=driver.findElement(By.xpath("//p[contains(text(),'is the CEO of ')]")).getText();
			String[] ceo=ceoText.split("is");
			Cell ceoCell=getRow.createCell(5);
			ceoCell.setCellValue(ceo[0]);
			}
			catch(Exception e){
				Cell ceoCell=getRow.createCell(5);
				ceoCell.setCellValue("CEO not found in company site");
			}
				}
			}catch(Exception e) {
				Cell addressCell=getRow.createCell(1);
				addressCell.setCellValue("Compnay not found");
				Cell yearCell=getRow.createCell(2);
				yearCell.setCellValue("Compnay not found");
				Cell websitCell=getRow.createCell(3);
				websitCell.setCellValue("Compnay not found");
				Cell employeeCell=getRow.createCell(4);
				employeeCell.setCellValue("Compnay not found");
				Cell ceoCell=getRow.createCell(5);
				ceoCell.setCellValue("Compnay not found");
			
			}
			
			//Navigate to Next Page row
			rows.next();
			FileOutputStream fo = new FileOutputStream("C:\\Users\\RanadheerDurgi\\git\\qa-automation(demo)\\HYBRIDAUTOMATIONFRAMEWORK\\Rusell.xls");
			workbook.write(fo);
			fis.close();
			fo.close();
			i++;
		}
	}

}
