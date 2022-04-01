package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"my_itinerary\"]")
	private WebElement myItinerary;

	@FindBy(id = "logout")
	private WebElement logout;

	public BookedItineraryPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
}
