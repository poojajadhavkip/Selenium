import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","/home/kiprosh-hp-g6/Desktop/geckodriver");
		//System.setProperty("webdriver.gecko.driver", "./libs/geckodriver.exe");
		WebDriver ref=new FirefoxDriver();
		ref.get("https://www.facebook.com");
		ref.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//WebDriver ref=new FirefoxDriver();
		//ref.get("https://www.facebook.com");
		
		/*
		FacebookLogin fb=new FacebookLogin(ref);
		fb.login("jadhavpooja103@gmail.com", "123456789");
		fb.submit();*/
		
		
		/* METHOD2
		FbLoginMethod2 fb1=new FbLoginMethod2(ref);
		PageFactory.initElements(ref, fb1);
		Thread.sleep(2000);
		fb1.login("jadhavpooja103@gmail.com", "123456789");
		Thread.sleep(2000);
		fb1.submit();
		*/
		
		
		FbLoginMethod2 fb1;
		fb1=PageFactory.initElements(ref, FbLoginMethod2.class);
		fb1.login("jadhavpooja103@gmail.com", "123456789");
		fb1.submit(); 
		
	}

}
