package com.trackive_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.trackive_pom.LoginPage;

public class SuperTestng 
{
    WebDriver driver;
	
	@BeforeClass
	public void preconditions() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","/home/kiprosh-hp-g6/Desktop/geckodriver");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("http://trackive-staging.com/signin");
		driver.get("http://kiprosh.trackive.com");
		Thread.sleep(2000);
		
		LoginPage l=new LoginPage(driver);
		l.login();
		l.loginBtn();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/*
	@AfterClass
	public void postcondition() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}  */
}
