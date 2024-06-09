package databasetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Login;
import pages.Menu;
import pages.client.Addclient;

public class AddclientTest
{
	WebDriver driver;
	@BeforeClass
	public void dologin()
	{
	 driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://localhost/ip");

     Login login = new Login(driver);

     login.setTxtUsername("rups140888@gmail.com");
     login.setTxtPassword("easyeasy");
     login.clickLogin();
}
	@Test
	public void AddClienttest()
	{
		Menu menu=new Menu(driver);
		menu.addclient();
		Addclient Addclientpage=new Addclient(driver);
		
		
		;
		
		Addclientpage.setClientName("jhon");
		Addclientpage.setclientSurname("Doe");
		Addclientpage.setLanguage("Spanish");
		Addclientpage.setStreetAddress1("123 Main St");
		Addclientpage.setStreetAddress2("Apt 101");
		Addclientpage.setCity("New York");
        Addclientpage.setState("NY");
        Addclientpage.setZipCode("10001");
        Addclientpage.setCountry("India"); 
        Addclientpage.setGender("Female");
		Addclientpage.setBirthDate("08/08/1988");
        
        Addclientpage.setPhoneNumber("9867543212");
        Addclientpage.setFaxNumber("555-5678");
        Addclientpage.setMobileNumber("555-9876");
        Addclientpage.setEmailAddress("john.doe@example.com");
        Addclientpage.setWebAddress("www.example.com");
        Addclientpage.setVATID("123456789");
        Addclientpage.setTaxesCode("TAX-123");
        
        Addclientpage.clickSave();
    }

		
	}

