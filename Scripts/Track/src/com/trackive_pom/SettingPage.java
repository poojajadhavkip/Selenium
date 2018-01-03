package com.trackive_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage 
{
	@FindBy(linkText="Change Password")
	private WebElement chngPwd;
	
	@FindBy(name="password")
	private WebElement enterPwd;
	
	@FindBy(name="password_confirmation")
	private WebElement confirmPwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitBtn;
	
	
	public SettingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterPwd(String password1,String password2) throws InterruptedException 
	{
		chngPwd.click();
		enterPwd.sendKeys(password1);
		Thread.sleep(2000);
		confirmPwd.sendKeys(password2);
		Thread.sleep(2000);
		
		if(password1.equals(password2))
		{
			submitBtn.click();
		}
		
		else
		{
			System.out.println("Wrong Pwd");
		}
	}
	
}
