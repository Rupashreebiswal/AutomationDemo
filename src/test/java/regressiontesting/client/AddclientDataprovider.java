package regressiontesting.client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Login;
import pages.Menu;
import pages.client.Addclient;

import static utility.ForDataprovider.getMyData;

import java.io.IOException;
import java.util.ArrayList;

public class AddclientDataprovider 
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
@Test(dataProvider="getData" )
public void AddClienttest(String clientName, String clientSurname, String language, String streetAddress1,
        String streetAddress2, String city, String state, String zipCode, String country,
        String gender, String birthDate, String phoneNumber, String faxNumber,
        String mobileNumber, String emailAddress, String webAddress, String vatId,
        String taxesCode)
{
	
	
	Menu menu=new Menu(driver);
	menu.addclient();
	Addclient Addclientpage=new Addclient(driver);
	
	
	
	
	 Addclientpage.setClientName(clientName);
     Addclientpage.setclientSurname(clientSurname);
     Addclientpage.setLanguage(language);
     Addclientpage.setStreetAddress1(streetAddress1);
     Addclientpage.setStreetAddress2(streetAddress2);
     Addclientpage.setCity(city);
     Addclientpage.setState(state);
     Addclientpage.setZipCode(zipCode);
     Addclientpage.setCountry(country);
     Addclientpage.setGender(gender);
     Addclientpage.setBirthDate(birthDate);
     Addclientpage.setPhoneNumber(phoneNumber);
     Addclientpage.setFaxNumber(faxNumber);
     Addclientpage.setMobileNumber(mobileNumber);
     Addclientpage.setEmailAddress(emailAddress);
     Addclientpage.setWebAddress(webAddress);
     Addclientpage.setVATID(vatId);
     Addclientpage.setTaxesCode(taxesCode);
     Addclientpage.clickSave();
    
     }
 



 @DataProvider
 Object[][] getData() throws IOException {
    return getMyData("Data/Data12.xlsx","Sheet2");
 }
 

}






