package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Support 
{
	
	
	@FindBy(xpath="//a[contains(text(),'EXPERTISE')]")
	private WebElement company;
	
	@FindBy(xpath="//a[contains(text(),'Web Crawling')]")
	private WebElement web;
	
	public Support(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void aboutEnterprise(WebDriver ref)
	{
		Actions action=new Actions(ref);
		action.moveToElement(company).perform();
		action.click(web);
		
	}
	
	
}
