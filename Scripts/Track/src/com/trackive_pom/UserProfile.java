package com.trackive_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfile 
{
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section/section/div/form/section[2]/div[2]/input")
	private WebElement nickName;
	
	//@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section/section/div/form/section[3]/div[2]/input")
	//@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section/section/div/form/section[3]")
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section/section/div/form/section[3]/div[2]/input")
	private WebElement firstName;
	
	@FindBy(xpath="html/body/div[1]/div/section/section/div/section/section/section/section/div/form/section[4]/div[2]/input")
	private WebElement lastName;
	
	public UserProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterInfo() throws InterruptedException
	{
		/*nickName.clear();
		Thread.sleep(2000);
		nickName.sendKeys("pooja");
		firstName.clear();
		Thread.sleep(2000); */
		firstName.sendKeys("Pooja");
		//lastName.clear();
		//Thread.sleep(2000);
		//lastName.sendKeys("jadhav");
	}
}
