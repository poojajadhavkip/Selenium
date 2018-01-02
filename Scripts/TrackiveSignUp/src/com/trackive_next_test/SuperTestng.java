package com.trackive_next_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperTestng 
{
	WebDriver driver;
	
	@BeforeClass
	public void preconditions() 
	{
		
		
		System.setProperty("webdriver.chrome.driver","/home/kiprosh-hp-g6/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://trackive-next.com");
	}
	
	@AfterClass
	public void postcondition() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
}
