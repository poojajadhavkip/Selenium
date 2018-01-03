package com.trackive_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="email")
	private WebElement email; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(className="formbtn")
	private WebElement loginButtton;
	
	@FindBy(linkText="Sign Up")
	private WebElement signUp;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{	
		/*
		email.sendKeys("tester25_trackive@mailinator.com");
		password.sendKeys("password"); */
		
		email.sendKeys("pooja.jadhav@kiprosh.com");
		password.sendKeys("pooja&8844");
		
	}
	
	
	public void loginBtn() 
	{
		loginButtton.click();
		
	}
	
}
