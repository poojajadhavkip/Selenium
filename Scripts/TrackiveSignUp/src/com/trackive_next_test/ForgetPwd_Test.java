package com.trackive_next_test;

import org.testng.annotations.Test;

import com.trackive_next_pom.ForgetPwd;
import com.trackive_next_pom.SignIn;

public class ForgetPwd_Test extends SuperTestng
{
	@Test
	public void enterEmailClickSendpwd()
	{
		SignIn sf=new SignIn(driver);
		sf.forgetPassword();
		
		ForgetPwd fp=new ForgetPwd(driver);
		fp.enterEmail("testpooja_trackie@mailinator.com");
		
		fp.clickSendPwd();
	}

}
