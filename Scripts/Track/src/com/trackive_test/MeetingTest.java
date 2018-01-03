package com.trackive_test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.trackive_pom.Meeting;

public class MeetingTest extends SuperTestng
{	
	@Test(priority=1)
	public void enterMeeting() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Meeting m=new Meeting(driver);
		m.enterMeetDetails("@tester22_trackive");
	
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		m.enterMeetTime("45 Mins");
		
		Thread.sleep(3000);
		m.clickMeetUpdate();
	}
}
