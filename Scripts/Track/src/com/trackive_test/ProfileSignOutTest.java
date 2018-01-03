package com.trackive_test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.trackive_pom.Profile;

public class ProfileSignOutTest extends SuperTestng
{
	@Test
	public void clickSignOut() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Profile p=new Profile(driver);
		Thread.sleep(2000);
		p.clickPic();
		p.signOutOption();
	}
}
