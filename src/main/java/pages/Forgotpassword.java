package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Forgotpassword
{
	@FindBy(xpath="//input[@id='email']")
	WebElement txtemail;
	@FindBy(xpath="//button[normalize-space()='Reset password']")
	WebElement resetbtn;
	 public Forgotpassword(WebDriver driver)
	    {
	        PageFactory.initElements(driver,this);
	    }
	
	
	
	public void settxtemail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void clickreset()
	{
		resetbtn.click();
	}

}
