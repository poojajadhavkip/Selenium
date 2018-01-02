package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPwd extends SignIn
{
	@FindBy(name="email")
	private WebElement reEmail; 
	
	@FindBy(xpath="//button[contains(text(),'Send Password Reset ')]")
	private WebElement sendEmail;
	
	public ForgetPwd(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email)
	{
		reEmail.sendKeys(email);
	}
	
	public void clickSendPwd()
	{
		sendEmail.click();
	}
}
