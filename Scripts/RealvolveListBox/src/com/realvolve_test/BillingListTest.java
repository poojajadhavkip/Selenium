package com.realvolve_test;

import org.testng.annotations.Test;

import com.realvolve_pom.BillingInfoListBox;
import com.realvolve_pom.BillingList;

public class BillingListTest extends SuperTestng
{
	@Test
	public void selectMon() throws InterruptedException
	
	{
			BillingList b1=new BillingList(driver);
			Thread.sleep(2000);
			b1.enterExpMonth();
			Thread.sleep(2000);
	}
	
	@Test
	public void selectYear() throws InterruptedException
	{
		BillingList b1=new BillingList(driver);
		Thread.sleep(2000);
		b1.enterExpYear();
		Thread.sleep(2000);
	}
	
}
