package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Error2 extends SignIn
{
	@FindBy(xpath="//div[contains(text(),'The Email field is ')]")
	private WebElement emailErrorMsg;
	
	public Error2(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void errorMsg2()
	{
		Assert.assertTrue(emailErrorMsg.isDisplayed());
		
		System.out.println(emailErrorMsg.getText());
	}
}
