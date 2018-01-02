package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPwdLink 
{
	@FindBy(xpath="//a[contains(text(),'Click ')]")
	private WebElement clickHere;
	
	public ResetPwdLink(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickHereLink()
	{
		clickHere.click(); 
	}
}
