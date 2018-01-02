package com.trackive_next_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPwd 
{
	@FindBy(xpath="//input[placeholder='Enter new Password']")
	private WebElement newPwd;
	
	@FindBy(xpath="//button[contains(text(),'Reset ')]")
	private WebElement resetPwdBtn;
	
	public ResetPwd(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void enterPwd(String pwd2)
	{
		newPwd.sendKeys(pwd2);
	}
	
	public void clickReset()
	{
		resetPwdBtn.click();
	}
}
