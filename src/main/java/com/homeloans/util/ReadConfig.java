package com.homeloans.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties proper;

	public ReadConfig() {

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			proper = new Properties();
			proper.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = proper.getProperty("baseURL");
		return url;

	}

	public String getUserName() {
		String username = proper.getProperty("username");
		return username;

	}

	public String getPassword() {
		String password = proper.getProperty("password");
		return password;

	}

	public String getChromePath() {
		String chromepath = proper.getProperty("chromepath");
		return chromepath;

	}

}
