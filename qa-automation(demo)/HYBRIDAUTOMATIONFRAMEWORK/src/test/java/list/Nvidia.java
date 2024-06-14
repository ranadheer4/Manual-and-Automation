package list;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Nvidia {
	
	@Test
	public void getSpeakerInfo() throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		//Open application
		driver.get("https://www.nvidia.com/gtc/session-catalog/?tab.allsessions=1700692987788001F1cG#/");
		
		//Accepting cookies
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Clicking on desired checkbox
		WebElement ele=driver.findElement(By.xpath("//span[text()='Industry']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		driver.findElement(By.xpath
				("//span[text()='Academia / Education']")).click();
		
		//Waiting for the correct page to load
//		Thread.sleep(5000);
		WebElement result=driver.findElement(By.xpath("//div[contains(text(),'Fireside Chat With')]"));
		wait.until(ExpectedConditions.elementToBeClickable(result));
		result.click();
		
		//Verify if the page is loaded
		WebElement heading=driver.findElement(By.className("sub-brand-label"));
		wait.until(ExpectedConditions.visibilityOf(heading));
		
		//Click on each speaker and get the details
		driver.findElement(By.className("speaker-info-btn")).click();
		String info=driver.findElement(By.className("speaker-name")).getText();
		driver.findElement(By.xpath("//span[@aria-label='close']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Fei-Fei')]")).click();
		String info2=driver.findElement(By.className("speaker-name")).getText();
		driver.findElement(By.xpath("//span[@aria-label='close']")).click();
		String[] sp1=info.split(",");
		String[] sp2=info2.split(",");
		
		//Calling method to write data to excel - Apache POI
		writeExcel(sp1,sp2);
	}
	
	public static void writeExcel(String[] s1, String[] s2) throws IOException {
		Object[][] speakers= {
				{"Name","Role","Company Name"},
				{s1[0],s1[1],s1[2]},
				{s2[0],s2[1],s2[2]}
		};
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Speaker details");
		int rowCount=0;
		for(Object[] sp:speakers) {
			Row row=sheet.createRow(rowCount++);
			int colCount=0;
			for(Object colField:sp) {
				Cell cell=row.createCell(colCount++);
				cell.setCellValue((String)colField);
			}
		}
		FileOutputStream output=new FileOutputStream(new File(System.getProperty("user.dir")+"\\SpeakerData.xlsx"));
		wb.write(output);
		output.close();
		wb.close();
	}

}