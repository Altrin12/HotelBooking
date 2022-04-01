package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement click;

	@FindBy(id = "continue")
	private WebElement continue1;

	public SelectHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getContinue1() {
		return continue1;
	}
}
