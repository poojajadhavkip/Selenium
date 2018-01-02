package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Error5 extends SignIn
{
	@FindBy(xpath="//div[contains(text(),'You have entered wrong ')]")
	private WebElement wrongEmailOrPwdErrorMsg;
	
	public Error5(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void errorMsg5()
	{
		Assert.assertTrue(wrongEmailOrPwdErrorMsg.isDisplayed());
		
		System.out.println(wrongEmailOrPwdErrorMsg.getText());
	}
}
