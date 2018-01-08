package com.trackive_staging_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.trackive_staging_pom.ProfileList;
import com.trackive_staging_pom.SignIn;

public class SuperTestNG 
{
	WebDriver driver;
	
	@BeforeClass
	public void preConditions() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","/home/kiprosh-hp-g6/Desktop/geckodriver");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://trackive-staging.com/signin");
		
		Thread.sleep(3000);
		
		SignIn signin=new SignIn(driver);
		signin.emailPwd("tester21_trackive@mailinator.com", "password");
		signin.logInBtn();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void postConditions() throws InterruptedException
	{
		ProfileList profilelist=new ProfileList(driver);
		profilelist.clickPic();
		Thread.sleep(2000);
		profilelist.signOutOption();
		driver.close();
	}
}
