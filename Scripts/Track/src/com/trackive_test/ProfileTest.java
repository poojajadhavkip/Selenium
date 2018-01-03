package com.trackive_test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.trackive_pom.Profile;
import com.trackive_pom.UserProfile;

public class ProfileTest extends SuperTestng
{
	@Test(priority=1)
	public void clickP() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Profile p=new Profile(driver);
		Thread.sleep(2000);
		p.clickPic();
		Thread.sleep(2000);
		p.profileOption();	
	}
	
	@Test
	public void fillInfo() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		UserProfile up=new UserProfile(driver);
		up.enterInfo();
	}
}
