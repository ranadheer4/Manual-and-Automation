package market_research;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyProfileScraper {


    public static void main(String[] args) throws IOException, Throwable {

        String ceo;

        // Set up WebDriver
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
//                        + "//src//main//java//rahulshettyacademy//resources//chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Path to the Excel file
        String excelFilePath = "C:\\Users\\RanadheerDurgi\\git\\qa-automation(demo)\\HYBRIDAUTOMATIONFRAMEWORK\\Rusell.xls";

        // Open the Excel file
        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new HSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // Loop through each row in the first column (Company Name)
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            Cell companyNameCell = row.getCell(0);

            if (companyNameCell != null) {
                String companyName = companyNameCell.getStringCellValue();

                // Search for the company on the webpage
                driver.get("https://pitchbook.com/profiles");
                WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search Profiles']"));
                searchBox.sendKeys(companyName);
                searchBox.submit();

                // Wait for the search results to load and display the results
                // This is a simple wait. You may need to use WebDriverWait for more complex scenarios.
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                
                List<WebElement> links = driver.findElements(By.tagName("a"));
                System.out.println("sizes" +links.size());
                
                String expectedTitle = companyName;
                Thread.sleep(1000);
                
                for (WebElement link : links) {
                	
                    if (link.getAttribute("title").equals(expectedTitle)) { 
                    	System.out.println(link.getText());
                        link.click(); 
                        break; 
                    }
                }
                
                /**List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class,'flex-justify-center')]//a"));
                result.stream().filter(s->s.getAttribute("title").equals(companyName)).findFirst()
                        .ifPresent(WebElement::click);
                Thread.sleep(3000);
                **/
                
                
                
                // Locate the elements containing the required information
                List<WebElement> addressList = driver.findElements(By.id("//h5[text()='Corporate Office']//following-sibling::ul//li"));
                Thread.sleep(2000);
                WebElement yearElement = driver.findElement(By.id("//li[text()='Year Founded']//following-sibling::li"));
                Thread.sleep(2000);
                WebElement websiteElement = driver.findElement(By.id("//h5[text()='Website']//following-sibling::a"));
                Thread.sleep(2000);
                WebElement employeesElement = driver.findElement(By.id("//li[text()='Employees']//following-sibling::li"));
                try {
                    WebElement ceoElement = driver.findElement(By.id("//h3[contains(text(),'Who is the CEO')]//following-sibling::p"));
                     ceo= ceoElement.getText();
                }
                catch(NoSuchElementException e){
                    ceo="CEO not Provided";

                }
                // Get the text from those elements
                String address = addressList.stream().map(s->s.getText()).collect(Collectors.joining());
                String year = yearElement.getAttribute("title");
                String website = websiteElement.getAttribute("href");
                String employees = employeesElement.getAttribute("title");


// Write the data back into the Excel file
                row.createCell(1).setCellValue(address);
                row.createCell(2).setCellValue(year);
                row.createCell(3).setCellValue(website);
                row.createCell(4).setCellValue(employees);
                row.createCell(5).setCellValue(ceo);
            }
        }

        // Close the input stream
        fis.close();

        // Write the output to the Excel file
        FileOutputStream fos = new FileOutputStream(excelFilePath);
        workbook.write(fos);
        fos.close();

        // Close the workbook
        workbook.close();

        // Close the WebDriver
        driver.quit();
    }
}
