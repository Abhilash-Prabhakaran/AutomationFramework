package com.automation1.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation Framework\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dribbble.com/session/new");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("login")).sendKeys("abhilash.softwareqa@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Letsenjoy5342#");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.quit();
	}

}
