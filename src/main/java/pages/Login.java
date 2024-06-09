package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	  @FindBy (id="email")
	    public WebElement txtUsername;
	    @FindBy (id = "password")
	    public WebElement txtPassword;
	    @FindBy (xpath = "//button")
	     public WebElement btnLogin;
	    @FindBy(xpath="//label[@for='email']")
	    public WebElement lblEmail;
	    @FindBy(xpath="//label[@for='password']")
	    public WebElement lblPassword; 
	    my first github

	    @FindBy (xpath = "//a")
	    WebElement forgotPassword;
	    public void clickForgotPassword()
	    {
	        forgotPassword.click();
	    }

	    public Login(WebDriver driver)
	    {
	        PageFactory.initElements(driver,this);
	    }
	    public void setTxtUsername(String username)
	    {
	        txtUsername.sendKeys(username);
	    }
	    public void setTxtPassword(String password)
	    {
	        txtPassword.sendKeys(password);
	    }
	    public void clickLogin()
	    {
	        btnLogin.click();
	    }
	}



