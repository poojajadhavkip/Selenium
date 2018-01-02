package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.Error1;

public class Error1_Test extends SuperTestng
{
	@Test
	public void inCorrectEmailPwd() throws InterruptedException
	{
		Thread.sleep(2000);
		Error1 e1=new Error1(driver);
	
		e1.login("tespoo@mailinator.com","dontaskpwd");
		e1.loginBtn();
		e1.errorMsg1();
		e1.clearEmailPwd();
		
	}

}
