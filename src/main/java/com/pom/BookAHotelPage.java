package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage {
	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"first_name\"]")
	private WebElement firstName;

	@FindBy(xpath = "//*[@id=\"last_name\"]")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(xpath = "//*[@id=\"cc_num\"]")
	private WebElement ccNumber;
	
	@FindBy(xpath = "//option[@value='AMEX']")
	private WebElement cardType;

	@FindBy (xpath = "//*[@id=\"cc_exp_month\"]")
	private WebElement month;

	@FindBy(xpath = "//*[@id=\"cc_exp_month\"]/option[12]")
	private WebElement expMonth;
	
	@FindBy (xpath = "//*[@id=\"cc_exp_year\"]")
	private WebElement year;
	
	@FindBy(xpath = "//*[@id=\"cc_exp_year\"]/option[13]")
	private WebElement expYear;
	
	@FindBy(xpath = "//*[@id=\"cc_cvv\"]")
	private WebElement cvv;
	
	@FindBy(xpath = "//*[@id=\"book_now\"]")
	private WebElement bookNow;
	
	public BookAHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}
	
	public WebElement getYear() {
		return year;
	}
	
	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
}
