package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.Error3;

public class Error3_Test extends SuperTestng
{
	@Test
	public void emailFormat() throws InterruptedException
	{
		Thread.sleep(2000);
		Error3 e3=new Error3(driver);
		
		e3.login("testpooja_trackive@mailinator.com ", "dontaskpwd");
		e3.errorMsg3();
		e3.clearEmailPwd();
	} 
}
