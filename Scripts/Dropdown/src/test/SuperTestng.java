package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperTestng 
{
	WebDriver driver;
	@BeforeClass
	public void precondition()
	{
		System.setProperty("webdriver.gecko.driver","/home/kiprosh-hp-g6/Desktop/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.actimind.com");
	}
	
	@AfterClass
	public void postconditioin()
	{
		driver.close();
	}
}
