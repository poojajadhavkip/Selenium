package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.Support;

public class SupportTest extends SuperTestng
{
	@Test(priority=1)
	public void move() throws InterruptedException
	{
		
		Support s=new Support(driver);
		Thread.sleep(2000);
		s.aboutEnterprise(driver);
	}
	
	@Test(priority=2)
	public void clickOnWebCrawling() throws InterruptedException
	{
		
		Support s1=new Support(driver);
		Thread.sleep(2000);
		s1.aboutEnterprise(driver);
	}
}
