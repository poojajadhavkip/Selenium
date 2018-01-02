package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpErrorMsgs extends SgnUpPage
{
	@FindBy(xpath="//div[contains(text(),'Subdomain has already ')]")
	private WebElement subDomError;
	
	@FindBy(xpath="//div[contains(text(),'The Subdomain field is ')]")
	private WebElement subDomainErr;
	
	@FindBy(xpath="//div[contains(text(),'The Email field is ')]")
	private WebElement emailErrorMsg;
	
	public SignUpErrorMsgs(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void subDomainError() 
	{
		Assert.assertTrue(subDomError.isDisplayed());
		System.out.println(subDomError.getText());
		
	}
	
	public void subDomainErrMsg()
	{
		Assert.assertTrue(subDomainErr.isDisplayed());
		System.out.println(subDomainErr.getText());
	}
	
	public void errorMsg2()
	{
		Assert.assertTrue(emailErrorMsg.isDisplayed());
		
		System.out.println(emailErrorMsg.getText());
	}
}
