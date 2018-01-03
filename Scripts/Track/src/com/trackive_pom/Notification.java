package com.trackive_pom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notification 
{
	@FindBy(xpath="//i[@class='pe-7s-bell']")
	private WebElement notificationLogo;
	
	@FindBy(xpath="//ul[@class='eKcsBl']//li")
	private List<WebElement> notificationList;

	public Notification(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void clickNotiLogo() throws InterruptedException
	{
		notificationLogo.click();
		Thread.sleep(2000);
		System.out.println("Total Notifications are : " + notificationList.size());
		Thread.sleep(2000);
		
		for(int i=1;i<=notificationList.size();i=i+1)
		{
			if(i==4)
			{
				notificationList.get(i).click();
				//System.out.println(notificationList.get(i).getText());
				break;
			}
			
		} 
		
		System.out.println("Successful");
	}	
	 /*
	public void getNotification()
	{
		
		for(int i=1;i<=notificationList.size();i++)
		{
			if(i==5)
			{
				notificationList.get(5).click();
				//System.out.println(notificationList.get(i).getText());
				break;
			}
		} 
		
		
		/*
		for (WebElement rv : notificationList) 
		{
			System.out.println(rv.getText());
			System.out.println();
			
			for (int i = 1; i <= notificationList.size() ; i++) 
			{
				if(i==1)
				{
					rv.click();
					System.out.println("Notification : " + rv.getText());
				}
			}	
		}	
	} */	
}
