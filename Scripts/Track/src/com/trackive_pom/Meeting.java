package com.trackive_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Meeting
{
	@FindBy(xpath="//textarea[@placeholder='Meeting I am Planning']")
	private WebElement meet;
	
	//@FindBy(className="Select-arrow-zone")
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[3]/section/section[2]/div/section/div/div/div/span[1]/div[1]")
	private WebElement meetTime;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/div/div[1]/div[1]")
	private WebElement update3;
	
	public Meeting(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMeetDetails(String md)
	{
		meet.sendKeys(md);
	}
	/* //button[@contains(text(),'Add Update')] */
	
	//html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[3]/section/section[2]
	public void enterMeetTime(String t) 
	{
		meetTime.click();
		meetTime.sendKeys(t);
		meetTime.sendKeys(Keys.ENTER);
	}

	public void clickMeetUpdate() 
	{
		update3.click();
	}
}
