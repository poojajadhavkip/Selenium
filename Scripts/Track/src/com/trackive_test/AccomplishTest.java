package com.trackive_test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.trackive_pom.Accomplish;


public class AccomplishTest extends SuperTestng
{

	@Test(priority=1)
	public void enterTask() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Accomplish ac=new Accomplish(driver);
		ac.enterTask("Explore trackive");
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ac.enterTime("15 Mins");
		
		Thread.sleep(3000);
		ac.clickUpdate();
	}
	
	@Test(priority=2)
	public void enterTask2() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Accomplish ac=new Accomplish(driver);
		ac.enterTask("ABCD");
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ac.enterTime("20 Mins");
		
		Thread.sleep(3000);
		ac.clickUpdate();
	}
	
	
}
