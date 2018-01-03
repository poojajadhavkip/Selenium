package com.trackive_test;

import org.testng.annotations.Test;

import com.trackive_pom.Notification;

public class NotificationTest extends SuperTestng
{
	@Test
	public void clickNotiL() throws InterruptedException
	{
		Notification nt=new Notification(driver);
		nt.clickNotiLogo();
		//nt.getNotification();	
	}
}
