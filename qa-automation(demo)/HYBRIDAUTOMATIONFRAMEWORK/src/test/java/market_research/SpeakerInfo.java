package market_research;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class SpeakerInfo {
    public static void main(String[] args) throws Throwable {
        // Set up Selenium WebDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        
        try {
            // Open the web page
            driver.get("https://www.nvidia.com/gtc/session-catalog/#/");
            Thread.sleep(8000);
            // Select the topic by checking the checkbox
            WebElement topicCheckbox = driver.findElement(By.xpath("//div[@class='filters-body']//following-sibling::li//button//span[text()='Industry']//preceding-sibling::span"));
            if (!topicCheckbox.isSelected()) {
                topicCheckbox.click();
            }
           // driver.findElements(By.xpath("//ul/li[@data-test='lr-filter-industry']//following-sibling::div//div[@role='listitem']"));
            scrollDown(driver, 40);
            String desiredTopic = "Telecommunications"; // Replace with the desired topic name
            Thread.sleep(3000);
            selectTopicCheckbox(driver, desiredTopic);
            System.out.println("Check box selected");
            Thread.sleep(8000);
            // Find all speaker elements
            List<WebElement> speakerElements = driver.findElements(By.xpath("XPATH_TO_SPEAKER_ELEMENTS"));

            // Create an Excel workbook and sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Speakers");

            // Create header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Speaker Name");
            headerRow.createCell(1).setCellValue("Role");
            headerRow.createCell(2).setCellValue("Company Name");

            // Iterate through each speaker element
            int rowIndex = 1;
            for (WebElement speakerElement : speakerElements) {
                // Click on the speaker element to open their information
                speakerElement.click();

                // Extract speaker information
                String speakerName = driver.findElement(By.xpath("XPATH_TO_SPEAKER_NAME")).getText();
                String speakerRole = driver.findElement(By.xpath("XPATH_TO_SPEAKER_ROLE")).getText();
                String companyName = driver.findElement(By.xpath("XPATH_TO_COMPANY_NAME")).getText();

                // Create a new row and populate with speaker information
                Row row = sheet.createRow(rowIndex++);
                row.createCell(0).setCellValue(speakerName);
                row.createCell(1).setCellValue(speakerRole);
                row.createCell(2).setCellValue(companyName);

                // Navigate back to the speakers list page
                driver.navigate().back();
            }

            // Write the data to an Excel file
            try (FileOutputStream fileOut = new FileOutputStream("SpeakersInfo.xlsx")) {
                workbook.write(fileOut);
            }

            // Close the workbook
            workbook.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
    private static void scrollDown(WebDriver driver, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }
    private static void selectTopicCheckbox(WebDriver driver, String desiredTopic) {
        // Locate all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//ul/li[@data-test='lr-filter-industry']//following-sibling::div//div[@role='listitem']"));
        
        // Iterate through the checkboxes to find the desired one
        for (WebElement checkbox : checkboxes) {
            // Scroll the checkbox into view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", checkbox);

            // Find the associated label element
          //  WebElement label = checkbox.findElement(By.xpath("following-sibling::label"));

            // Validate the label text or attribute to find the desired topic
            if (checkbox.getText().equalsIgnoreCase(desiredTopic)) {
                // Check the checkbox if it's not already selected
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
                break; // Exit the loop once the desired checkbox is found and selected
            }
        }
    }
}

