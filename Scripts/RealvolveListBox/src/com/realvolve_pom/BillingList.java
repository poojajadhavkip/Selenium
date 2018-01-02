package com.realvolve_pom;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingList 
{
	@FindBy(id="user_requested_subs")
	private WebElement subScription;
	
	@FindBy(id="date_month")
	private WebElement expMonth;
	
	@FindBy(xpath="//select[@id='date_month']//option")
	private List<WebElement> mon;
	
	@FindBy(id="date_year")
	private WebElement expYear;
	
	@FindBy(xpath="//select[@id='date_year']//option")
	private List<WebElement> year;
	
	public BillingList(WebDriver driver)
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
		/*		Select s=new Select(expYear);
				System.out.println(expYear.getText());
				s.selectByValue("2023");  */
		
		System.out.println(year.size());
		
		for (WebElement we : year) 
		{
			System.out.println(we.getText());
		
		}
		System.out.print("Selected month : ");
		for (WebElement we : year) 
		{
			//System.out.println(we.getText());
			if (we.getText().equals("2025")) 
			{
				System.out.println(we.getText());
				we.click();
				
				break;
			}
				
		}			
	}

	public void enterExpMonth() 
	{
		expMonth.click();
		/*	Select s=new Select(expMonth);
			System.out.println(expMonth.getText());
			s.selectByVisibleText(m);  */
		
		System.out.println(mon.size());
		
		for (WebElement we : mon) 
		{
			System.out.println(we.getText());
		
		}
		System.out.print("Selected month : ");
		for (WebElement we : mon) 
		{
			//System.out.println(we.getText());
			if (we.getText().equals("July")) 
			{
				System.out.println(we.getText());
				we.click();
				
				break;
			}
				
		}			
		
	}
}
