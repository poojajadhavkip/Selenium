package com.realvolve_test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import com.realvolve_pom.RealVolveSignUp;

public class RealVolveSignUpTest extends SuperTestng
{
	@Test(priority=2)
	public void enterBrand() throws InterruptedException
	{
		Thread.sleep(3000);
		RealVolveSignUp rs1=new RealVolveSignUp(driver);
		rs1.selectBrand();
		Thread.sleep(2000);
		
	}
	/*
	@Test(priority=1)
	public void enterCountry() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RealVolveSignUp rs2=new RealVolveSignUp(driver);
		rs2.selectCountry();
	} */
	
}

