package com.realvolve_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperTestng 
{
	WebDriver driver;
	@BeforeClass
	public void precondition()
	{
		System.setProperty("webdriver.gecko.driver","/home/kiprosh-hp-g6/Desktop/geckodriver");
		driver=new FirefoxDriver();
		driver.get("http://start.realvolve-qa.com/users/sign_up");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(arg0);
	}
	
	@AfterClass
	public void postcondition() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
