package com.realvolve_pom;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RealVolveSignUp 
{
	WebDriver driver;
	@FindBy(id="user_brand_id")
	private WebElement selectBrand;
	
	@FindBy(xpath="//div[@className='input country optional user_billing_country_code']//select[@className='country optional select_country_code']")
	private WebElement selectCountry;
	
	
	
	public RealVolveSignUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectBrand() throws InterruptedException
	{
		selectBrand.click();
		Select brand=new Select(selectBrand);
		brand.selectByIndex(8);		
		//brand.selectByValue("Coldwell Banker");
		Thread.sleep(3000);
		//selectBrand.sendKeys(Keys.ENTER);
		brand.selectByVisibleText("Coldwell Banker");
		//brand.getFirstSelectedOption();
		//brand.selectByVisibleText("Real Living");	
	}
	
	public void selectCountry()
	{
		Select country=new Select(selectCountry);
		String id=selectCountry.getAttribute("id");
		((JavascriptExecutor)driver).executeScript("$('#id').click();");
		country.selectByIndex(4);
	} 
}

 