package com.trackive_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Help 
{
	@FindBy(xpath="//textarea[@placeholder='Help I Need']")
	private WebElement helpNeed;
	
	//@FindBy(className="Select-arrow-zone")
	//@FindBy(xpath="//section//div[@class='clearfix cobZKB']//span[@clasName='Select-arrow-zon']")
	//@FindBy(xpath="//span[@class='Select-arrow-zone']/../../../../../ancestor::html")
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[2]/section/section[2]/div/section/div/div/div/span[1]/div[1]")
	private WebElement meetTime;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[1]/section/section[2]")
	private WebElement update2;
	
	public Help(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterHelp(String hl)
	{
		helpNeed.sendKeys(hl);
	}
	/* //button[@contains(text(),'Add Update')] */
	
	//html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[3]/section/section[2]
	public void enterHelpTime(String t) 
	{
		meetTime.click();
		meetTime.sendKeys(t);
		meetTime.sendKeys(Keys.ENTER);
	}

	public void clickHelpUpdate() 
	{
		update2.click();
	}
}
