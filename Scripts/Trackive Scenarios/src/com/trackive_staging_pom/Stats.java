package com.trackive_staging_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stats 
{
	//@FindBy(xpath="//div[@class='ezBsgE']")
	//@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/section/section/div[2]/section[1]/section/div[1]")
	//@FindBy(className="ezBsgE")
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/section/section/div[2]/section[1]/section/div[1]")
	private WebElement planned;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/section/section/div[2]/section[2]/section/div[1]/span")
	private WebElement completedTaskNumbers;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/section/section/div[2]/section[2]/section/div[1]")
	private WebElement completedTask;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/section/section/div[3]/section[1]/section/div[1]/span")
	private WebElement approvedTaskNumbers;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/section/section/div[3]/section[1]/section/div[1]")
	private WebElement approvedTask;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/section/section/div[3]/section[2]/section/div[1]/span")
	private WebElement rejectedTaskNumbers;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/section/section/div[3]/section[2]/section/div[1]")
	private WebElement rejectedTask;
	
	

	public Stats(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String plannedTasks()
	{
		return planned.getText();	
	}
	
	public String completedTasks()
	{
		System.out.println("completed Task :" +completedTask.getText());
		
		return completedTaskNumbers.getText();
	}
	
	public String approvedTasks()
	{
		System.out.println("Approved Tasks : " + approvedTask.getText());
		
		return approvedTaskNumbers.getText();
	}
	
	public String rejectedTasks()
	{
		System.out.println("Rejected Tasks : " + rejectedTask.getText());
		
		return rejectedTaskNumbers.getText();
	}
}
