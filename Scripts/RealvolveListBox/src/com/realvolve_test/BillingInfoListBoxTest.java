package com.realvolve_test;

import org.testng.annotations.Test;
import com.realvolve_pom.BillingInfoListBox;


public class BillingInfoListBoxTest extends SuperTestng
{
	@Test
	public void enterSub() throws InterruptedException
	{
		Thread.sleep(3000);
		BillingInfoListBox b=new BillingInfoListBox(driver);
		b.selectSubScription();
		Thread.sleep(2000);
	}
	
	@Test
	public void enterMon() throws InterruptedException
	{
		BillingInfoListBox b1=new BillingInfoListBox(driver);
		Thread.sleep(2000);
		b1.enterExpMonth("May");
		Thread.sleep(2000);
	}
	
	@Test
	public void enetrYear() throws InterruptedException 
	{
		BillingInfoListBox b2=new BillingInfoListBox(driver);
		Thread.sleep(2000);
		b2.enterExpYear();
		Thread.sleep(2000);
	}
}
