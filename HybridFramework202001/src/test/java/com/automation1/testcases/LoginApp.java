package com.automation1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation1.pages.BaseClass;
import com.automation1.pages.LoginPage;
import com.automation1.utility.BrowserFactory;
import com.automation1.utility.ExcelDataProvider;
import com.automation1.utility.Helper;

public class LoginApp extends BaseClass

{
	
	
	@Test
	public void logApp()
	{
	
	logger=report.createTest("appLogin");
	
	LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
	
	logger.info("Starting application");
	
	loginPage.appLogin(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
	
	logger.pass("Login Success");
	
	
	}
	
	
}
