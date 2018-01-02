package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SgnUpPage extends SignIn
{
	@FindBy(name="subdomain")
	private WebElement subDomain;
	
	public SgnUpPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterDomain(String dm)
	{
		subDomain.sendKeys(dm);
	}
	
}
