package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Error1 extends SignIn
{
	@FindBy(xpath="//div[contains(text(),'Incorrect Email or ')]")
	private WebElement incorrectEmailPwdErrorMsg;
	
	public Error1(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void errorMsg1()
	{
		Assert.assertTrue(incorrectEmailPwdErrorMsg.isDisplayed());
		
		System.out.println(incorrectEmailPwdErrorMsg.getText());
	}

	
}
