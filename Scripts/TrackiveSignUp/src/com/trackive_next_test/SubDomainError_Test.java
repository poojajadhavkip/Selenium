package com.trackive_next_test;

import org.testng.annotations.Test;
import com.trackive_next_pom.SignIn;
import com.trackive_next_pom.SubDomainError;

public class SubDomainError_Test extends SuperTestng
{
	@Test
	public void domainRequired()
	{
		SignIn si=new SignIn(driver);
		si.signUpClick();
		si.login("test-trackive@mailinator.com", "dontaskpwd");
		si.loginBtn();
		SubDomainError sd=new SubDomainError(driver);
		sd.subDomainErrMsg();		
	}
}
