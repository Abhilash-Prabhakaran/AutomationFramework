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
	
	@FindBy(name="LoginOrEmail") WebElement email;
	
	@FindBy(name="Password") WebElement pass;
	
	@FindBy(xpath="//*[@id=\"np-cookie-consent\"]/div[2]/a") WebElement cookies;
	
	@FindBy(xpath="//*[@id=\"loginbutton\"]") WebElement loginButton;

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
		cookies.click();
		loginButton.click();
	}
}
