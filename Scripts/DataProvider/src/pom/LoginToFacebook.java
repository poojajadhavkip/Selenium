package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.GeckoDriverService;

public class LoginToFacebook 
{
		WebDriver driver;
	@Test(dataProvider="FbData")
	public void loginToFB(String em,String pwd) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","/home/kiprosh-hp-g6/Desktop/geckodriver");
		//System.setProperty("webdriver.gecko.driver", "./libs/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(em);
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		Assert.assertFalse(driver.getTitle().equals("Log in to Facebook | Facebook"),"InCorrect email or password");
		
		System.out.println("Webpage title verified :");
		
	}
	/*
	@Override
	protected File findDefaultExecutable() 
	{
	      return findExecutable(
	        "geckodriver", GECKO_DRIVER_EXE_PROPERTY,
	        "https://github.com/mozilla/geckodriver",
	        "https://github.com/mozilla/geckodriver/releases");
	   }
	*/
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name="FbData")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="admin";
		data[0][1]="manager";
		
		data[1][0]="jadhavpooja103@gmail.com";
		data[1][1]="saminprachi";
		
		data[2][0]="admin2";
		data[2][1]="manager2";
		
		return data;
	}
	

}
