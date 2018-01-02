package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Error3 extends SignIn
{

	@FindBy(xpath="//div[contains(text(),'The Email format ')]")
	private WebElement emailFormatErrorMsg;
	
	public Error3(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void errorMsg3()
	{
		Assert.assertTrue(emailFormatErrorMsg.isDisplayed());
		
		System.out.println(emailFormatErrorMsg.getText());
	}
}
