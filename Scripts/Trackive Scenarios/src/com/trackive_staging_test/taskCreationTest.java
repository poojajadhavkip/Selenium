package com.trackive_staging_test;

import org.testng.annotations.Test;

import com.trackive_staging_pom.taskCreation;

public class taskCreationTest extends SuperTestNG
{
	@Test
	public void enterAccomplishTask() throws InterruptedException
	{
		taskCreation t=new taskCreation(driver);
		Thread.sleep(2000);
		t.createAccomplishTask("Trackive Script");
		t.createAccomplishTaskTime("2 Hours 15 Mins");
		Thread.sleep(2000);
		t.addAccomlishTask();
	}
}
