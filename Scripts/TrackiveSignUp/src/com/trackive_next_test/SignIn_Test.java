package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.SignIn;

public class SignIn_Test extends SuperTestng
{
	@Test
	public void validLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		SignIn sign=new SignIn(driver);
	
		sign.login("testpooja_trackive@mailinator.com","dontaskpwd");
		sign.loginBtn();
		sign.loginBtn();
	}
}
