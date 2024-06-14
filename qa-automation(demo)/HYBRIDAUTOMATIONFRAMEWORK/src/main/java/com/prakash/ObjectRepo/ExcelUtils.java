package com.prakash.ObjectRepo;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {
    public static List<String> getCompanyNamesFromExcel(String filePath) throws IOException {
        List<String> companyNames = new ArrayList();
        FileInputStream fis = new FileInputStream("C:\\Users\\RanadheerDurgi\\git\\qa-automation(demo)\\HYBRIDAUTOMATIONFRAMEWORK\\src\\test\\resources\\DataRepo\\TestData.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(2); // Assuming data is in the first sheet

        for (Row row : sheet) {
            if (row.getRowNum() != 0) { // Skip the header row
                companyNames.add(row.getCell(1).getStringCellValue()); // Read the second column
            }
        }

        workbook.close();
        fis.close();
        return companyNames;
    }
}