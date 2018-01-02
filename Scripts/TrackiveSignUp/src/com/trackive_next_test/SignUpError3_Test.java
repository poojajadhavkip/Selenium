package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.Error3;
import com.trackive_next_pom.SgnUpPage;
import com.trackive_next_pom.SignIn;

public class SignUpError3_Test extends SuperTestng
{
	@Test
	public void emailFormatInvalid1() throws InterruptedException
	{
		Thread.sleep(2000);
		SignIn si=new SignIn(driver);
		si.signUpClick();
		si.login("testpoo@mailinator.com@.com","dontaskpwd");
		Error3 e3=new Error3(driver);
		e3.loginBtn();
		e3.errorMsg3(); 
	} 
	
	@Test
	public void emailFormatInvalid2() throws InterruptedException
	{
		SgnUpPage sm=new SgnUpPage(driver);
		sm.enterDomain("abcde");
		Error3 e3=new Error3(driver);
		//e3.loginBtn();
		e3.errorMsg3(); 
	} 
}
