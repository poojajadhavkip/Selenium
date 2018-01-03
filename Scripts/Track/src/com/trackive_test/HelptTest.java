package com.trackive_test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.trackive_pom.Help;

public class HelptTest extends SuperTestng
{

	@Test
	public void enterHelpNeed() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Help h=new Help(driver);
		h.enterHelp("@tester25_trackive");
		
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		h.enterHelpTime("30 Mins");
		
		Thread.sleep(4000);
		h.clickHelpUpdate();
	}
}
