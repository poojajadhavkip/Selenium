package com.trackive_staging_pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileList 
{
	@FindBy(className="arrow-down")
	private WebElement profileArrowBtn;
	
	@FindBy(xpath="//ul[@class='cCBlFb']//li")
	private List<WebElement>  list;
	
	

	public ProfileList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPic()
	{
		profileArrowBtn.click();
	}
	
	public void profileOption()
	{
		
		System.out.println("Size is :" +list.size());
		
		for (WebElement option : list) 
		{
			System.out.println("Profile list is : ");
			System.out.println(option.getText());
		
		}
		System.out.print("Selected option is : ");
		for (WebElement option : list) 
		{
			//System.out.println(we.getText());
			if (option.getText().equals("Profile")) 
			{
				System.out.println(option.getText());
				option.click();
				
				break;
			}
			
		}
	}
	
	public void settingOption()
	{
		
		System.out.print("Selected option : ");
		for (WebElement option : list) 
		{
			//System.out.println(we.getText());
			if (option.getText().equals("Settings")) 
			{
				System.out.println(option.getText());
				option.click();
				
				break;
			}
			
		}
	}
	
	public void signOutOption()
	{
		
		System.out.print("Selected option : ");
		for (WebElement option : list) 
		{
			//System.out.println(we.getText());
			if (option.getText().equals("Sign Out")) 
			{
				System.out.println(option.getText());
				option.click();
				
				break;
			}
			
		}
	}
}
