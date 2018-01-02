package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Image 
{
	@FindBy(xpath="//p[contains(text(),'Cloud')]")
	private WebElement cloud;
	
	public Image(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCloud(WebDriver ref)
	{
		Actions action=new Actions(ref);
		action.moveToElement(cloud).perform();
		action.contextClick().perform();
		action.sendKeys("k").perform();
	}
	
}
