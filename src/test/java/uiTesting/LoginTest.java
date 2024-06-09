package uiTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static uiTesting.util.UITests.*;
import static uiTesting.util.UITests.checkEnability;
import static uiTesting.util.UITests.spellCheck;
import static uiTesting.util.UITests.valueofAttribute;


import pages.Login;
import uiTesting.util.UITests;

public class LoginTest 
{
	WebDriver driver;
	Login login ;
	@BeforeClass
	public void initlogin()
	{
		
	
	 driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://localhost/ip");

     login = new Login(driver);

     login.setTxtUsername("rups140888@gmail.com");
     login.setTxtPassword("easyeasy");

}
	@Test
	public void checkTxtUsernameVisibility()
	{
		boolean expected=true;
		/*boolean actual=false;
		try
		{
		actual=login.txtUsername.isDisplayed();
		}
		catch(Exception e)
		{
		
		}*/
		  boolean actual = checkVisibility(login.txtUsername);
Assert.assertEquals(actual, expected,"username textbox is absent" );
	}
	
	@Test
	public void checkTxtpasswordVisibility()
	{
		boolean expected=true;
		boolean actual=checkVisibility(login.txtPassword);
		Assert.assertEquals(expected, actual,"");
	}
	@Test
	public void checkTxtusernameEnablity()
	{
		 boolean expected = true;
	        boolean actual = checkEnability(login.txtPassword);
	        Assert.assertEquals(actual,expected,"");
		}
	@Test
	public void checkTxtpasswordEnablity()
	{
		boolean expected=true;
		boolean actual=checkEnability(login.txtPassword);
		Assert.assertEquals(actual, expected,"");
	}
	@Test
	public void checkLblEmailSpell()
	{
		String expected="Email";
		String actual=spellCheck(login.lblEmail);
		System.out.println("expected="+expected);
		System.out.println("actual="+actual);
		Assert.assertEquals(actual, expected,"");
	}
	@Test
	public void checkLblPasswordSpell()
	{
		String expected="Password";
		String actual=spellCheck(login.lblPassword);
		System.out.println("expected="+expected);
		System.out.println("actual="+actual);
		Assert.assertEquals(actual, expected,"");
		
	}
	@Test
	public void checkTxtPasswordkWaterMark() {
		String expected="Password";
		String actual=valueofAttribute(login.txtPassword,"placeholder") ;
		System.out.println("expected="+expected);
		System.out.println("actual="+actual);
		Assert.assertEquals(actual, expected,""	);
		Assert.assertEquals(actual, expected,"");
		
	}
	@Test
	public void checkTxtUsernamelWaterMark() {
		String expected="Username";
		String actual=valueofAttribute(login.txtUsername,"placeholder");
		System.out.println("expected="+expected);
		System.out.println("actual="+actual);
	}
	@Test
	public void checkLblEmailfontsize()
	{
		String expected="14px";
		String actual=StylevalueofElement(login.lblEmail,"font-size");
		System.out.println("expected="+expected);
		System.out.println("actual="+actual);
		Assert.assertEquals(actual, expected,"");
		
	}
	@Test
	public void checkLblEmailFontFamily()
	{
		String expected="-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
		String actual=StylevalueofElement(login.lblEmail,"font-family");
		System.out.println("expected="+expected);
		System.out.println("actual="+actual);
		Assert.assertEquals(actual, expected,"incorrectfontfamily");
		
	}
	@Test
	public void checkBtnLoginColor()
	{
		String expected= "#2C8EDD"; 
		String rgbColor=StylevalueofElement(login.btnLogin,"background-color");
		String actual=Color.fromString(rgbColor).asHex().toUpperCase();
		System.out.println("expected="+expected);
		System.out.println("actual="+actual);
		Assert.assertEquals(actual, expected,"incorrectbackground-color");
		
		
		
	}
	
	
}
