import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Month 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","/home/kiprosh-hp-g6/Desktop/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://start.realvolve-qa.com/users/sign_up");
		
		 WebElement list = driver.findElement(By.id("date_month"));
		/*
		for(int i=0;i<list.size();i++)
		{
			if(list.equals("May"))
			{
				list.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
		
		System.out.println(list.size());
		for (WebElement rv : list) 
		{
			System.out.println(rv.getText());	
		}   */
		
		Select s=new Select(list);
		System.out.println(list.getText());
		
		//driver.close();
	}
}
