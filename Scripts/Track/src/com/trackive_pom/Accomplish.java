package com.trackive_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accomplish 
{
	@FindBy(xpath="//textarea[@placeholder='I will Accomplish']")
	private WebElement accomplish;
	
	@FindBy(className="Select-control")
	private WebElement taskTime;
	
	@FindBy(className="ljpmUn")
	private WebElement update;
	
	public Accomplish(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterTask(String task)
	{
		accomplish.sendKeys(task);
	}
	/* //button[@contains(text(),'Add Update')] */
	public void enterTime(String t) 
	{
		taskTime.click();
		taskTime.sendKeys(t);
		taskTime.sendKeys(Keys.ENTER);
		
	}
	
	public void clickUpdate()
	{
		update.click();
	}
}
