package com.trackive_staging_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completeTasks 
{
	//@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[1]/section/section[1]/div/div/section[1]/div")
	//@FindBy(className="checkbox")
	//@FindBy(xpath="//section[@class='hwdMtt']/div[@class='checkbox']")
	//@FindBy(className="hwdMtt")
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[1]/section/section[1]/div[2]/div/section[1]/div")
	private WebElement completeTaskBtn;
	
	public completeTasks(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void completeTask()
	{
		completeTaskBtn.click();
	}
}
