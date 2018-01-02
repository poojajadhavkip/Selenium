package com.trackive_next_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.trackive_next_pom.ResetPwd;

public class ResetPwd_Test 
{
	@Test
	public void enterPwdClickChangePwd()
	{
		System.setProperty("webdriver.chrome.driver","/Users/kiproshmbpro/Desktop/chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mailinator.com/v2/inbox.jsp#/#msgpane");
		ResetPwd rsp=new ResetPwd(driver);
		rsp.enterPwd("dontaskpwd");
		rsp.clickReset();
	}
}
