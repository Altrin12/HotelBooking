package com.singeltondesignpattern;

public class FileReaderManager {

	private FileReaderManager() {
	}
	
	public static FileReaderManager getInstanceFRM() {
	FileReaderManager helper = new FileReaderManager();
		return helper;
	}

	public ConfigurationReader getInstancCR() throws Throwable {
		ConfigurationReader reader = new ConfigurationReader();
		return reader;
	}
}
