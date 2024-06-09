package regressiontesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Login;

public class LoginTest 
{
	 @Test
	    public void logintest()
	    {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://localhost/ip");

	        Login login = new Login(driver);

	        login.setTxtUsername("rups140888@gmail.com");
	        login.setTxtPassword("easyeasy");
	        login.clickLogin();
		 
	    }

}
