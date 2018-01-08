package com.trackive_staging_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.trackive_staging_pom.Stats;
import com.trackive_staging_pom.completeTasks;
import com.trackive_staging_pom.taskCreation;

public class StatsTest extends SuperTestNG
{
	
	@Test(priority=1)
	public void getPlannedTasksValue() throws InterruptedException
	{
		Stats s=new Stats(driver);
		
		s.plannedTasks();
		System.out.print("Total Planned Tasks :");
		String str1=(String) s.plannedTasks();

		taskCreation t1=new taskCreation(driver);
		Thread.sleep(2000);
		t1.createAccomplishTask("Trackive");
		t1.createAccomplishTaskTime("1 Hours");
		Thread.sleep(2000);
		t1.addAccomlishTask();
		
		System.out.print("Total Updated Tasks : ");
		String str2=(String) s.plannedTasks();
		
		
		if(str1.equals(str2))
		{
			Assert.fail();
		}
		else
		{
			System.out.println("Pass : Not Equal");
		}
		Thread.sleep(2000);
	}
	

	@Test(priority=2)
	public void getCompletedTasksValue() throws InterruptedException
	{
		Stats s=new Stats(driver);
		
		s.completedTasks();
		String str1=(String) s.completedTasks();
		System.out.println(str1);

		completeTasks ct=new completeTasks(driver);
		Thread.sleep(2000);
		ct.completeTask();
		Thread.sleep(2000);
		
		System.out.print("Total Approved Tasks : ");
		String str2=(String) s.completedTasks();
		System.out.println(str2);
		
		if(str1.equals(str2))
		{
			Assert.fail();
		}
		else
		{
			System.out.println("Pass : Not Equal");
		}
		Thread.sleep(2000);
		
	}
	
	@Test(priority=3)
	public void getApprovedTasksValue() throws InterruptedException
	{
		Stats s1=new Stats(driver);
		String str1=(String) s1.approvedTasks();
		System.out.println(str1);


		completeTasks ct=new completeTasks(driver);
		Thread.sleep(2000);
		ct.completeTask();
		Thread.sleep(2000);
		
		//s.completedTasks();
		String str2=(String) s1.approvedTasks();
		System.out.println(str2);
		
		if(str1.equals(str2))
		{
			Assert.fail();
		}
		else
		{
			System.out.println("Pass : Not Equal");
		}
		Thread.sleep(2000);
	}

}
