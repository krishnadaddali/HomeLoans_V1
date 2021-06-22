package com.homeloans.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.homeloans.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

		logger.info("URL is Opended");

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		System.out.println(driver.getTitle());

		//Guru99 Bank Manager HomePage
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed ");
		} else {
			
			captureScreen( driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed ");
		}
	}
}
