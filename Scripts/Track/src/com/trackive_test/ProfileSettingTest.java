package com.trackive_test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.trackive_pom.Profile;
import com.trackive_pom.SettingPage;

public class ProfileSettingTest extends SuperTestng
{
	@Test(priority=1)
	public void clickSettting() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Profile p=new Profile(driver);
		Thread.sleep(2000);
		p.clickPic();
		p.settingOption();
	}
	
	@Test(priority=2)
	public void changePwd() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		SettingPage sp=new SettingPage(driver);
		sp.enterPwd("password","password");
		//sp.enterPwd("password","passw");
	}
}
