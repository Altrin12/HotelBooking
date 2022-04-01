package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public WebDriver driver;

	@FindBy(xpath = "//option[@value='Los Angeles']")
	private WebElement location;

	@FindBy(xpath = "//option[@value='Hotel Hervey']")
	private WebElement hotelName;

	@FindBy(xpath = "//option[@value='Super Deluxe']")
	private WebElement roomType;
	
	@FindBy(xpath = "(//option[@value='1'])[1]")
	private WebElement rooms;
	
	@FindBy(xpath = "//*[@id=\"datepick_in\"]")
	private WebElement checkIn;
	
	@FindBy(xpath = "//*[@id=\"datepick_out\"]")
	private WebElement checkOut;
	
	@FindBy(xpath = "(//option[@value='1'])[2]")
	private WebElement adultRoom;
	
	@FindBy(xpath = "//*[@id=\"child_room\"]/option[1]")
	private WebElement childrenRoom;
	
	@FindBy(id = "Submit")
	private WebElement submit;
	
	public SearchHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
