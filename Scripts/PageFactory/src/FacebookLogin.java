import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin 
{
	//Declaration
	@FindBy(id="email") private WebElement email;
	@FindBy(id="pass") private WebElement password;
	@FindBy(id="loginbutton") private WebElement loginBtn;
	
	//Initialization
	
	
	//usage
	
	public FacebookLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
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
