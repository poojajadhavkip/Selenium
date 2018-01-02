package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.SgnUpPage;
import com.trackive_next_pom.SignIn;

public class SgnUpPage_Test extends SuperTestng
{
	@Test
	public void clickSignUp() throws InterruptedException
	{
		SignIn s1=new SignIn(driver);
		Thread.sleep(2000);
		s1.signUpClick();
	}
	
	@Test
	public void fillInfo() throws InterruptedException
	{
		SignIn s2=new SignIn(driver);
		Thread.sleep(2000);
		s2.login("testpoo_trackive@mailinator.com", "dontaskpwd");
		SgnUpPage sp=new SgnUpPage(driver);
		sp.enterDomain("Abcde");
		
		s2.loginBtn();
	}
}
