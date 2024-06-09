package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu
{
	public Menu(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Dashboard']")
			 WebElement dashboard;
	void clickdashboard()
	{
		dashboard.click();
	}
	@FindBy(xpath="//span[normalize-space()='Clients']") WebElement clients;
	@FindBy(xpath="//a[contains(text(),'Add Client')]") WebElement addClient;
	public void addclient()
	{
		clients.click();
		addClient.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='View Clients']") WebElement viewClients;
	public void viewclient()
	{
		clients.click();
		viewClients.click();
	}

}
