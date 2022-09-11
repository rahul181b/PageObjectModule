package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebookLogin {
	
	WebDriver driver;
	
	public facebookLogin(WebDriver driver)
	{
		this.driver=driver;
				
	}
	
		By username=By.xpath("//input[@id='email']");
		By password=By.xpath("//input[@id='pass']");
		
		By submit=By.name("login");
		
		By newPage=By.xpath("//a[@class='_8esh']");
		
		
		public WebElement EmailId()
		{
		return	driver.findElement(username);
		}
		
		public WebElement inputPassword()
		{
			return	driver.findElement(password);
		}
		
		public WebElement submitButton()
		{
			return	driver.findElement(submit);
			
		}
		
		public WebElement createNewAccount()
		{
			return	driver.findElement(newPage);
			
		}
		
	
	

}
