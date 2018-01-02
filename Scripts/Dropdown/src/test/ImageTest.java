package test;

import org.testng.annotations.Test;

import pom.Image;


public class ImageTest extends SuperTestng
{
	@Test(priority=1)
	public void move() throws InterruptedException
	{
		
		Image i=new Image(driver);
		Thread.sleep(2000);
		i.clickOnCloud(driver);
	}	
}
