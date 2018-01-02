package com.trackive_next_pom;

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
	
	@FindBy(linkText="Sign Up")
	private WebElement signUp;
	
	@FindBy(linkText="Forgot Password?")
	private WebElement forgetPwd;
	
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String em,String pwd)
	{
		email.sendKeys(em);
		password.sendKeys(pwd);
		
	}
	
	public void clearEmailPwd()
	{
		email.clear();
		password.clear();
	}
	
	
	public void signUpClick() 
	{
		signUp.click();
	}

	public void loginBtn() 
	{
		loginButtton.click();
		
	}
	
	public void forgetPassword()
	{
		forgetPwd.click();
	}
}