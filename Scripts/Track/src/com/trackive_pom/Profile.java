package com.trackive_pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile 
{
	@FindBy(className="arrow-down")
	private WebElement clickProfile;
	
	@FindBy(xpath="//ul[@class='cCBlFb']//li")
	private List<WebElement>  list;
	
	

	public Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPic()
	{
		clickProfile.click();
	}
	
	public void profileOption()
	{
		
		System.out.println("Size is :" +list.size());
		
		for (WebElement op : list) 
		{
			System.out.println(op.getText());
		
		}
		System.out.print("Selected option : ");
		for (WebElement op : list) 
		{
			//System.out.println(we.getText());
			if (op.getText().equals("Profile")) 
			{
				System.out.println(op.getText());
				op.click();
				
				break;
			}
			
		}
	}
	
	public void settingOption()
	{
		
		System.out.print("Selected option : ");
		for (WebElement op : list) 
		{
			//System.out.println(we.getText());
			if (op.getText().equals("Settings")) 
			{
				System.out.println(op.getText());
				op.click();
				
				break;
			}
			
		}
	}
	
	public void signOutOption()
	{
		
		System.out.print("Selected option : ");
		for (WebElement op : list) 
		{
			//System.out.println(we.getText());
			if (op.getText().equals("Sign Out")) 
			{
				System.out.println(op.getText());
				op.click();
				
				break;
			}
			
		}
	}
}
