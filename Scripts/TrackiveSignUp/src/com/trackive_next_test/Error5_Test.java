package com.trackive_next_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.trackive_next_pom.Error5;

public class Error5_Test extends SuperTestng
{
	@Test
	public void wrongEmailPwd() throws InterruptedException
	{
		driver.findElement(By.name("email")).clear();
				
		//email.clear();
		Thread.sleep(2000);
		Error5 e5=new Error5(driver);
		e5.login("tesrpoojs-trackive@mailinator.com", "dontaskpwd");
		e5.loginBtn();
		e5.errorMsg5();
	}
}
