package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.Error2;
import com.trackive_next_pom.SgnUpPage;
import com.trackive_next_pom.SignIn;

public class SignUpError2_Test extends SuperTestng 
{
	@Test
	public void emailReq1() throws InterruptedException
	{
		Thread.sleep(2000);
		SignIn si=new SignIn(driver);
		si.signUpClick();
		si.login("","dontaskpwd");
		Error2 e2=new Error2(driver);
		e2.errorMsg2();
	}
	
	@Test
	public void emailReq2()
	{
		SgnUpPage sm=new SgnUpPage(driver);
		sm.enterDomain("abcde");
		Error2 e2=new Error2(driver);
		e2.errorMsg2();
		
	}
}
