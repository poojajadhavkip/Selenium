package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.Error2;

public class Error2_Test extends SuperTestng
{

	@Test
	public void emptyEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		Error2 e2=new Error2(driver);
		
		e2.login("","dontaskpwd");
		e2.errorMsg2();
		e2.clearEmailPwd();
	}
}
