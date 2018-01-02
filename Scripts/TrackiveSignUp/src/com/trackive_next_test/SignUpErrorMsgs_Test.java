package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.Error2;
import com.trackive_next_pom.SgnUpPage;
import com.trackive_next_pom.SignIn;
import com.trackive_next_pom.SignUpErrorMsgs;

public class SignUpErrorMsgs_Test extends SuperTestng
{ 
	@Test
	public void SignUpErr1()
	{
		
		SignIn si=new SignIn(driver);
		si.signUpClick();
		si.login("test-trackive@mailinator.com", "dontaskpwd");
		SgnUpPage sm=new SgnUpPage(driver);
		sm.enterDomain("abcde");
		
		si.loginBtn();
		
		SignUpErrorMsgs se1=new SignUpErrorMsgs(driver);
		se1.subDomainError();	
	} 
	
}
