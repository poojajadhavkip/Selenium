package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Error4 extends SignIn
{
	@FindBy(xpath="//div[contains(text(),'Password must be atleast 5 ')]")
	private WebElement passwordErrorMsg; 
	
	public Error4(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	public void errorMsg4() 
	{
		Assert.assertTrue(passwordErrorMsg.isDisplayed());
		
		System.out.println(passwordErrorMsg.getText());
		
	}
}
