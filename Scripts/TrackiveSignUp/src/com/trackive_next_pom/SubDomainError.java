package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SubDomainError 
{
	@FindBy(xpath="//div[contains(text(),'The Subdomain field is ')]")
	private WebElement subDomainErr;
	
	public SubDomainError(WebDriver driver)
	{
		//super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void subDomainErrMsg()
	{
		Assert.assertTrue(subDomainErr.isDisplayed());
		System.out.println(subDomainErr.getText());
	}
}

