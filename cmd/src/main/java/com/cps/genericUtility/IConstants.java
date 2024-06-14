package com.cps.genericUtility;
/**
 * 
 * @author PrakashSrivastava
 *
 */
public interface IConstants 
{
	String filePath="./src/test/resources/common.properties.txt";
	String excelPath="./src/test/resources/TestData.xls";

	String chromeValue="C:\\Users\\RanadheerDurgi\\git\\cmd\\Drivers\\chromedriver.exe";
    String chromeKey="webdriver.chrome.driver";
   // String edgeKey="webdriver.edge.driver";
    //String edgeValue="C:\\Users\\VikramDanvale\\.m2\\repository\\org\\testng\\testng\\7.7.0\\qa-automation\\Drivers\\msedgedriver.exe";
	//String excelDest="./src/test/resources/TestResults.xls";
    
	String DbUrl="jdbc:mysql://localhost:3306/";
	String REPORT_PATH="./Extent Reports";
	String DBUsername="root";
	String DBPassword="root";
	int implicitlyWaitDuration=10;
	int explicitWaitDuration=10;
	int scriptTimeOutDuration=10;
	String tinL="1201-ABHRA";
	String practicename="vikdd";
	String firstname="vikram1234";
	String lastname="danvale1234";
	String cred="AA";
	String Ssn="789";
	
}
