package com.trackive_staging_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn 
{
	@FindBy(name="email")
	private WebElement email; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(className="formbtn")
	private WebElement loginButtton;
	
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void emailPwd(String em,String pwd)
	{
		email.sendKeys(em);
		password.sendKeys(pwd);
	}
	
	public void logInBtn()
	{
		loginButtton.click();
	}
}
