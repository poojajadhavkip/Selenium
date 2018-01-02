package com.realvolve_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingInfoListBox 
{
	@FindBy(id="user_requested_subs")
	private WebElement subScription;
	
	@FindBy(id="date_month")
	private WebElement expMonth;
	
	@FindBy(id="date_year")
	private WebElement expYear;
	
	public BillingInfoListBox(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectSubScription()
	{
		subScription.click();
		Select s=new Select(subScription);
		System.out.println(subScription.getText());
		s.selectByIndex(1);
	}
	
	public void enterExpYear()
	{
		expYear.click();
		Select s=new Select(expYear);
		System.out.println(expYear.getText());
		s.selectByValue("2023");
	}

	public void enterExpMonth(String m) 
	{
		expMonth.click();
		Select s=new Select(expMonth);
		System.out.println(expMonth.getText());
		s.selectByVisibleText(m);
		
	}
}

