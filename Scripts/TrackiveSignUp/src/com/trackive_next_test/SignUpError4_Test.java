package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.Error4;
import com.trackive_next_pom.SgnUpPage;
import com.trackive_next_pom.SignIn;

public class SignUpError4_Test extends SuperTestng
{
	@Test
	public void pwdLength1() throws InterruptedException
	{
		Thread.sleep(2000);
		SignIn si=new SignIn(driver);
		si.signUpClick();
		si.login("testpoo@mailinator.com","");
		Error4 e4=new Error4(driver);
		e4.loginBtn();
		e4.errorMsg4();
	} 
	
	@Test
	public void pwdLength2() throws InterruptedException
	{
		Thread.sleep(2000);
		SgnUpPage sm=new SgnUpPage(driver);
		sm.enterDomain("abcde");
		Error4 e4=new Error4(driver);
		e4.loginBtn();
		e4.errorMsg4();
	} 
}
