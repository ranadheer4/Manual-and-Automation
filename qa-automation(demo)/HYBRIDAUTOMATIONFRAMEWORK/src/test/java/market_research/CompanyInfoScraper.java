package market_research;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class CompanyInfoScraper {
    
    static {
        System.setProperty(com.prakash.genericUtility.IConstants.chromeKey,com.prakash.genericUtility.IConstants.chromeValue);
    }
            @SuppressWarnings("deprecation")
            public static void main(String[] args) {
                // TODO Auto-generated method stub
                // Set up WebDriverManager to handle the chromedriver setup
                //WebDriverManager.chromedriver().setup();
                // Create a new instance of the Chrome driver
            	ChromeOptions options = new ChromeOptions();
            	options.addArguments("--remote-allow-origins=*");
            	WebDriver driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                try (FileInputStream file = new FileInputStream("C:\\Users\\RanadheerDurgi\\git\\qa-automation(demo)\\HYBRIDAUTOMATIONFRAMEWORK\\src\\test\\resources\\API_Data.xls")) {
                    Workbook workbook = new HSSFWorkbook(file);
                    Sheet sheet = workbook.getSheetAt(0);
                    // Adding headers for the company details
                    Row headerRow = sheet.getRow(0);
                    if (headerRow == null) {
                    	headerRow = sheet.createRow(0);
                    }
                    headerRow.createCell(1).setCellValue("Address");
                    headerRow.createCell(2).setCellValue("Year");
                    headerRow.createCell(3).setCellValue("Website");
                
                    // Log in to PitchBook
                    /*
                     * driver.get("https://pitchbook.com/login");
                     * driver.findElement(By.id("username")).sendKeys("your_username");
                     * driver.findElement(By.id("password")).sendKeys("your_password");
                     * driver.findElement(By.id("loginButton")).click();
                     * 
                     */
                    // Loop through each row in the Excel sheet
                    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                        Row row = sheet.getRow(i);
                        if (row == null) {
                            row = sheet.createRow(i);
                        }
                        Cell companyNameCell = row.getCell(0);
                        if (companyNameCell == null)
                            continue;
                        String companyName = companyNameCell.getStringCellValue();
                        // Search for the company profile
                        driver.get("https://pitchbook.com/profiles/search?q=" + companyName.toLowerCase().replaceAll(" ", "+"));
                        // Extract company details
                        try {
                            //driver.findElement(By.xpath("//a[@title='"+companyName+"'")).click();
                            driver.findElement(By.xpath("//a[contains(@title, '" + companyName + "')]")).click();
                            String address = driver.findElement(By.xpath("//h5[text()='Corporate Office']/following-sibling::ul")).getText();
                            String year = driver.findElement(By.xpath("//li[text()='Year Founded']/following-sibling::li")).getText();
                            String website = driver.findElement(By.xpath("//h5[text()='Website']/following-sibling::a")).getText();
                            
                            
                            // Write details back to the Excel file
                            row.createCell(1).setCellValue(address);
                            row.createCell(2).setCellValue(year);
                            row.createCell(3).setCellValue(website);
                        } catch (Exception e) {
                            System.out.println("Could not fetch details for: " + companyName);
                            e.printStackTrace();
                        }
                    }
                    // Save the updated Excel file
                    try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\RanadheerDurgi\\git\\qa-automation(demo)\\HYBRIDAUTOMATIONFRAMEWORK\\src\\test\\resources\\API_Data.xls")) {
                        workbook.write(fileOut);
                    }
                    workbook.close();
                    System.out.println("Company profile details have been updated in Nvidia_Event_Update.xlsx");
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    // Close the browser
                    driver.quit();
                }
            }
        
    }

