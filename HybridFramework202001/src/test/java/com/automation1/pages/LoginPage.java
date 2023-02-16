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
	
	@FindBy(xpath="//*[@id=\"site-header\"]/div[1]/div/div[1]/div[2]/div/div/div[1]/button[1]") WebElement LogIn;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/div/div/label[1]/input") WebElement email;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/div/div/label[2]/input") WebElement pass;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/div/div") WebElement loginButton;

	public void appLogin(String usernameApplication,String passwordApplication)
	{
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			
		}
		
		LogIn.click();
		email.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
}
