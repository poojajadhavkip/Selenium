package com.trackive_staging_test;

import org.testng.annotations.Test;

import com.trackive_staging_pom.completeTasks;

public class completeTasksTest extends SuperTestNG
{
	@Test
	public void completeTheTask() throws InterruptedException
	{
		completeTasks ct=new completeTasks(driver);
		Thread.sleep(2000);
		ct.completeTask();
		Thread.sleep(2000);
		
		
	}
}
