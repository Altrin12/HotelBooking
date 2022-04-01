package com.singeltondesignpattern;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws Throwable {
		File f = new File("C:\\Users\\altri\\eclipse-workspace\\HotelBooking\\src\\main\\java\\com\\singeltondesignpattern\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getConfigUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getConfigUserName() {
		String userName = p.getProperty("userName");
		return userName;
	}
	
	public String getConfigPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getConfigCheckInDate() {
		String checkInDate = p.getProperty("checkInDate");
		return checkInDate;
	}

	public String getConfigCheckOutDate() {
		String checkOutDate = p.getProperty("checkOutDate");
		return checkOutDate;
	}

	public String getConfigFirstName() {
		String firstName = p.getProperty("firstName");
		return firstName;
	}

	public String getConfigLastName() {
		String lastName = p.getProperty("lastName");
		return lastName;
	}

	public String getConfigBillingAddress() {
		String billingAddress = p.getProperty("billingAddress");
		return billingAddress;
	}

	public String getConfigCcNumber() {
		String ccNumber = p.getProperty("ccNumber");
		return ccNumber;
	}

	public String getConfigCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
}
