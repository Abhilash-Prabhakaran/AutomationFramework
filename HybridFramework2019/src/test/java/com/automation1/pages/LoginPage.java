package com.automation1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="login") WebElement email;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//input[@value='Sign In']") WebElement loginButton;

	public void appLogin(String usernameApplication,String passwordApplication)
	{
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		
		email.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
}
