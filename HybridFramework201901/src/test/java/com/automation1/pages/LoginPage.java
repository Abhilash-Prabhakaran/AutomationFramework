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
	
	@FindBy(name="username") WebElement email;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//*[@id=\"cookies-panel\"]/div/div[2]/span[1]") WebElement cookies;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/section[1]/form/p[3]/button") WebElement loginButton;

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
