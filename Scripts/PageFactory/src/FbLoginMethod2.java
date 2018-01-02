import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLoginMethod2 
{
	@FindBy(id="email") private WebElement email;
	@FindBy(id="pass") private WebElement password;
	@FindBy(id="loginbutton") private WebElement loginBtn;
	
	public FbLoginMethod2(WebDriver driver)
	{
		
	}
	
	public void login(String em,String pwd)
	{
		email.sendKeys(em);
		password.sendKeys(pwd);
	}
	
	public void submit()
	{
		loginBtn.click();
	}
	
}
