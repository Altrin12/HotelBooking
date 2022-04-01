package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.BookAHotelPage;
import com.pom.BookedItineraryPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelectHotelPage;

public class PageObjectManager {

	public WebDriver driver;

	private LoginPage LP;

	private SearchHotelPage SHP;

	private SelectHotelPage SP;

	private BookAHotelPage BHP;

	private BookedItineraryPage BIP;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginPage getLP() {
		if (LP==null) {
			LP = new LoginPage(driver);
		}
		return LP;
	}

	public SearchHotelPage getSHP() {
		if (SHP==null) {
			SHP = new SearchHotelPage(driver);
		}
		return SHP;
	}

	public SelectHotelPage getSP() {
		if (SP==null) {
			SP = new SelectHotelPage(driver);
		}
		return SP;
	}

	public BookAHotelPage getBHP() {
		if (BHP==null) {
			BHP = new BookAHotelPage(driver);
		}
		return BHP;
	}

	public BookedItineraryPage getBIP() {
		if (BIP==null) {
			BIP = new BookedItineraryPage(driver);
		}
		return BIP;
	}
}
