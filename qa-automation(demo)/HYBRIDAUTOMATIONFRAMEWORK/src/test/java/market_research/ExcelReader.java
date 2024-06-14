package market_research;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	private String excelPath = System.getProperty("user.dir") + "//src//test//resources//excels//excel1.xls";

	public void getAllDataFromExcel() {
		try {
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			int sheets = wb.getNumberOfSheets();
			System.out.println("Sheets: " + sheets);
			for (int sheetIndex = 0; sheetIndex < sheets; sheetIndex++) {
				Sheet sh = wb.getSheetAt(sheetIndex);
				System.out.println("Sheet name: " + sh.getSheetName());
				int rows = sh.getLastRowNum() + 1;
				for (int i = 0; i < rows; i++) {
					Row row = sh.getRow(i);
					if (row != null) {
						Short lastCellNum = row.getLastCellNum();
						if (lastCellNum == -1) {
							System.out.println("Empty row at index " + i);
							continue;
						}
						int cols = lastCellNum;
						for (int j = 0; j < cols; j++) {
							Cell cell = row.getCell(j);
							if (cell != null) {
								switch (cell.getCellType()) {
								case STRING:
									System.out.print(cell.getStringCellValue() + "\t");
									break;
								case NUMERIC:
									if (DateUtil.isCellDateFormatted(cell)) {
										System.out.print(cell.getDateCellValue() + "\t");
									} else {
										System.out.print(cell.getNumericCellValue() + "\t");
									}
									break;
								case BOOLEAN:
									System.out.print(cell.getBooleanCellValue() + "\t");
									break;
								case FORMULA:
									System.out.print(cell.getCellFormula() + "\t");
									break;
								case BLANK:
									System.out.print("BLANK\t");
									break;
								default:
									System.out.print("UNKNOWN TYPE\t");
									break;
								}
							} else {
								System.out.print("NULL\t");
							}
						}
						System.out.println();
					} else {
						System.out.println("NULL ROW");
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ExcelReader().getAllDataFromExcel();
	}

}
