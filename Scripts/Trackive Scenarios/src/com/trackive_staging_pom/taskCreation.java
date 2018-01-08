package com.trackive_staging_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taskCreation 
{
	//WHAT I WILL ACCOMPLISH
	@FindBy(xpath="//textarea[@placeholder='I will Accomplish']")
	private WebElement accomplishTask;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[1]/section/section[2]/div/section/div/div/div/span[1]/div[1]")
	private WebElement accomplishTaskTime;
	
	@FindBy(className="ljpmUn")
	private WebElement accomplishAddUpdateBtn;
	
	//HELP NEEDED
	@FindBy(xpath="//textarea[@placeholder='Help I Need']")
	private WebElement helpNeedTask;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[2]/section/section[2]/div/section/div/div/div/span[1]/div[1]")
	private WebElement helpNeedTaskTime;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[1]/section/section[2]")
	private WebElement helpNeedAddUpdateBtn;
	
	//MEETING
	@FindBy(xpath="//textarea[@placeholder='Meeting I am Planning']")
	private WebElement meetingTask;
	
	//@FindBy(className="Select-arrow-zone")
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[2]/section/div/div/section/section/section[2]/div/div[1]/div[1]/section/section/section[3]/section/section[2]/div/section/div/div/div/span[1]/div[1]")
	private WebElement meetingTaskTime;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section[1]/section/section/div/div[1]/div[1]")
	private WebElement meetingTaskAddUpdateBtn;
	
	public taskCreation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//WHAT I WILL ACCOMPLISH
	public void createAccomplishTask(String task)
	{
		accomplishTask.sendKeys(task);
	}
	
	public void createAccomplishTaskTime(String aTime)
	{
		accomplishTaskTime.click();
		accomplishTaskTime.sendKeys(aTime);
		accomplishTaskTime.sendKeys(Keys.ENTER);
	}
	
	public void addAccomlishTask()
	{
		accomplishAddUpdateBtn.click();
	}
	
	//HELP NEEDED
	public void createHelpNeeded(String help)
	{
		helpNeedTask.sendKeys(help);
	}
	
	public void createHelpNeedTime(String hTime)
	{
		helpNeedTaskTime.click();
		helpNeedTaskTime.sendKeys(hTime);
		helpNeedTaskTime.sendKeys(Keys.ENTER);
	}
	
	public void addHelpNeed()
	{
		helpNeedAddUpdateBtn.click();
	}
	
	//MEETING
	public void createMeeting(String meet)
	{
		meetingTask.sendKeys(meet);
	}
	
	public void createMeetingTime(String mTime)
	{
		meetingTaskTime.click();
		meetingTaskTime.sendKeys(mTime);
		meetingTaskTime.sendKeys(Keys.ENTER);
	}
	
	public void addMeeting()
	{
		meetingTaskAddUpdateBtn.click();
	}
}
