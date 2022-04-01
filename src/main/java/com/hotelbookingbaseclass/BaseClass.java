package com.hotelbookingbaseclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;

	public static String value;

	public static WebDriver browserConfiguration(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clearElement(WebElement element) {
		element.clear();
	}

	public static void inputValueElement(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void close() {
		driver.close();
	}
	
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	@SuppressWarnings("deprecation")
	public static void implicitwait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}
	public static String particularData(String path,int rowIndex, int cellIndex) throws Throwable {

		File f = new File (path);	

		FileInputStream fis = new FileInputStream (f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheetAt(0);

		Row row = sheet.getRow(rowIndex);

		Cell cell = row.getCell(cellIndex);

		CellType type = cell.getCellType();

		if (type.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} 
		else if (type.equals(CellType.NUMERIC)){
			double cellValue = cell.getNumericCellValue();
			int val = (int) cellValue;
			value = String.valueOf(val);
		}
		return value;
	}
}
