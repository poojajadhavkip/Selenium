package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.Error4;

public class Error4_Test extends SuperTestng
{
	@Test
	public void pwdWarning() throws InterruptedException
	{
		Thread.sleep(2000);
		Error4 e4=new Error4(driver);
		
		e4.login("testpoo@mailinator.com","");
		e4.loginBtn();
		e4.errorMsg4();
	}
}
