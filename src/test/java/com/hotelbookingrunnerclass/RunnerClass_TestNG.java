package com.hotelbookingrunnerclass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.hotelbookingbaseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;

public class RunnerClass_TestNG extends BaseClass {
	public static WebDriver driver = browserConfiguration("Chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static Logger log = Logger.getLogger(RunnerClass_TestNG.class);

	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter sparkReporter;

	@BeforeTest
	private void reportGeneration() {
		sparkReporter = new ExtentSparkReporter("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\Reports\\HotelBooking TestNG Report.html");
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
	}

	@AfterTest
	private void flush() {
		reports.flush();
	}

	@Test(priority = 1)
	private void urlLaunchDetails()throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		getUrl("https://adactinhotelapp.com/");
		log.info("Url Launch");
		deleteAllCookies();
	}

	@Test(priority = 2)
	private void loginPageDetails()throws Throwable {
		implicitwait(10, TimeUnit.SECONDS);
		inputValueElement(pom.getLP().getUsername(),particularData("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\Test Case\\Hotel Booking.xlsx",1,5));
		inputValueElement(pom.getLP().getPassword(),particularData("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\Test Case\\Hotel Booking.xlsx",2,5));
		clickOnElement(pom.getLP().getLogin());
	}

	@Test(priority = 3)
	private void SearchHotelPage()throws Throwable {
		clickOnElement(pom.getSHP().getLocation());
		clickOnElement(pom.getSHP().getHotelName());
		clickOnElement(pom.getSHP().getRoomType());
		clickOnElement(pom.getSHP().getRooms());
		clickOnElement(pom.getSHP().getCheckIn());
		clickOnElement(pom.getSHP().getCheckOut());	
		clickOnElement(pom.getSHP().getAdultRoom());
		clickOnElement(pom.getSHP().getChildrenRoom());
		clickOnElement(pom.getSHP().getSubmit());
	}

	@Test(priority = 4)
	private void SelectHotelPage()throws Throwable {
		clickOnElement(pom.getSP().getClick());
		clickOnElement(pom.getSP().getContinue1());
	}

	@Test(priority = 5)
	private void BookAHotelPage()throws Throwable {
		inputValueElement(pom.getBHP().getFirstName(),particularData("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\Test Case\\Hotel Booking.xlsx",16,5));
		inputValueElement(pom.getBHP().getLastName(),particularData("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\Test Case\\Hotel Booking.xlsx",17,5));
		inputValueElement(pom.getBHP().getAddress(),particularData("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\Test Case\\Hotel Booking.xlsx",18,5));
		inputValueElement(pom.getBHP().getCcNumber(),particularData("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\Test Case\\Hotel Booking.xlsx",18,5));	
		clickOnElement(pom.getBHP().getCardType());
		clickOnElement(pom.getBHP().getMonth());
		clickOnElement(pom.getBHP().getExpMonth());
		clickOnElement(pom.getBHP().getYear());
		clickOnElement(pom.getBHP().getExpYear());
		inputValueElement(pom.getBHP().getCvv(),particularData("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\Test Case\\Hotel Booking.xlsx",23,5));
		clickOnElement(pom.getBHP().getBookNow());
	}

	@Test(priority = 6)
	private void BookedItineraryPage()throws Throwable {
		clickOnElement(pom.getBIP().getMyItinerary());
		clickOnElement(pom.getBIP().getLogout());
		log.info("Hotel booked successfully");
		close();
	}
}

