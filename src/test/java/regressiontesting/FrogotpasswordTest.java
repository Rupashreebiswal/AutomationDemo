package regressiontesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Forgotpassword;
import pages.Login;

public class FrogotpasswordTest
{
	
@Test
	 public void forgotpasswordtest()
	    {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://localhost/ip");
	        
	        Login login = new Login(driver);
	        login.clickForgotPassword();
Forgotpassword forgotpassword=new Forgotpassword(driver);
forgotpassword.settxtemail("rups140888@gmail.com");
forgotpassword.clickreset();

}
}
