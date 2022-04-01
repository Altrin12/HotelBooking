package com.hotelbookingrunnerclass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.hotelbookingbaseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;
import com.singeltondesignpattern.FileReaderManager;

public class RunnerClass_SDP extends BaseClass{
	public static WebDriver driver = browserConfiguration("Chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static Logger log = Logger.getLogger(RunnerClass_SDP.class);
	
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		getUrl(FileReaderManager.getInstanceFRM().getInstancCR().getConfigUrl());
		log.info("Url Launch");
		deleteAllCookies();
		
		implicitwait(10, TimeUnit.SECONDS);
		inputValueElement(pom.getLP().getUsername(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigUserName()));
		inputValueElement(pom.getLP().getPassword(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigPassword()));
		clickOnElement(pom.getLP().getLogin());

		clickOnElement(pom.getSHP().getLocation());
		clickOnElement(pom.getSHP().getHotelName());
		clickOnElement(pom.getSHP().getRoomType());
		clickOnElement(pom.getSHP().getRooms());
		clickOnElement(pom.getSHP().getCheckIn());
		clickOnElement(pom.getSHP().getCheckOut());	
		clickOnElement(pom.getSHP().getAdultRoom());
		clickOnElement(pom.getSHP().getChildrenRoom());
		clickOnElement(pom.getSHP().getSubmit());

		clickOnElement(pom.getSP().getClick());
		clickOnElement(pom.getSP().getContinue1());

		inputValueElement(pom.getBHP().getFirstName(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigFirstName()));
		inputValueElement(pom.getBHP().getLastName(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigLastName()));
		inputValueElement(pom.getBHP().getAddress(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigBillingAddress()));
		inputValueElement(pom.getBHP().getCcNumber(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigCcNumber()));	
		clickOnElement(pom.getBHP().getCardType());
		clickOnElement(pom.getBHP().getMonth());
		clickOnElement(pom.getBHP().getExpMonth());
		clickOnElement(pom.getBHP().getYear());
		clickOnElement(pom.getBHP().getExpYear());
		inputValueElement(pom.getBHP().getCvv(),(FileReaderManager.getInstanceFRM().getInstancCR().getConfigCvv()));
		clickOnElement(pom.getBHP().getBookNow());

		clickOnElement(pom.getBIP().getMyItinerary());
		clickOnElement(pom.getBIP().getLogout());
		log.info("Hotel booked successfully");
		close();
	}
}
